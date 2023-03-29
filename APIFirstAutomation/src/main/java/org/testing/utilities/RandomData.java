package org.testing.utilities;

import java.util.Random;

public class RandomData {
//purpose---to generate input generate random integer value
	
	public static String GenerateRandomData() {
		Random r = new Random();
		 Integer i = r.nextInt();		
           return i.toString();
	}
	
}
