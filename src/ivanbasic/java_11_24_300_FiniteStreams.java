package ivanbasic;

import java.util.List;
import java.util.stream.Stream;

public class java_11_24_300_FiniteStreams implements Lesson {

 
	public void main() {
	  Stream<String> empty = Stream.empty();          // count = 0
	  Stream<Integer> singleElement = Stream.of(1);   // count = 1
	  Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3

	  
	  var list = List.of("a", "b", "c");
	  Stream<String> fromList = list.stream();

	  var list2 = List.of("a", "b", "c");
	  Stream<String> fromListParallel = list2.parallelStream();
 
	  
	  
	  
	  System.out.println(empty );
	  System.out.println(singleElement ); 
	  System.out.println(fromArray ); 
	  System.out.println(fromList ); 	  
	  System.out.println(fromListParallel ); 	  	  
	}
	

}
