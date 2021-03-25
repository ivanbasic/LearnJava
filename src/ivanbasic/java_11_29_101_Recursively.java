/*
https://stackoverflow.com/questions/2056221/recursively-list-files-in-java
*/


package ivanbasic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class java_11_29_101_Recursively implements Lesson {
	public void main() {
		
		
		try {
			Files.find(
					Paths.get("src"), 
					Integer.MAX_VALUE, 
					(filePath, fileAttr) -> !fileAttr.isRegularFile()      )
					.forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
