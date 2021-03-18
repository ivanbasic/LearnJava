package ivanbasic;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class java_11_27_100_Concurrency implements Lesson {

 
	public void main() {
		Runnable r1 = new ImlementedRunable();
		Runnable r2 = () -> System.out.println("Runnable r2" );
		Runnable r3 = () -> System.out.println("Runnable r3")  ;		
		Runnable r4 = () -> {  new Sleeper(30);} ;		
		
		System.out.println("1 implementing interface Runnable" );
		(new Thread( r1)).start();
		(new Thread( r2)).start();
		(new Thread( r3)).start();
		(new Thread( r4)).start();		

		System.out.println("2 extending class Thread" );		
		(new  ExtendedThread() ).start();
		

		System.out.println("3 Executors" );				
		ExecutorService service1 = Executors.newFixedThreadPool(40);
		ExecutorService service2  = Executors.newSingleThreadExecutor();

		System.out.println(service1 );				
		System.out.println(service2 );				

		
		service1.execute(r1);
		service1.execute(r4);
		
		service2.execute(r1);
		service2.execute(r4);
		
		System.out.println("shutdown Executors" );			

		service1.shutdown();			
		service2.shutdown();					
		
		//Stoj dok se ne izvrše svi tredovi
		System.out.println("While  Executors" );				
		while (!service1.isTerminated()) { new Sleeper(50); System.out.println("service 1 while !isTerminated"); }
		while (!service2.isTerminated()) { new Sleeper(50); System.out.println("service 2 while !isTerminated"); }
				
		System.out.println("--- END ---" );			
		
	}

}

class ImlementedRunable implements Runnable {

	public int sleepMiliSec = 10;
	
	public void run() {
		new Sleeper(sleepMiliSec);
		System.out.println(this );		
	}	
}
class ExtendedThread extends Thread {
	public void run( ) {
		new Sleeper(20);
		System.out.println(this );		
	}
	
}

class  Sleeper {
	 Sleeper(int msc ) {		 
			try {
				Thread.sleep(msc );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			System.out.println("sleep  "+msc);						
	}
}
