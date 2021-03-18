package ivanbasic;

import java.util.Arrays;

public class java_11_05_040_Arrays implements  Lesson {
	
	public void main( ) {
		
		int[] one = {42, 55, 99};
		one[1]=-one[1];
		System.out.println( Arrays.toString(one) );
		
		
		int[][] two = {{10, 20} , {100,200} } ;
		two[1][1]=-two[1][1];
		System.out.println( Arrays.deepToString(two) );		
		
		
	}
				

}
