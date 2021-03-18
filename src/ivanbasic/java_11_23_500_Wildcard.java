package ivanbasic;

import java.util.ArrayList;
import java.util.List;

public class java_11_23_500_Wildcard implements Lesson {
 
	public void main() {
 
		
	}
}

class WithoutWildcard {
	public static void printList(List<Object> list) {
		for (Object x : list)
			System.out.println(x);
	}

	public static void main(String[] args) {
		List<String> keywords = new ArrayList<>();
		keywords.add("java");
		// printList(keywords); // DOES NOT COMPILE
	}
}

class WithWildcard {
	public static void printList(List<?> list) {
		for (Object x: list)
		   System.out.println(x);
		}
		public static void main(String[] args) {
		   List<String> keywords = new ArrayList<>();
		   keywords.add("java");
		   printList(keywords); // COMPILE
		}
}