package ivanbasic;

import java.util.Arrays;

public class java_11_07_050_PassingDataAmongMethods implements Lesson {
	public void main() {
		int parInt = 1;
		String parString = "a";
		int[] parArray = { 1, 2 };
		SomeClass parClass = new SomeClass();

		System.out.println("int       parInt	=" + parInt);
		System.out.println("String    parString	=" + parString);
		System.out.println("int[]     parArray	=" + Arrays.toString(parArray));
		System.out.println("SomeClass parClass	=" + parClass.get());

		System.out.println("passing data among methods... PassingWithoutChange");
		PassingWithoutChange.passing(parInt, parString, parArray, parClass);

		System.out.println("int       parInt	=" + parInt);
		System.out.println("String    parString	=" + parString);
		System.out.println("int[]     parArray	=" + Arrays.toString(parArray));
		System.out.println("SomeClass parClass	=" + parClass.get());

		System.out.println("passing data among methods... PassingWithChange");
		PassingWithChange.passing(parInt, parString, parArray, parClass);

		System.out.println("int       parInt	=" + parInt);
		System.out.println("String    parString	=" + parString);
		System.out.println("int[]     parArray	=" + Arrays.toString(parArray));
		System.out.println("SomeClass parClass	=" + parClass.get());

	}

}

class PassingWithoutChange {
	static void passing(int ii, String ss, int[] oo, SomeClass cc) {
		// primitive and immutable class
		ii++;
		ss += "b";

		// new objects.
		oo = null;
		cc = new SomeClass();
		cc.set(12345678);

	}

}

class PassingWithChange {
	static void passing(int ii, String ss, int[] oo, SomeClass cc) {
		// primitive and immutable class
		ii++;
		ss += "b";

		// changing old objects!!!
		oo[0] = 12345678;
		cc.set(9999999);
	}

}

class SomeClass {
	private int number = 2;

	void set(int xx) {
		number = xx;
	}

	int get() {
		return number;
	}
}
