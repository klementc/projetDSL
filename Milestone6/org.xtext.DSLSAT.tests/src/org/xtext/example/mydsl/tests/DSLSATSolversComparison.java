package org.xtext.example.mydsl.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.xtext.example.mydsl.dSLSAT.Form;

public class DSLSATSolversComparison {

	/**
	 * Verifies if different solvers give the same result about satisfiability of a DSLSAT formula
	 * @param path the path to the DSLSAT formula
	 * @return true if the solvers give the same output, false otherwise
	 */
	public static boolean verifyOutputFromDSLSAT(String path)
	{
		ParseHelper<Form> parseHelper = new ParseHelper<Form>();
		URI u = URI.createURI(path);
		Form f = DSLSATParsingTest.loadFormula(u);
		DSLSATDIMACSTransform tr = new DSLSATDIMACSTransform();
		tr.transformAndSaveAsDIMACS(f, path+".cnf");
		boolean verifSAT4J = DSLSAT4JSolver.processCNFWithSAT4J(path+".cnf");
		boolean verifMiniSAT = DSLSATMiniSAT.processCNFWithMiniSAT(path+".cnf");
		
		return verifSAT4J == verifMiniSAT;
	}
}
