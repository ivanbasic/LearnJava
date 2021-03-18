package ivanbasic;

import java.util.Arrays;
import java.util.List;

public class java_11_23_300_ListAndLambda implements Lesson {
 
	public void main() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(numbers);    
		
		numbers.replaceAll(x -> x*2);
		System.out.println(numbers);    

		
		
	}

}
