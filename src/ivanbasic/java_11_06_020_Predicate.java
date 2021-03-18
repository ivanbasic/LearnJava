package ivanbasic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class java_11_06_020_Predicate implements Lesson {
	public void main( ) {
		PredicateSearch.doIt();
	}
}

 
class PredicateSearch {
	public static void doIt() {
		List<PrAnimal> animals = new ArrayList<PrAnimal>();
		animals.add(new PrAnimal("fish", false, true));
		animals.add(new PrAnimal("me", false, true));
		animals.add(new PrAnimal("rock", false, false));
		

		//definisana je lambda u sred srede izraza. fuj.
		//tek u zaglavlje print metode se vidi sta je koji parametar.
		print(animals, a -> a.canSwim());
		
		
		//bolje se vidi da je lambda tako definisana da je vezana za ime metoda/fje.
		print2(animals, a -> a.canSwim());
		
		
		//moze li to ljudski da se uradi?
		//prvo definicija
		Predicate<PrAnimal> lambdaExpression = a -> a.canSwim() ;
		//onda izraz
		print(animals,lambdaExpression);
		
		//i sta je poenta? da se ustedi par redova koda?
		
		
	}

	
	private static void print(List<PrAnimal> animals, Predicate<PrAnimal> checker) {
		for (PrAnimal animal : animals) {
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}

	private static void print2(List<PrAnimal> animals, Predicate2<PrAnimal> checker) {
		for (PrAnimal animal : animals) {
			if (checker.justReturnBoolean(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}	
	
	
}




class PrAnimal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public PrAnimal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean  canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}
}

interface Predicate2<T> {
	boolean justReturnBoolean(T t);
}

