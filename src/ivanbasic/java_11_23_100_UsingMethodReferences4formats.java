package ivanbasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class java_11_23_100_UsingMethodReferences4formats implements Lesson {

 
	public void main() {
		System.out.println("Static methods");
		Consumer<List<Integer>> f1; 		
		
		f1 = Collections::sort; 			System.out.println(f1);
		f1 = x -> Collections.sort(x); 		System.out.println(f1);	 	
		
		
		System.out.println("\nInstance methods on a particular instance "); 
		var str = "abc";
		Predicate<String> f2;
		
		f2 = str::startsWith; 				System.out.println(f2);
		f2 = s -> str.startsWith(s); 		System.out.println(f2);
		
		
		
		System.out.println("\nInstance methods on a parameter to be determined at runtime "); 
		Predicate<String> f3;				
		
		f3 = String::isEmpty;         		System.out.println(f3);
		f3 = s -> s.isEmpty();              System.out.println(f3);  
		
		
		System.out.println("\nConstructors"); 
		Supplier<List<String>> f4;			
		f4 = ArrayList::new;				System.out.println(f4);
		f4 = () -> new ArrayList();			System.out.println(f4);
		
		
		
		
		
		
	}

}
