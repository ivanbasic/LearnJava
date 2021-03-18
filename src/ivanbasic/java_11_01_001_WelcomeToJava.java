/* multiline comment */
// single-line comment
/** Javadoc multiple-line comment @author Ivan Basic */

//package
package ivanbasic;


//import tells us where to find Random
import java.util.Random;

//This package is special in that it is automatically imported
import java.lang.*;


import java.util.Date;

//The import java.sql.Date collides with another import statement
//import java.sql.Date;


public class java_11_01_001_WelcomeToJava implements	 Lesson {
	public void main() {
		Random rr = new Random();
		int  ii = rr.nextInt(10); //0-9
		System.out.println("random 0-9: "+ii );
		
		java.util.Date utlDate = new Date();
		java.sql.Date  sqlDate = new java.sql.Date(0);
		
		System.out.println("java.utl.Date: "+utlDate.toString()  );
		System.out.println("java.sql.Date: "+sqlDate.toString()   );		
 		
		System.out.println(new FieldsAndMethodsCanGoInEitherOrder() );
		
	}
	
}
class FieldsAndMethodsCanGoInEitherOrder {
	int ii;
	void doIt() {}
	int yy;
	void doItAgain() {}

	static {}
	{}
}
