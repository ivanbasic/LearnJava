package ivanbasic;

import java.util.Random;

public class java_11_25_300_DeclaringAssertions implements Lesson {

 
	public void main() {
		
		for (int ii = 1; ii < 10; ii++) {
			Random rd = new Random();
			assert rd.nextBoolean() : "message "+ii;			
			
		}
	}

}
