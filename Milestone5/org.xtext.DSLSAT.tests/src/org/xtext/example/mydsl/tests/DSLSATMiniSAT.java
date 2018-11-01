package org.xtext.example.mydsl.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.xtext.example.mydsl.dSLSAT.Form;

public class DSLSATMiniSAT {
	
	
	public static void processCNFWithMiniSAT(String path)
	{
		DSLSATDIMACSTransform d = new DSLSATDIMACSTransform();
		
	    Process p;
		try {
			p = Runtime.getRuntime().exec("minisat_static " + path);
		    p.waitFor();
	
		    BufferedReader reader = 
		         new BufferedReader(new InputStreamReader(p.getInputStream()));
	
		    String line = "";			
		    while ((line = reader.readLine())!= null) {
		    	System.out.println(line);
		    }
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void processFromDSLSATWithMiniSAT(String path)
	{
		ParseHelper<Form> parseHelper = new ParseHelper<Form>();
		URI u = URI.createURI(path);
		Form f = DSLSATParsingTest.loadFormula(u);
		DSLSATDIMACSTransform tr = new DSLSATDIMACSTransform();
		tr.transformAndSaveAsDIMACS(f, path+".cnf");
		processCNFWithMiniSAT(path+".cnf");

	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String path;
		System.out.println("Enter the path of your sat file: ");
		path = sc.next();
		processFromDSLSATWithMiniSAT(path);
	}
}
