package ivanbasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java_11_05_050_ArrayList  implements Lesson {
	public void main( ) {
		ArrayList<Integer>  aNum = new ArrayList<>();
		for(int ii=0; ii<=10; ii++) {
			aNum.add(ii*2);
		}
		System.out.println( Arrays.toString(aNum.toArray() )   );
		
		for(int ii: aNum ) {
			ii+=1;
		}
		System.out.println( Arrays.toString(aNum.toArray() )   );		
		
		aNum.forEach( (nn) -> nn++);		
		System.out.println( Arrays.toString(aNum.toArray() )   );		
		
		System.out.println( "ArrayList implements an interface called List");
		List<Integer> aList = aNum;
		System.out.println(  aList.toString() );
	
		System.out.println("Using Varargs to Create a List");
		List<String> list1 = new ArrayList<> ();
		list1.add("new"); 		
		System.out.println(  list1.toString() );		
		
		List<String> list2 = Arrays.asList("one", "two");
		//u can't touch it!
		//list2.add("new"); 
		System.out.println(  list2.toString() );				
		
		
	}
	
}
