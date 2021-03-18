package ivanbasic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class java_11_29_100_NIO2 implements Lesson {
 
	public void main() {
		try (Stream<Path> s = Files.list(Path.of(""))) {
			   s.forEach(System.out::println);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	 
	}
}
