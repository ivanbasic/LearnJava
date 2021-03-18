package ivanbasic;

import java.util.Random;

public class java_11_25_100_Exceptions implements Lesson {

 
	public void main() {

		for (int ii = 1; ii < 10; ii++) {
			try {
				System.out.println("try " + ii);				
				
				Random rd = new Random();
				if (rd.nextBoolean())	throw new ExceptionYellow();
				if (rd.nextBoolean())	throw new ExceptionPink();

			} catch (ExceptionYellow ee) {
				System.out.println(" catch "+ee);
			} catch (ExceptionPink ee) {
				System.out.println(" catch "+ee);
			} finally {
				System.out.println(" finaly " + ii);
			}
		}
		
		
	}

}

class ExceptionYellow extends Exception {
	private static final long serialVersionUID = 1L;
	
}
class ExceptionPink extends Exception {
	private static final long serialVersionUID = 1L;
}

