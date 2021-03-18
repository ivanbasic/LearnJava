package ivanbasic;

public class java_11_21_400_InterfaceStaticMethod implements Lesson {

 
	public void main() {
 
		Bunny bunny = new Bunny();
		bunny.printDetails();
		
	}

}
interface Hop {
	static int getHeight() { 
		return 8;
	}
}
class Bunny implements Hop {
	
	//DOES NOT COMPILE
	//void printDetails()   { System.out.println( getHeight());   } 	
	
	void printDetails()   { System.out.println("Bunny, hop height="+ Hop.getHeight());   } 	
	
}