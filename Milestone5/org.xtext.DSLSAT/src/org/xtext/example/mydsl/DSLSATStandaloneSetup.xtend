/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DSLSATStandaloneSetup extends DSLSATStandaloneSetupGenerated {

	def static void doSetup() {
		new DSLSATStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
