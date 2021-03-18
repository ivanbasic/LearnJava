package ivanbasic;

public class java_11_08_100_ClassInitialization implements Lesson {
 
	public void main() {
 
		
	}
	
}
class ClassInitA {
	static String stStr="stat.Str";
	
	static { System.out.println("Lesson ClassInitialization, A, stStr=" +stStr);}	
}
class ClassInitB extends ClassInitA {
	static { System.out.println("Lesson ClassInitialization, B");}	
}
class ClassInitC extends ClassInitB {
	static { System.out.println("Lesson ClassInitialization, C");}	
}