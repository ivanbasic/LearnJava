package ivanbasic;

import java.util.Date;

public class java_11_02_010_ReferenceTypes  implements Lesson{
	public void main( ) {
		Date today = new java.util.Date();
		String greeting = new String("How are you?");
		
		//can be null
		String nn=null;
		
		System.out.println( today);		
		System.out.println( greeting);				
		System.out.println( nn);
		
	}

}
