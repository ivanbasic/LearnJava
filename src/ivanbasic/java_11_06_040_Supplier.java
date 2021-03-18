package ivanbasic;

import java.util.Random;
import java.util.function.Supplier;

public class java_11_06_040_Supplier implements Lesson {
	public void main( ) {
		Supplier<Integer> random = () -> new Random().nextInt();
		MySupplier<Integer> myRandom = () -> new Random().nextInt(9);
		
		
		for (int ii=1; ii<=5;ii++ ) {
			System.out.println("random #"+ii+" = "+	 myRandom.get());
		}	
	}
	
}
 
interface MySupplier<T>  {
	T get();
}
