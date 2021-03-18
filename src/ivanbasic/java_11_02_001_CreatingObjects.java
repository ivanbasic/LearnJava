package ivanbasic;

public class java_11_02_001_CreatingObjects implements Lesson {
	public void main() {
		System.out.println("Creating Objects. Order of Initialization");		
		
		Chick chick= new Chick();
		
	}
	
}

class Chick {
	public Chick() {
		cPrivate = "constructor";
		cStatic = "constructor";
		
		System.out.println("constructor, always the last, cPrivate="+cPrivate);
		System.out.println("constructor, always the last, cStatic="+cStatic);
	}	
	
	
	private String cPrivate = "setting field";
	private static String cStatic="setting field"; //ignored?

	{System.out.println("1. Block, field cPrivate="+cPrivate);}	
	{System.out.println("1. Block, field cStatic="+cStatic);}

	

	{ cPrivate = "block"; }
	{ cStatic = "block"; }	
	{System.out.println("2. Block, field cPrivate="+cPrivate);}	
	{System.out.println("2. Block, field cStatic="+cStatic);}



 	
	static { 
		cStatic = "static initializer, always FIRST";
		
		//executed, before this lesson, and before first lesson!!!
		System.out.println("Lesson CreatingObjects, ");
		System.out.println("Inside static Initializer Block, field, cStatic="+cStatic);
	}	
	
}

