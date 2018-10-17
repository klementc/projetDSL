package org.xtext.example.mydsl;

import com.google.common.base.Objects;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import org.eclipse.emf.ecore.EObject;
import org.xtext.example.mydsl.dSLSAT.AndForm;
import org.xtext.example.mydsl.dSLSAT.BiImplForm;
import org.xtext.example.mydsl.dSLSAT.Form;
import org.xtext.example.mydsl.dSLSAT.ImplForm;
import org.xtext.example.mydsl.dSLSAT.NandForm;
import org.xtext.example.mydsl.dSLSAT.NotForm;
import org.xtext.example.mydsl.dSLSAT.OrForm;
import org.xtext.example.mydsl.dSLSAT.Var;

@SuppressWarnings("all")
public class DIMACSTransformation {
  private String DIMACSRepr = "";
  
  private HashMap<Object, Object> varTab = new HashMap<Object, Object>();
  
  private int nbVar = 0;
  
  private int nbClause = 1;
  
  public void saveDIMACS(final Form form, final FileOutputStream fos) {
    PrintWriter output = new PrintWriter(fos);
    output.write(this.formInDIMACS(form));
    output.close();
  }
  
  /**
   * Work in progress
   * works for cnf, trying to add other cases
   * (ugly and not fully working for now)
   */
  public void traverseGraphForDIMACS(final Form f, final Boolean isNeg) {
    if ((f instanceof AndForm)) {
      AndForm af = ((AndForm) f);
      this.traverseGraphForDIMACS(af.getLeft(), isNeg);
      if ((!(isNeg).booleanValue())) {
        this.nbClause++;
        String _DIMACSRepr = this.DIMACSRepr;
        this.DIMACSRepr = (_DIMACSRepr + "0\n");
      }
      this.traverseGraphForDIMACS(af.getRight(), isNeg);
    } else {
      if ((f instanceof OrForm)) {
        OrForm of = ((OrForm) f);
        this.traverseGraphForDIMACS(of.getLeft(), isNeg);
        if ((isNeg).booleanValue()) {
          this.nbClause++;
          String _DIMACSRepr_1 = this.DIMACSRepr;
          this.DIMACSRepr = (_DIMACSRepr_1 + "0\n");
        }
        this.traverseGraphForDIMACS(of.getRight(), isNeg);
      } else {
        if ((f instanceof BiImplForm)) {
          BiImplForm of_1 = ((BiImplForm) f);
          this.traverseGraphForDIMACS(of_1.getLeft(), Boolean.valueOf((!(isNeg).booleanValue())));
          this.traverseGraphForDIMACS(of_1.getRight(), isNeg);
          this.nbClause++;
          String _DIMACSRepr_2 = this.DIMACSRepr;
          this.DIMACSRepr = (_DIMACSRepr_2 + "0\n");
          this.traverseGraphForDIMACS(of_1.getRight(), Boolean.valueOf((!(isNeg).booleanValue())));
          this.traverseGraphForDIMACS(of_1.getLeft(), isNeg);
        } else {
          if ((f instanceof NandForm)) {
            NandForm of_2 = ((NandForm) f);
            if ((isNeg).booleanValue()) {
              this.traverseGraphForDIMACS(of_2.getLeft(), isNeg);
              this.nbClause++;
              String _DIMACSRepr_3 = this.DIMACSRepr;
              this.DIMACSRepr = (_DIMACSRepr_3 + "0\n");
              this.traverseGraphForDIMACS(of_2.getRight(), isNeg);
            } else {
              this.traverseGraphForDIMACS(of_2.getLeft(), Boolean.valueOf((!(isNeg).booleanValue())));
              this.traverseGraphForDIMACS(of_2.getRight(), Boolean.valueOf((!(isNeg).booleanValue())));
            }
          } else {
            if ((f instanceof ImplForm)) {
              ImplForm of_3 = ((ImplForm) f);
              if ((isNeg).booleanValue()) {
                this.traverseGraphForDIMACS(of_3.getLeft(), isNeg);
                this.nbClause++;
                String _DIMACSRepr_4 = this.DIMACSRepr;
                this.DIMACSRepr = (_DIMACSRepr_4 + "0\n");
                this.traverseGraphForDIMACS(of_3.getRight(), Boolean.valueOf((!(isNeg).booleanValue())));
              } else {
                this.traverseGraphForDIMACS(of_3.getLeft(), Boolean.valueOf((!(isNeg).booleanValue())));
                this.traverseGraphForDIMACS(of_3.getRight(), isNeg);
              }
            } else {
              EObject _form = f.getForm();
              if ((_form instanceof Var)) {
                EObject _form_1 = f.getForm();
                this.addVar(((Var) _form_1), (isNeg).booleanValue());
              } else {
                EObject _form_2 = f.getForm();
                if ((_form_2 instanceof NotForm)) {
                  EObject _form_3 = f.getForm();
                  this.traverseGraphForDIMACS(((Form) _form_3), Boolean.valueOf((!(isNeg).booleanValue())));
                } else {
                  EObject _form_4 = f.getForm();
                  if ((_form_4 instanceof Form)) {
                    EObject _form_5 = f.getForm();
                    this.traverseGraphForDIMACS(((Form) _form_5), isNeg);
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public String addVar(final Var v, final boolean isNeg) {
    String _xblockexpression = null;
    {
      Object _get = this.varTab.get(v.getId());
      boolean _equals = Objects.equal(_get, null);
      if (_equals) {
        this.nbVar++;
        this.varTab.put(v.getId(), Integer.valueOf(this.nbVar));
      }
      if (isNeg) {
        String _DIMACSRepr = this.DIMACSRepr;
        this.DIMACSRepr = (_DIMACSRepr + "-");
      }
      String _DIMACSRepr_1 = this.DIMACSRepr;
      Object _get_1 = this.varTab.get(v.getId());
      String _string = Integer.toString((((Integer) _get_1)).intValue());
      String _plus = (_string + " ");
      _xblockexpression = this.DIMACSRepr = (_DIMACSRepr_1 + _plus);
    }
    return _xblockexpression;
  }
  
  public String formInDIMACS(final Form form) {
    this.traverseGraphForDIMACS(form, Boolean.valueOf(false));
    this.DIMACSRepr = (((((("c generated from DSLSAT\nc\np cnf " + Integer.valueOf(this.nbVar)) + " ") + Integer.valueOf(this.nbClause)) + "\n") + this.DIMACSRepr) + "0");
    return this.DIMACSRepr;
  }
}
