package ivanbasic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class java_11_08_900_ReviewQuestions implements Lesson {

 
	public void main() {
		Cheetah.main(null); System.out.println();
		Spider.main(null);  System.out.println();
		PolarBear.main(null); System.out.println();
		AboutFinal.test(); System.out.println();
		Child.main(null);  System.out.println();
		
		Class2.main(); System.out.println();
 
	}

}


// 4. Which of the following complete the constructor so that this code prints out 50? (Choose all that apply.)
class Speedster {
	int numSpots;
}
class Cheetah extends Speedster {
	// variable Speedster.numSpots is hidden
	int numSpots;
	public Cheetah(int numSpots) {
		// INSERT CODE HERE
		super.numSpots = numSpots;
		
	}
	public static void main(String[] args) {
		Speedster s = new Cheetah(50);
		System.out.print(s.numSpots);
	}
}


// 5. What is the output of the following code?
class Arthropod {
	protected void printName(long input) {
		System.out.print("Arthropod");
	}

	void printName(int input) {
		System.out.print("Spooky");
	}
}

class Spider extends Arthropod {
	protected void printName(int input) {
		System.out.print("Spider");
	}

	public static void main(String[] args) {
		Arthropod a = new Spider();
		a.printName((short) 4);
		a.printName(4);
		a.printName(5L);
	}
}

//7. Which of the following pairs, when inserted into the blanks, allow the code to compile? (Choose all that apply.)
class Howler {
	public Howler(long shadow) {
		//?
		this(3);
	}	

	private Howler(int moon) {
		super();
	}
}
class Wolf extends Howler {
	protected Wolf(String stars) {
		super(2L);
	}

	public Wolf() {
		//?
		this("");
	}
}



// 8. What is the result of the following

class PolarBear {
	StringBuilder value = new StringBuilder("t");
	
	{	value.append("a");	}
	{	value.append("c");	}

	private PolarBear() {
		value.append("b");
	}

	public PolarBear(String s) {
		this();
		value.append(s);
	}

	public PolarBear(CharSequence p) {
		value.append(p);
	}

	public static void main(String[] args) {
		Object bear = new PolarBear();
		//System.out.println(  ((PolarBear) bear).value );
		
		bear = new PolarBear("f");
		System.out.println(((PolarBear) bear).value);
	}
}


// 11 C. A method that takes a parameter with type java.lang.Object can be passed any variable.
class AnyVariable {
	void DoAny(java.lang.Object any ) {	}
	public void Check() {
		DoAny(new Object() );
		DoAny(new String("abc"));		
		DoAny(new AnyVariable());
		DoAny(new PolarBear("x") );
		DoAny(1);
		DoAny(10.3f );			
	}
}

//16. Which of the following methods are valid overrides of the friendly() method in the Llama class? (Choose all that apply.)
class Llama {
	void friendly(List<String> laugh, Iterable<Short> s) {
	}
}
class Llama2 extends Llama {
	// Name clash: The method friendly(List<CharSequence>, Iterable<Short>) of type Llama2 has the same erasure as friendly(List<String>, Iterable<Short>) of type Llama but does not 	 override it
	// void friendly(List<CharSequence> laugh, Iterable<Short> s) {}
	 
	 void friendly(List<String> laugh, Iterable<Short> s) {}
	 void friendly(ArrayList<String> laugh, Iterable<Short> s) {}
	 

	//Name clash: The method friendly(List<String>, Iterable<Integer>) of type Llama3 has the same erasure as friendly(List<String>, Iterable<Short>) of type Llama but does not override i
	// void friendly(List<String> laugh, Iterable<Integer> s) {}		 
	 void friendly(ArrayList<CharSequence> laugh, Object s) {}
	 void friendly(ArrayList<String> laugh, Iterable... s) {}	
	
}
class Llama3 extends Llama {
}


// 21. Which statement about the following program is correct?
// fly: (private) ->default->protected->public
class Bird {
	int feathers = 0;
	Bird(int x) {		this.feathers = x;	}
	Bird fly() {return new Bird(1);}
}
class Parrot extends Bird {
	protected Parrot(int y) {super(y);	}
	protected Parrot fly() {return new Parrot(2);}
}
/*public*/ class Macaw extends Parrot {
	public Macaw(int z) {	super(z);	}
	public Macaw fly() {	return new Macaw(3);}
	
	public static void main(String... sing) {
		Bird p = new Macaw(4);
		System.out.print(((Parrot) p.fly()).feathers);
	}
}

// 21a 
// To je bilo o metodima.
// A konstruktori? Ah! Konstruktori NE zadrzavaju IME klase roditelja. Nema skrivanja,gazenja,opterecenja.
class AndConstructor1 { 
	AndConstructor1() {}
	void doIt(){}
}
class AndConstructor2 extends AndConstructor1 { 
	private AndConstructor2() {}
	
	// Cannot reduce the visibility of the inherited method from  AndConstructor1
	// Method breakpoint:AndConstructor2 [entry] - doIt()
	// private void doIt() {}
}

//22 final
class AboutFinal {
	public int instanceVariable = 3; 
	
	public static void test( ) {
		
		
		final String test= new String("x");
		// String Immutable 
		// The final local variable test cannot be assigned. It must be blank and not using a compound assignment
		//test= test.replace("x", "y" );
		
		String notFinal =test.replace("x", "y" );
		
		
		final StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
		System.out.println(sb);
		
		final Integer intg = new Integer(1);  
		// intg =  new Integer(2);
		
		
		//The final local variable int2 cannot be assigned. It must be blank and not using a compound assignment
		final int int2 = 2;
		// int2++;	
		
		
		final AboutFinal aboutFinal = new AboutFinal();
		//final objekat se NE moze rekreirati (nova referenca)
		//faf = new AboutFinal();
		
		//ISTI objekat se MOZE menjati
		aboutFinal.instanceVariable++;
		
		
	}
}

//22. What does the following program print?
class Person {
	static String name;
	void setName(String q) {name = q; System.out.println("Person method setName= "+name ); }
}
class Child extends Person {
	static String name;
	void setName(String w) {	name = w;	System.out.println("Child method setName="+name );}

	public static void main(String[] p) {
		final Child m = new Child();
		final Person t = m;
		m.name = "Elysia";   //Child.name=Elysia
		t.name = "Sophia";   //Person.name=Sophia
		m.setName("Webby");  //Child method setName <=> Child.name=Webby
		t.setName("Olivia"); //Child method setName <=> Child.name=Olivia
		
		System.out.println(m.name + " " + t.name);
	}
}

//22b 
class Class1 {
	String instanceVariable="instanceVariable Class1";
	
	void doIt() { System.out.println( "method doIt Class1"); }
}
class Class2 extends Class1 {
	String instanceVariable="instanceVariable Class2";	
	void doIt() { System.out.println( "method doIt Class2"); }
	
	public static void main() {
		Class1 c11 = new Class1();
		Class1 c12=  new Class2();
		Class2 c22=  new Class2();
 
		
		System.out.println( "\nClass1 c11" +" "+ c11 );				
		c11.doIt();
		System.out.println( c11.instanceVariable);		
		
		System.out.println("\nClass1 c12"+" "+ c12 );				
		c12.doIt();
		System.out.println( c12.instanceVariable);		
		
		System.out.println("\nClass2 c22"+" "+ c22 );				
		c22.doIt();
		System.out.println( c22.instanceVariable);					
		
		Class1 c100 =(Class1) c22;
		System.out.println("\ncasting c22....\nClass1 c100"+" "+ c100 );				
		c100.doIt();
		System.out.println( c100.instanceVariable);			
		
		
		
	}
}

