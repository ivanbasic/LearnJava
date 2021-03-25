package ivanbasic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class java_11_29_100_NIO2 implements Lesson {
 
	public void main() {
		try (Stream<Path> s = Files.list(Path.of(""))) {
			
			//to je lambda napisana kao metod referenca.
			//to znaci da moze da se napise kao lambda def. i kako se to ono pise?
			//s.forEach(System.out::println);
			   
			//da probam. iz prve.	
			s.forEach( x -> System.out.println(x) );			   
			   
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	 

	}
}
