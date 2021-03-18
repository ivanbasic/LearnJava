package ivanbasic;

public class java_11_09_900_ReviewQuestions implements Lesson {

	
	public void main() {

		
	}

}

// on my own
interface Advanced {
	String variable="variable";
	
	void toImplement();
	void toImplement(int ii);
	
	static void doStatic() { 
		System.out.println("static" ); 		
		// The final field Advanced.variable cannot be assigned
		//variable="variable again"; 
	}
	
	//Abstract methods do not specify a body
	//void doInstance() {}
}

//on my own
interface UnfinishedInt {
	void doInterface();
}
abstract class UnfinishedAbs implements  UnfinishedInt {
	abstract void doAbstract();
}
class Finished extends UnfinishedAbs {
	@Override
	public void doInterface() {		}
	
	@Override	
	void doAbstract() {		}	
}

//10. Which statements are true about the following code? (Choose all that apply.)
interface CanFly {
	int fly();
	String fly(int distance);
}
interface HasWings {
	abstract String fly();
public abstract Object getWingSpan();
}
// The return types are incompatible for the inherited methods CanFly.fly(), HasWings.fly()
// abstract class Falcon implements CanFly, HasWings {}


// 12. Which of the following statements about the FruitStand program are correct? (Choose all that apply.)
interface Apple {}
interface Orange {}
class Gala implements Apple {}
class Tangerine implements Orange {}
final class Citrus extends Tangerine {}
class FruitStand {
	public static void main(String... farm) {
		Gala g = new Gala();
		Tangerine t = new Tangerine();
		Citrus c = new Citrus();
		
		//Incompatible conditional operand types Tangerine and Gala
		//System.out.print(t instanceof Gala);
		System.out.print(c instanceof Tangerine);
		System.out.print(g instanceof Apple);
		System.out.print(t instanceof Apple);
		
		//Incompatible conditional operand types Citrus and Apple
		//System.out.print(c instanceof Apple);
	}
}


