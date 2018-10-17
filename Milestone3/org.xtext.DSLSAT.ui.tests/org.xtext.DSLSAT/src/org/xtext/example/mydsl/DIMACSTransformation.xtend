package org.xtext.example.mydsl

import java.util.HashMap
import org.xtext.example.mydsl.dSLSAT.Form
import org.xtext.example.mydsl.dSLSAT.Var
import org.xtext.example.mydsl.dSLSAT.AndForm
import org.xtext.example.mydsl.dSLSAT.OrForm
import org.xtext.example.mydsl.dSLSAT.NotForm
import org.xtext.example.mydsl.dSLSAT.ImplForm
import org.xtext.example.mydsl.dSLSAT.NandForm
import org.xtext.example.mydsl.dSLSAT.BiImplForm
import org.eclipse.emf.common.util.URI
import java.io.PrintWriter
import java.io.FileOutputStream

class DIMACSTransformation {
	var DIMACSRepr = "";
	var varTab = new HashMap() 
	var nbVar = 0
	var nbClause = 1
	
	def saveDIMACS(Form form, FileOutputStream fos){
		var output = new PrintWriter(fos);
		output.write(formInDIMACS(form))
		output.close()
	}
	
	/**
	 * Work in progress
	 * works for cnf, trying to add other cases
	 * (ugly and not fully working for now)
	 */
	def void traverseGraphForDIMACS(Form f, Boolean isNeg)
	{
		if(f instanceof AndForm){
			var af = f as AndForm;
			traverseGraphForDIMACS(af.left, isNeg);
			
			// pour permettre la negation 
			if(! isNeg){nbClause++;DIMACSRepr+="0\n"}
			
			traverseGraphForDIMACS(af.right, isNeg);
		}else if(f instanceof OrForm){
			var of = f as OrForm;
			traverseGraphForDIMACS(of.left, isNeg);
			
			if(isNeg){nbClause++;DIMACSRepr+="0\n"}
			
			traverseGraphForDIMACS(of.right, isNeg);
		}else if(f instanceof BiImplForm){
			// (a<=>b) <=> (non a ou b) et (non b ou a)
			var of = f as BiImplForm

			traverseGraphForDIMACS(of.left, !isNeg)
			traverseGraphForDIMACS(of.right, isNeg)
			nbClause++
			DIMACSRepr+="0\n"
			traverseGraphForDIMACS(of.right, !isNeg)
			traverseGraphForDIMACS(of.left, isNeg)
		}else if(f instanceof NandForm){
			// a | b <=> non a ou non b
			var of = f as NandForm;
			if(isNeg){
				traverseGraphForDIMACS(of.left, isNeg)
				nbClause++
				DIMACSRepr+="0\n"
				traverseGraphForDIMACS(of.right, isNeg)
			}else{
				traverseGraphForDIMACS(of.left, !isNeg)
				traverseGraphForDIMACS(of.right, !isNeg)
			}
		}else if(f instanceof ImplForm){
			// a => b <=> non a ou b
			// non (a=>b) <=> a et non b
			var of = f as ImplForm
			if(isNeg){
				traverseGraphForDIMACS(of.left, isNeg)
				nbClause++
				DIMACSRepr+="0\n";
				traverseGraphForDIMACS(of.right, !isNeg)
			}else{
				traverseGraphForDIMACS(of.left, !isNeg)
				traverseGraphForDIMACS(of.right, isNeg)
			}
		}else if (f.form instanceof Var){
			addVar(f.form as Var, isNeg)
		}else if(f.form instanceof NotForm){
			traverseGraphForDIMACS(f.form as Form, !isNeg)
		}else if(f.form instanceof Form){
			traverseGraphForDIMACS(f.form as Form, isNeg)
		}
		
	}
	
	def addVar(Var v, boolean isNeg)
	{
		//System.out.println("adding "+v.id);
		if(varTab.get(v.id) == null){
			nbVar++;
			varTab.put(v.id, nbVar);
		}
		if(isNeg){
			DIMACSRepr+="-";
		}
		DIMACSRepr+=Integer.toString(varTab.get(v.id) as Integer)+" ";

	}
	
	def formInDIMACS(Form form){
		traverseGraphForDIMACS(form, false);
		DIMACSRepr="c generated from DSLSAT\nc\np cnf "+nbVar+" "+nbClause+"\n"+DIMACSRepr+"0";
		return DIMACSRepr;
	}
	
	
}
