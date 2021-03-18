package ivanbasic;

public class java_11_08_035_SuperCons implements Lesson {

	public void main() {
 
		Second sec = new Second();
	}

	
}
class First {
	First() {
		System.out.println("first");
	}
	
}
class Second extends First {
	public Second() {
		super();
		System.out.println("second");		
	}
	
}