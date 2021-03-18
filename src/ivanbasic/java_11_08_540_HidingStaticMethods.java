package ivanbasic;

public class java_11_08_540_HidingStaticMethods implements Lesson {

	public void main() {
		System.out.println("You can't mix static and non-static methods");
		
		Bear.doIt();
		Panda.doIt();
	}

	
}
class Bear {
	public static void doIt() {
		System.out.println("public static void doIt() Bear");
	}
}
class Panda extends Bear {
	public static void doIt() {
		System.out.println("public static void doIt() Panda. >>Hiding<<. Tis is not considered an overridden method. ");
	}
}