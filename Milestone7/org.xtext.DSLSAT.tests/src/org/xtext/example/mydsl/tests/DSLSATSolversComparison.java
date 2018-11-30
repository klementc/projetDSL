package org.xtext.example.mydsl.tests;

import java.util.Scanner;

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
		boolean verif1 = DSLSAT4JSolver.processCNFWithSAT4J(path+".cnf");
		boolean verif2 = DSLSATMiniSAT.processCNFWithMiniSAT(path+".cnf") ;
		boolean verif3 = DSLSATYalsatSolver.processCNFWithYalsat(path+".cnf");
		return (verif1 & verif2 & verif3) | !(verif1 | verif2 | verif3);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String path;
		System.out.println("Enter the path of your sat file: ");
		path = sc.next();
		if(verifyOutputFromDSLSAT(path)) {
			System.out.println("All solvers return the same result!");
		}else {
			System.out.println("Solvers don't give the same result");
		}
	}
}
