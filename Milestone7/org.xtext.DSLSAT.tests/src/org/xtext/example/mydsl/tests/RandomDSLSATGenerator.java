package org.xtext.example.mydsl.tests;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Allows to create random formulas respecting the DSLSAT Format
 * @author clem
 *
 */
public class RandomDSLSATGenerator {

	/**
	 * Returns a String representing the DSLSAT Formula
	 * @param nbClauses the amount of clauses in the formula
	 * @return
	 */
	public static String getRandomFormula(int nbClauses)
	{
		String ret = "";
		boolean firstClause = true;
		for(int i=0;i<nbClauses;i++)
		{
			if(!firstClause) {
				ret+=" ^ ";
			}else {
				firstClause = false;
			}
			ret += "(";
			// calculate the number of variable in the formula randomly between 1 and 5
			int numberOfVar = ThreadLocalRandom.current().nextInt(1, 5 + 1);
			boolean firstVar = true;
			for(int j=0 ; j < numberOfVar ; j++) {
				// takes a random identifier and adds it to the clause
				if(!firstVar) {
					ret+=" v ";
				}else {
					firstVar = false;
				}
				Random r = new Random();
				char c = (char) (r.nextInt(26) + 'A');
				
				// randomly put true or false for the variable
				if(r.nextBoolean()) {
					ret+="!";
				}
				ret+=c;

			}
			ret+=")";
		}
		
		return ret;
	}
	
}
