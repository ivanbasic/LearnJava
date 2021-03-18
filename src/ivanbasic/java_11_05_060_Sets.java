package ivanbasic;

import java.util.HashSet;
import java.util.Set;

public class java_11_05_060_Sets implements Lesson {
	public void main() {
		
		Set<Integer> set = new HashSet<>();
		System.out.println("Set of Integer's");
		System.out.println(set.add(1));
		System.out.println(set.add(1)); 
		System.out.println(set.add(2));
		System.out.println(set.add(2)); 		
		System.out.println( set.size() );
		System.out.println(set.toString() );
		
		
		Set<Anything> any = new HashSet<>();		
		System.out.println("\nSet of Anything's");		
		System.out.println(any.add( new Anything()));
		System.out.println(any.add( new Anything()));
		System.out.println(any.add( new Anything()));
		System.out.println(any.toString() );		
		
		Set<Something> some = new HashSet<>();		
		System.out.println("\nSet of Something's, overrides java.lang.Object.hashCode, overrides java.lang.Object.equals ");	
		System.out.println(some.add( new Something(1)));		
		System.out.println(some.add( new Something(1)));
		System.out.println(some.add( new Something(2)));
		System.out.println(some.add( new Something(2)));
		System.out.println(some.toString() );		
		
		
	}

}

class Anything  {
}

class Something   {
	int ss;
	Something(int xx ) {
		this.ss=xx;
	}
	
	
	public int hashCode() {
		return ss;
	}
	
	
	public String toString( ) {
		return ""+ss;
	}
	
	//Don't work with Something s2!
	public boolean equals(Object s2 ) {
		return s2.hashCode() == this.hashCode();
	}
	
	
}

