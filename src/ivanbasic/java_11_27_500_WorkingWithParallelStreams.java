//interesantno. do 4 elementa 1-4, sve je paralelno
//5ti element, vreme se duplira
//9ti element 1-9, vreme triput duze.
//kao da je max broj istovremenih niti 4 

package ivanbasic;

import java.util.List;

public class java_11_27_500_WorkingWithParallelStreams implements Lesson {

 
	public void main() {
 
		long start = System.currentTimeMillis();
		List.of(1,2,3,4,5,6,7,8,9 )
		   //.stream()
		   .parallelStream()
		   .map(w -> doWork(w))
		   .forEach(s -> System.out.print(s + " "));
		 
		System.out.println();
		double timeTaken =  (double) (System.currentTimeMillis()-start)/1000;
		System.out.println("Time: "+timeTaken+" seconds");
 
		
	}
	private static int doWork(int input) {
		   try {
		      Thread.sleep(100);
		   } catch (InterruptedException e) {}
		   return input;
	}
	
	
	
	
}
