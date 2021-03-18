package ivanbasic;

public class java_11_21_110_UsingEnumsInSwitchStatements implements Lesson {

 
	public void main() {
 
		Season1 s1 = Season1.FALL;
		
		switch (s1) {
			case WINTER: System.out.println("winter"); break;
			case SPRING: System.out.println("spring"); break;
			default :  System.out.println("default");
		}
		
	}

}
enum Season1 {
	   WINTER, SPRING, SUMMER, FALL
}