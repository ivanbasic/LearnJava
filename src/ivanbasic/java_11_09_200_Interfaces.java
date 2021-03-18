package ivanbasic;

public class java_11_09_200_Interfaces implements Lesson {
	public void main() {

		TheInterface ti= new ChildOf();
		ti.doIt();
		ti.doneDefaultMethod();
		
		TheInterface.doneStaticMethod();
		System.out.println( TheInterface.onlyStatic );
		
		// The final field TheInterface.onlyStatic cannot be assigned		
		// TheInterface.onlyStatic="changed";
		
		
		System.out.println("interface ti instanceof class ChildOf? "+ (ti instanceof ChildOf) );		
		
		//not visible
		//ti.donePrivateMethod();
		
	}

}
interface TheInterface {	
	//Initialize final field
	String onlyStatic="static field of TheInterface";
	
	void doIt();	
	
	//The interface ... cannot define an initializer
	//static {onlyStatic=1; }	

	//Interfaces cannot have constructor
	//TheInterface(){	System.out.println("TheInterface constructor.");}
 
	/*
	With Java 8, interfaces were updated to include static
	and default methods. A default method is one in which the interface method has a
	body and is not marked abstract. It was added for backward compatibility, allowing an
	older class to use a new version of an interface that contains a new method, 
	without having to modify the existing class.	
	*/
	default void doneDefaultMethod() {System.out.println("default method");	}
	
	
	/*
	In Java 9, interfaces were updated to support private and private static methods.
	Both of these types were added for code reusability within an interface declaration 
	and	cannot be called outside the interface definition.	 
	*/
	static  void doneStaticMethod() {System.out.println("static method");   }
	private void donePrivateMethod() {System.out.println("private method");   }
 
}
class ChildOf implements TheInterface {
	//Cannot reduce the visibility of the inherited method from	TheInterface  
	public void doIt() {
		System.out.println("doIt is implemented.");
	};	
}


/*public */ abstract interface TheSame {	
	public static final int onlyStatic=1;
	
	public abstract void doIt();
	
}