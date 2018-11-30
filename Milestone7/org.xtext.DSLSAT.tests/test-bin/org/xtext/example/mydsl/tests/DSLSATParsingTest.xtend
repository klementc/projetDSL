/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.example.mydsl.dSLSAT.Form
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.xtext.example.mydsl.DSLSATStandaloneSetupGenerated
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import java.io.PrintWriter

@ExtendWith(InjectionExtension)
@InjectWith(DSLSATInjectorProvider)
class DSLSATParsingTest {
	@Inject
	ParseHelper<Form> parseHelper
	
	def static loadFormula(URI uri)
	{
		new DSLSATStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res = new ResourceSetImpl().getResource(uri,true)
		res.contents.get(0) as Form
	}
	
	@Test
	/**
	 * Tries to load a formula in DSLSAT format and transform it in dimacs
	 */
	def void loadModel() {
		val result = parseHelper.parse('''
			(!A v B) ^ (C v !D) ^ A
		''')
		var d = new DSLSATDIMACSTransform
		d.transformAndSaveAsDIMACS(result,"test1.cnf")
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	/**
	 * Tries to load a formula in DSLSAT format and transform it in dimacs
	 */
	def void loadModel2() {
		val result = parseHelper.parse('''
			(!A) ^ (D v G v BLABLA v C v !D) ^ A ^ D ^ (!E v !F)
		''')
		var d = new DSLSATDIMACSTransform
		d.transformAndSaveAsDIMACS(result,"test2.cnf")
		
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	/**
	 * Verifies that sat4j treats a satisfiable formula correctly
	 */
	def void tryToSolveSatisfiableWithSAT4J(){
		var satWithSAT4J = DSLSAT4JSolver.processFromDSLSATWithSAT4J("test1.DSLSAT") 
		Assertions.assertTrue(satWithSAT4J, '''Satisfiability should be true''')
	}
	
	@Test
	/**
	 * Verifies that SAT4J treats an unsatisfiable formula correctly
	 */
	def void tryToSolveUnsatisfiableWithSAT4J(){
		var satWithSAT4J = DSLSAT4JSolver.processFromDSLSATWithSAT4J("test2.DSLSAT") 
		Assertions.assertFalse(satWithSAT4J, '''Satisfiability should be False''')
	}
	
	@Test
	/**
	 * Verifies that minisat treats a satisfiable formula correctly
	 */
	def void tryToSolveSatisfiableWithMINISAT(){
		var satWithMINISAT = DSLSATMiniSAT.processFromDSLSATWithMiniSAT("test1.DSLSAT") 
		Assertions.assertTrue(satWithMINISAT, '''Satisfiability should be true''')
	}
	
	@Test
	/**
	 * Verifies that minisat treats an unsatisfiable formula correctly
	 */
	def void tryToSolveUnsatisfiableWithMINISAT(){
		var satWithMINISAT = DSLSATMiniSAT.processFromDSLSATWithMiniSAT("test2.DSLSAT") 
		Assertions.assertFalse(satWithMINISAT, '''Satisfiability should be False''')
	}


	@Test
	/**
	 * Checks if a satisfiable formula is seen as satisfiable 
	 * from both minisat and sat4J
	 */
	def void trySolversSameValueSatisfiable(){
		Assertions.assertTrue(DSLSATMiniSAT.processFromDSLSATWithMiniSAT("test1.DSLSAT") == DSLSAT4JSolver.processFromDSLSATWithSAT4J("test1.DSLSAT"), '''Satisfiability should be True''')
	}
		
	@Test
	/**
	 * Checks if an unsatisfiable formula is seen as unsatisfiable 
	 * from both minisat and sat4J
	 */
	def void trySolversSameValueUnsatisfiable(){
		Assertions.assertTrue(DSLSATMiniSAT.processFromDSLSATWithMiniSAT("test2.DSLSAT") == DSLSAT4JSolver.processFromDSLSATWithSAT4J("test2.DSLSAT"), '''Satisfiability should be False''')
	}
	
	@Test
	/**
	 * Tries the solver comparison for a solvable formula
	 * from both minisat and sat4J
	 */
	def void trySolverComparisonMethodOnSatisfiable(){
		Assertions.assertTrue(DSLSATSolversComparison.verifyOutputFromDSLSAT("test1.DSLSAT"), '''Solvers output should be the same''')
	}
		
	@Test
	/**
	 * Checks if an unsatisfiable formula is seen as unsatisfiable 
	 * from both minisat and sat4J
	 */
	def void trySolverComparisonMethodOnUnsatisfiable(){
		System.out.println(RandomDSLSATGenerator.getRandomFormula(5));
		Assertions.assertTrue(DSLSATSolversComparison.verifyOutputFromDSLSAT("test2.DSLSAT"), '''Solvers output should be the same''')
	}
	
	@Test
	/**
	 * Test on numerous formulas
	 * Here we test on random formulas
	 */
	def void trySolverComparisonOnRandomForm(){
		for(var i=0;i<5;i++){
			var s = RandomDSLSATGenerator.getRandomFormula(5);
			var f = parseHelper.parse(s);
			
			var out = new PrintWriter("testrand.DSLSAT");
			out.println(s);
			out.close()
			
			Assertions.assertTrue(DSLSATSolversComparison.verifyOutputFromDSLSAT("testrand.DSLSAT"), '''Solvers output should be the same''')
		}
			
	}
}