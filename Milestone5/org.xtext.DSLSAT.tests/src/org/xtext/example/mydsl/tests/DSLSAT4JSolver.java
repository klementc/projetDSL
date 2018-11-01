package org.xtext.example.mydsl.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

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
	public static void solve(String path)
	{
		ISolver solver = SolverFactory.newDefault();
        solver.setTimeout(3600); // 1 hour timeout
        Reader reader = new DimacsReader(solver);
        // CNF filename is given on the command line 
        try {
            IProblem problem = reader.parseInstance(path);
            if (problem.isSatisfiable()) {
                System.out.println("Satisfiable !\nSolution: "+reader.decode(problem.model()));
            } else {
                System.out.println("Unsatisfiable !");
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
            System.out.println("Unsatisfiable (trivial)!");
        } catch (TimeoutException e) {
            System.out.println("Timeout, sorry!");      
        }
	}
	
	/**
	 * Tries to find a solution to a formula
	 * @param f the formula to try
	 */
	public static void solveForm(Form f)
	{
		DSLSATDIMACSTransform d = new DSLSATDIMACSTransform();
		d.transformAndSaveAsDIMACS(f,"tmpDIMACS.cnf");
		
		solve("tmpDIMACS.cnf");

	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("going to attempt to solve file: "+args[0]);
		solve(args[0]);
	}
}
