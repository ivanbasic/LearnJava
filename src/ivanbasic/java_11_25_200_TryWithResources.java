package ivanbasic;

public class java_11_25_200_TryWithResources implements Lesson {

	public void main() {

		try (var bookReader = new MyFileReader("monkey")) {
			System.out.println("Try Block");

		} finally {
			System.out.println("Finally Block");
		}

		System.out.println();				
		System.out.println("multiple resources:");		
		
		try (
				var bookReader  = new MyFileReader("1");
				var movieReader = new MyFileReader("2");
				var tvReader    = new MyFileReader("3");) {
			System.out.println("Try Block");
		} finally {
			System.out.println("Finally Block");
		}
		
	}
}

class MyFileReader implements AutoCloseable {
	private String tag;

	public MyFileReader(String tag) {
		System.out.println("Open "+tag);
		this.tag = tag;
	}

	@Override
	public void close() {
		System.out.println("Closed: " + tag);
	}
}