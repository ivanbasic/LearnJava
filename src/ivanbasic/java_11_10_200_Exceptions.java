package ivanbasic;

import java.io.FileInputStream;
import java.io.IOException;

public class java_11_10_200_Exceptions implements Lesson {

	public void main() {
		Fall.fall(2);
		Fall.fall(11);

		System.out.println( );					
		Fall2.fall(11);
		
		System.out.println( );			
		ReadFile.readFile( );
		
	}

	
}

class Fall {
	static void fall(int distance) {
		try {
			System.out.println( "try "+distance );			
			if (distance > 10) {
				throw new IOException();
			}
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println( "catch "+distance );
				
		} finally {
			System.out.println( "finally "+distance );			
		}
	}
}

class Fall2 {
	static void fall(int distance)   {
		try {
			System.out.println( "try "+distance );			
			if (distance > 10) {
				//throw new IOException();
			}
		 
				
		} finally {
			System.out.println( "finally "+distance );			
		}
	}
}

class ReadFile {
	public static void readFile( ) {
		try (FileInputStream is = new FileInputStream("myfile.txt")) {
			// Read file data
		} catch (IOException e) {
			//e.printStackTrace();		
			System.out.println( "the compiler replaces a try-with-resources block with a try and finally block"  );				
			System.out.println( "This catch block is optional"  );							
		} finally {
			System.out.println( "This finally block is optional"  );				
		}
	}

}

