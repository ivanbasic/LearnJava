package ivanbasic;

public class java_11_02_003_Literals implements Lesson {
	public void main() {
		
		System.out.println("By default, Java assumes you are defining an int value with a numeric literal");
		int  iii = 123; 
		long max = 3123456789L;
		long min =123;
	
		System.out.println("10.0 - Java assumes you are defining an double?  YES");		
		float ff = 10.0f;
		double d1= 10.0;
		double d2= 0;
		double d3= 1.1f;		
		
		
		System.out.println("Integer as bin, oct, hex:" );
		int  bin = 0b1111;
		int  oct = 017;
		int  hex = 0xF;
		System.out.println( bin );
		System.out.println( oct );
		System.out.println( hex );		
		
		System.out.println("Literals and the Underscore Character" );	
		double uu= 3_200_000.55;		
		double annoyingButLegal = 1_00_0.0_0; // Ugly, but compiles
		
		//Primitive can not be null
		//int xx=null;
		
		//Error: Unresolved compilation problem: 
		//The local variable xx may not have been initialized
		//int xx;
		//System.out.println( xx);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
