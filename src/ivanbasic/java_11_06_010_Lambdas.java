package ivanbasic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class java_11_06_010_Lambdas implements Lesson {
	public void main() {
		
		TraditionalSearch.doIt();
		
		
		System.out.println();
		LambdaSearch.doIt();

		System.out.println();
		LambdaSearchTwo.doIt();

		

		
	}
	
}


class Animal {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public Animal(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}
}
interface CheckTrait {
	boolean test(PrAnimal a);
}

class CheckIfHopper implements CheckTrait {
	public boolean test(PrAnimal a) {
		return a.canHop();
	}
}

interface CheckTraitTwo {
	boolean whatever(PrAnimal a);
}



class TraditionalSearch {
	public static void doIt	() {

// list of animals
		List<PrAnimal> animals = new ArrayList<PrAnimal>();
		animals.add(new PrAnimal("fish", false, true));
		animals.add(new PrAnimal("kangaroo", true, false));
		animals.add(new PrAnimal("rabbit", true, false));
		animals.add(new PrAnimal("turtle", false, true));

		// pass class that does check
		print(animals, new CheckIfHopper());
	}

	private static void print(List<PrAnimal> animals, CheckTrait checker) {
		System.out.println("TraditionalSearch, print if Hopper");		
		for (PrAnimal animal : animals) {

			// the general check
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}


class LambdaSearch {
	public static void doIt() {

// list of animals
		List<PrAnimal> animals = new ArrayList<PrAnimal>();
		animals.add(new PrAnimal("fish", false, true));
		animals.add(new PrAnimal("kangaroo", true, false));
		animals.add(new PrAnimal("rabbit", true, false));
		animals.add(new PrAnimal("turtle", false, true));

		// pass class that does check
		System.out.println("Lambda Search, print if Hopper");			
		print(animals, a -> a.canHop() );
		
		System.out.println("Lambda Search, print can Swim");			
		print(animals, a -> a.canSwim());

		System.out.println("Lambda Search, print can't Swim");			
		print(animals, a -> !a.canSwim());		
		
	}

	private static void print(List<PrAnimal> animals, CheckTrait checker) {
		
		for (PrAnimal animal : animals) {

			// the general check
			if (checker.test(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}


class LambdaSearchTwo {
	public static void doIt() {

// list of animals
		List<PrAnimal> animals = new ArrayList<PrAnimal>();
		animals.add(new PrAnimal("fish", false, true));
		animals.add(new PrAnimal("kangaroo", true, false));
		animals.add(new PrAnimal("rabbit", true, false));
		animals.add(new PrAnimal("turtle", false, true));

		// pass class that does check
		System.out.println("LambdaSearchTwo, print if Hopper");			
		print(animals, a -> a.canHop() );
		
 
		
	}

	private static void print(List<PrAnimal> animals, CheckTraitTwo checker) {
		
		for (PrAnimal animal : animals) {

			// the general check
			if (checker.whatever(animal))
				System.out.print(animal + " ");
		}
		System.out.println();
	}
}


