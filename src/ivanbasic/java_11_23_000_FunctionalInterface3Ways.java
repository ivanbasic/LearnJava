package ivanbasic;

public class java_11_23_000_FunctionalInterface3Ways implements Lesson {
	public void main() {
 
		LearnToSpeak w1 = new SpeakUsingClass();
		LearnToSpeak w2 = s -> System.out.println(s);
		LearnToSpeak w3 = System.out::println;
		
		System.out.println("1. using class      :"+ w1);
		System.out.println("2. using lambda     :"+ w2);
		System.out.println("3. method reference :"+ w3);		
		
		
	}

}


@FunctionalInterface
interface LearnToSpeak {
   void speak(String sound);
}

class SpeakUsingClass implements LearnToSpeak {
	public void speak(String sound ) {
		System.out.println( sound);
	}
}

