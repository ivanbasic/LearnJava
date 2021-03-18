package ivanbasic;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class java_11_24_600_PrimitiveStreams implements Lesson {

	public void main() {
 
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5,6,7,8);
		OptionalDouble avg = intStream.average();
		System.out.println("intStream.average()="+   avg.getAsDouble());  

	}

}
