package ivanbasic;

public class java_11_08_020_Super implements Lesson {

 
	public void main() {
		Kid kid= new Kid();
		
 
		kid.doIt();
		
		
		
	}

}

class Parent {
	public String size="parent size";
	public void doIt() {
		System.out.println("parent doIt");
	}
}
class Kid extends Parent{
	public String size="child size";
	public void doIt() {
		System.out.println("child doIt");
		super.doIt();  		
		
		System.out.println( this.size);		
		System.out.println( super.size);		
		
	}
}

