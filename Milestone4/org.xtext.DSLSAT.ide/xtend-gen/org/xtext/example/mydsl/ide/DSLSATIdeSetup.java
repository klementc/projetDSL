/**
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.example.mydsl.DSLSATRuntimeModule;
import org.xtext.example.mydsl.DSLSATStandaloneSetup;
import org.xtext.example.mydsl.ide.DSLSATIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class DSLSATIdeSetup extends DSLSATStandaloneSetup {
  @Override
  public Injector createInjector() {
    DSLSATRuntimeModule _dSLSATRuntimeModule = new DSLSATRuntimeModule();
    DSLSATIdeModule _dSLSATIdeModule = new DSLSATIdeModule();
    return Guice.createInjector(Modules2.mixin(_dSLSATRuntimeModule, _dSLSATIdeModule));
  }
}
