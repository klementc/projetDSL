/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.tests;

import com.google.inject.Inject;
import java.io.FileOutputStream;
import java.util.HashMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.mydsl.DIMACSTransformation;
import org.xtext.example.mydsl.DSLSATStandaloneSetupGenerated;
import org.xtext.example.mydsl.dSLSAT.Form;
import org.xtext.example.mydsl.tests.DSLSATInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(DSLSATInjectorProvider.class)
@SuppressWarnings("all")
public class DSLSATParsingTest {
  @Inject
  private ParseHelper<Form> parseHelper;
  
  public Form loadSATForm(final URI uri) {
    Form _xblockexpression = null;
    {
      new DSLSATStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
      Resource res = new ResourceSetImpl().getResource(uri, true);
      EObject _get = res.getContents().get(0);
      _xblockexpression = ((Form) _get);
    }
    return _xblockexpression;
  }
  
  public void saveSATForm(final URI uri, final Form form) {
    try {
      Resource rs = new ResourceSetImpl().createResource(uri);
      rs.getContents().add(form);
      HashMap<Object, Object> _hashMap = new HashMap<Object, Object>();
      rs.save(_hashMap);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void saveDimacs(final Form f, final String name) {
    try {
      DIMACSTransformation tr = new DIMACSTransformation();
      FileOutputStream _fileOutputStream = new FileOutputStream((name + ".cnf"));
      tr.saveDIMACS(f, _fileOutputStream);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void loadCorrectModel(final String textToTest) {
    try {
      final Form result = this.parseHelper.parse(textToTest);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder.append(_join);
      Assertions.assertTrue(_isEmpty, _builder.toString());
      this.saveDimacs(result, "test");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void loadIncorrectModel(final String textToTest) {
    try {
      final Form result = this.parseHelper.parse(textToTest);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      Assertions.assertFalse(errors.isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void Test1() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(A v B v C) ^ (D v E v F)");
    _builder.newLine();
    this.loadCorrectModel(_builder.toString());
  }
  
  @Test
  public void Test2() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(!A v B) ^ (C v !D) ^ !D ^ (E v !F v !G) ^ H");
    _builder.newLine();
    this.loadCorrectModel(_builder.toString());
  }
  
  @Test
  public void Test3() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("A => B C");
    _builder.newLine();
    this.loadIncorrectModel(_builder.toString());
  }
  
  @Test
  public void Test4() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<=> B");
    _builder.newLine();
    this.loadIncorrectModel(_builder.toString());
  }
}
