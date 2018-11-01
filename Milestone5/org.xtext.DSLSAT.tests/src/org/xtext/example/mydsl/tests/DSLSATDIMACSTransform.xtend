package org.xtext.example.mydsl.tests

import org.xtext.example.mydsl.dSLSAT.impl.DSLSATFactoryImpl
import java.util.HashMap
import org.xtext.example.mydsl.dSLSAT.Form
import org.xtext.example.mydsl.dSLSAT.AndForm
import org.xtext.example.mydsl.dSLSAT.Var
import org.xtext.example.mydsl.dSLSAT.NotForm
import org.xtext.example.mydsl.dSLSAT.OrForm
import java.io.FileOutputStream
import java.io.PrintWriter
import org.xtext.example.mydsl.dSLSAT.BiImplForm
import org.xtext.example.mydsl.dSLSAT.ImplForm
import org.xtext.example.mydsl.dSLSAT.NandForm

class DSLSATDIMACSTransform {
	val dslFact = new DSLSATFactoryImpl
	var varList = new HashMap
	var variableCpt = 0
	var nbClauses = 1
	
	def transformAndSaveAsDIMACS(Form form, String path){
		var output = new PrintWriter(new FileOutputStream(path));
		output.write(formToDIMACS(form))
		output.close()
	}
	
	def getVar(String varName){
		return varList.get(varName)
	}
	
	def addVar(String varName) {
		if(varList.get(varName) == null){
			variableCpt++
			varList.put(varName, variableCpt)
		}
	}
	
	def traverseCNF(Form f, boolean isNeg)
	{	
		//System.out.println(f)
		var ret = ""
		switch(f){
			case (f instanceof AndForm):
			{
				nbClauses +=1
				ret += traverseCNF((f as AndForm).left, isNeg)
				ret += "0\n"
				ret += traverseCNF((f as AndForm).right, isNeg)
			}
			case (f instanceof OrForm):
			{
				ret += traverseCNF((f as OrForm).left, isNeg)
				ret += traverseCNF((f as OrForm).right, isNeg)
			}
			case (f instanceof NotForm):
			{
				ret += traverseCNF((f as NotForm).form as Form, ! isNeg)
			}
			default:
			{
				if(f.form instanceof Form){
					ret += traverseCNF(f.form as Form, isNeg)
				}else if(f.form instanceof Var){
					this.addVar((f.form as Var).id)
					if(isNeg){
						ret += "-"
					}
					ret += this.getVar((f.form as Var).id)+" "
				}else if(f.form instanceof NotForm){
					ret += traverseCNF(f.form as NotForm, isNeg)
				}
			}
		}
		
		return ret;
	}
	
	def toCNF(Form f, boolean isNeg)
	{
		/*
		var ret = dslFact.createForm
		
		switch f
		{
			case f instanceof BiImplForm:	
			{
				
			}		
			case f instanceof ImplForm:
			{
				if(isNeg){
					var r = dslFact.createAndForm
					r.left = (f as OrForm).left
					r.right = toCNF((f as OrForm).right, !isNeg) as Form
					return r;
				}else{
					var r = dslFact.createOrForm
					r.left = toCNF((f as OrForm).left, !isNeg) as Form
					r.right = (f as OrForm).right
					return r;
				}
			}
			case f instanceof OrForm:
			{
				if(isNeg){
					var r = dslFact.createAndForm
					r.left = (f as OrForm).left
					r.right = toCNF((f as OrForm).right, isNeg) as Form
					return r;
				}else{
					(f as OrForm).left = toCNF((f as OrForm).left, isNeg) as Form
					(f as OrForm).right = toCNF((f as OrForm).right, isNeg) as Form
				}
			}
			case f instanceof AndForm:
			{
				if(isNeg){
					var r = dslFact.createOrForm
					r.left = (f as AndForm).left
					r.right = toCNF((f as AndForm).right, isNeg) as Form
					return r;
				}else{
					(f as AndForm).left = toCNF((f as AndForm).left, isNeg) as Form
					(f as AndForm).right = toCNF((f as AndForm).right, isNeg) as Form
				}
			}
			case f instanceof NandForm:
			{
				
			}
			case f instanceof NotForm:
			{
				if(isNeg){
					return toCNF(f.form as NotForm, !isNeg)
				}else{
					return toCNF(f.form as Form, isNeg)
				}
			}
			default:
			{
				if(f.form instanceof Var){
					return f
				}else if (f.form instanceof NotForm){
					f.form = toCNF(f.form as NotForm, isNeg) as Form
				}else{
					f.form = toCNF(f.form as NotForm, isNeg) as Form
				}
			}
		}
		// put formula in CNF
		return ret;*/
		return f;
	}
	
	def formToDIMACS(Form f)
	{
		var tmp = traverseCNF(toCNF(f, false), false);
		var ret = "c generated from DSLSAT\nc\np cnf "
		ret += variableCpt+" "+nbClauses+"\n"
		ret += tmp
		ret += "0\n"
		
		return ret;
	}
	
}