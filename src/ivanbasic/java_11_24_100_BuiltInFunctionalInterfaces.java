package ivanbasic;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class java_11_24_100_BuiltInFunctionalInterfaces implements Lesson {

 
	public void main() {
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();	
		LocalDate d1 = s1.get();
		LocalDate d2 = s2.get();

		
		Consumer<String> c1 = System.out::println;
		Consumer<String> c2 = x -> System.out.println(x);
		c1.accept("Annie");
		
		
		Predicate<String> p1 = String::isEmpty;
		Predicate<String> p2 = x -> x.isEmpty();		 
		System.out.println(p1.test(""));  // true
		System.out.println(p2.test(""));  // true
 
		
		Function<String, Integer> f1 = String::length;
		Function<String, Integer> f2 = x -> x.length();	 
		System.out.println(f1.apply("cluck")); // 5
		System.out.println(f2.apply("cluck")); // 5

		UnaryOperator<String> u1 = String::toUpperCase;
		UnaryOperator<String> u2 = x -> x.toUpperCase();		 
		System.out.println(u1.apply("chirp"));  // CHIRP
		System.out.println(u2.apply("chirp"));  // CHIRP

		System.out.println();		
		System.out.println(s1 );
		System.out.println(c1 );
		System.out.println(p1 );
		System.out.println(f1 );
		System.out.println(u1 );		
		
	}
}
