package ivanbasic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class java_11_27_200_SubmitAndFuture implements Lesson {

 
	public void main() {
		ExecutorService service3  = Executors.newSingleThreadExecutor();
		System.out.println(service3 );				
		
		Future<?> result= service3.submit( ()->System.out.println("lambda runable")   );
		System.out.println(result);
	
		if (service3!=null ) {
			System.out.println("service3 !-null,   shutdown" );
			service3.shutdown(); 
		}
		
		
		
	} 
}
