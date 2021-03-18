package ivanbasic;

import java.util.ArrayList;

public class java_11_10_100_Exceptions implements Lesson {

 
	public void main() {
		//NotToSmartTry.doIt();
		
		
	}

}
class NotToSmartTry {
	public static void  doIt() {
		ArrayList<Integer> ints = new ArrayList<>();
		int ii=0;
		
		try {
			for(ii=0;;ii++ ) {
				ints.add(ii);
			}	
		} catch (Exception ee) {
			ee.printStackTrace();
		} catch  (OutOfMemoryError  ee) {
			System.out.println("ii=" +ii);
		}
		
	}
}