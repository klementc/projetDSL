package org.xtext.example.mydsl.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.sat4j.pb.SolverFactory;
import org.sat4j.reader.DimacsReader;
import org.sat4j.reader.ParseFormatException;
import org.sat4j.reader.Reader;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;
import org.xtext.example.mydsl.dSLSAT.Form;

public class DSLSAT4JSolver {

	/**
	 * Solve from a file
	 * @param path the path to the cnf file
	 */
	public static boolean processCNFWithSAT4J(String path)
	{
		Boolean solvable = false;
		ISolver solver = SolverFactory.newDefault();
        solver.setTimeout(3600); // 1 hour timeout
        Reader reader = new DimacsReader(solver);
        // CNF filename is given on the command line 
        try {
            IProblem problem = reader.parseInstance(path);
            if (problem.isSatisfiable()) {
            	solvable = true;
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
        	System.out.println("file not found");
        } catch (ParseFormatException e) {
            // TODO Auto-generated catch block
        	System.out.println("parse format exception");
        } catch (IOException e) {
            // TODO Auto-generated catch block
        } catch (ContradictionException e) {
            System.out.println("No");
        } catch (TimeoutException e) {
            System.out.println("Timeout, sorry!");      
        }
        
        return solvable;
	}
	
	public static boolean processFromDSLSATWithSAT4J(String path)
	{
		ParseHelper<Form> parseHelper = new ParseHelper<Form>();
		URI u = URI.createURI(path);
		Form f = DSLSATParsingTest.loadFormula(u);
		DSLSATDIMACSTransform tr = new DSLSATDIMACSTransform();
		tr.transformAndSaveAsDIMACS(f, path+".cnf");
		return processCNFWithSAT4J(path+".cnf");

	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String path;
		System.out.println("Enter the path of your sat file: ");
		path = sc.next();
		processFromDSLSATWithSAT4J(path);
	}
}
