package org.xtext.example.mydsl.tests;

import com.google.common.base.Objects;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.xtext.example.mydsl.dSLSAT.AndForm;
import org.xtext.example.mydsl.dSLSAT.Form;
import org.xtext.example.mydsl.dSLSAT.NotForm;
import org.xtext.example.mydsl.dSLSAT.OrForm;
import org.xtext.example.mydsl.dSLSAT.Var;
import org.xtext.example.mydsl.dSLSAT.impl.DSLSATFactoryImpl;

@SuppressWarnings("all")
public class DSLSATDIMACSTransform {
  private final DSLSATFactoryImpl dslFact = new DSLSATFactoryImpl();
  
  private HashMap<Object, Object> varList = new HashMap<Object, Object>();
  
  private int variableCpt = 0;
  
  private int nbClauses = 1;
  
  public void transformAndSaveAsDIMACS(final Form form, final String path) {
    try {
      FileOutputStream _fileOutputStream = new FileOutputStream(path);
      PrintWriter output = new PrintWriter(_fileOutputStream);
      output.write(this.formToDIMACS(form));
      output.close();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Object getVar(final String varName) {
    return this.varList.get(varName);
  }
  
  public Object addVar(final String varName) {
    Object _xifexpression = null;
    Object _get = this.varList.get(varName);
    boolean _equals = Objects.equal(_get, null);
    if (_equals) {
      Object _xblockexpression = null;
      {
        this.variableCpt++;
        _xblockexpression = this.varList.put(varName, Integer.valueOf(this.variableCpt));
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }
  
  public String traverseCNF(final Form f, final boolean isNeg) {
    String ret = "";
    boolean _matched = false;
    if ((f instanceof AndForm)) {
      _matched=true;
      int _nbClauses = this.nbClauses;
      this.nbClauses = (_nbClauses + 1);
      String _ret = ret;
      Object _traverseCNF = this.traverseCNF(((AndForm) f).getLeft(), isNeg);
      ret = (_ret + _traverseCNF);
      String _ret_1 = ret;
      ret = (_ret_1 + "0\n");
      String _ret_2 = ret;
      Object _traverseCNF_1 = this.traverseCNF(((AndForm) f).getRight(), isNeg);
      ret = (_ret_2 + _traverseCNF_1);
    }
    if (!_matched) {
      if ((f instanceof OrForm)) {
        _matched=true;
        String _ret_3 = ret;
        Object _traverseCNF_2 = this.traverseCNF(((OrForm) f).getLeft(), isNeg);
        ret = (_ret_3 + _traverseCNF_2);
        String _ret_4 = ret;
        Object _traverseCNF_3 = this.traverseCNF(((OrForm) f).getRight(), isNeg);
        ret = (_ret_4 + _traverseCNF_3);
      }
    }
    if (!_matched) {
      if ((f instanceof NotForm)) {
        _matched=true;
        String _ret_5 = ret;
        EObject _form = ((NotForm) f).getForm();
        Object _traverseCNF_4 = this.traverseCNF(((Form) _form), (!isNeg));
        ret = (_ret_5 + _traverseCNF_4);
      }
    }
    if (!_matched) {
      EObject _form_1 = f.getForm();
      if ((_form_1 instanceof Form)) {
        String _ret_6 = ret;
        EObject _form_2 = f.getForm();
        Object _traverseCNF_5 = this.traverseCNF(((Form) _form_2), isNeg);
        ret = (_ret_6 + _traverseCNF_5);
      } else {
        EObject _form_3 = f.getForm();
        if ((_form_3 instanceof Var)) {
          EObject _form_4 = f.getForm();
          this.addVar(((Var) _form_4).getId());
          if (isNeg) {
            String _ret_7 = ret;
            ret = (_ret_7 + "-");
          }
          String _ret_8 = ret;
          EObject _form_5 = f.getForm();
          Object _var = this.getVar(((Var) _form_5).getId());
          String _plus = (_var + " ");
          ret = (_ret_8 + _plus);
        } else {
          EObject _form_6 = f.getForm();
          if ((_form_6 instanceof NotForm)) {
            String _ret_9 = ret;
            EObject _form_7 = f.getForm();
            Object _traverseCNF_6 = this.traverseCNF(((NotForm) _form_7), isNeg);
            ret = (_ret_9 + _traverseCNF_6);
          }
        }
      }
    }
    return ret;
  }
  
  public Form toCNF(final Form f, final boolean isNeg) {
    return f;
  }
  
  public String formToDIMACS(final Form f) {
    String tmp = this.traverseCNF(this.toCNF(f, false), false);
    String ret = "c generated from DSLSAT\nc\np cnf ";
    String _ret = ret;
    String _plus = (Integer.valueOf(this.variableCpt) + " ");
    String _plus_1 = (_plus + Integer.valueOf(this.nbClauses));
    String _plus_2 = (_plus_1 + "\n");
    ret = (_ret + _plus_2);
    String _ret_1 = ret;
    ret = (_ret_1 + tmp);
    String _ret_2 = ret;
    ret = (_ret_2 + "0\n");
    return ret;
  }
}
