package ivanbasic;

import java.util.ArrayList;
import java.util.List;

public class java_11_06_060_CallingAPIsWithLambdas implements Lesson {
	public void main() {
		
		System.out.println("List and Set declare a removeIf() method that takes a Predicate (boolean)");
		List<String> bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		System.out.println(bunnies); // [long ear, floppy, hoppy]
		bunnies.removeIf(s -> s.charAt(0) != 'h');
		System.out.println(bunnies); // [hoppy]		
		
		
		System.out.println("");
		System.out.println("sort (int)");
		bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");
		bunnies.add("a");		
		bunnies.add("z");	
		System.out.println(bunnies); // [long ear, floppy, hoppy]
		bunnies.sort((b1, b2) -> b1.compareTo(b2));
		System.out.println(bunnies); // [floppy, hoppy, long ear]		
		System.out.println("and reverse:");	
		bunnies.sort((b1, b2) -> b2.compareTo(b1));
		System.out.println(bunnies); // [floppy, hoppy, long ear]			
		
		
		
		System.out.println();
		System.out.println("forEach(), Consumer, void accept(T t)");  

		bunnies = new ArrayList<>();
		bunnies.add("long ear");
		bunnies.add("floppy");
		bunnies.add("hoppy");

		bunnies.forEach(b -> System.out.println(b)); 
 		
		
		
		
		
		
	}
	
}
