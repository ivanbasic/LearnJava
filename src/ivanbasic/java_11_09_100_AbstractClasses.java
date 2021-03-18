package ivanbasic;

public class java_11_09_100_AbstractClasses implements Lesson {

	public void main() {
		// Cannot instantiate the type Abstract0...
		// Abstract0 a0 = new Abstract0();
		// Abstract1 a1 = new Abstract1();

		Abstract0 a0 = new Concrete0();
		Abstract1 a1 = new Concrete1();		
		
		
	}

}

abstract class AbstractSub0 {
	AbstractSub0() {
		System.out.println("Constructor AbstractSub0 "+this.toString() );		
	}	
}


//with 0 abstract methods
abstract class Abstract0 extends  AbstractSub0 {
}

//with 1 abstract method
abstract class Abstract1 extends  AbstractSub0 {
	static int absCla;
	int absInst;
	
	abstract int doIt();

	int done() {
		System.out.println("It's alraedy done.");
		return 1;
	}
}

class Concrete0 extends Abstract0 {
}

class Concrete1 extends Abstract1 {	
	int doIt() {
		return 0;
	}
}