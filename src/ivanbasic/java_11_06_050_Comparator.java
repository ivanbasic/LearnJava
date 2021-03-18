package ivanbasic;

import java.util.Comparator;

public class java_11_06_050_Comparator implements Lesson {
	public void main( ) {
		Comparator<Integer> ints = (i1, i2) -> i1 - i2;

		Comparator<Integer> ints2 = (Integer i1, Integer i2) -> i1 - i2;		
		
		
		System.out.println( "Compare 11 & 17 :"+  ints.compare(11, 17)  );
		
	}

}
