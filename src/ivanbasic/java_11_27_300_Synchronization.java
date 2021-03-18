package ivanbasic;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class java_11_27_300_Synchronization implements Lesson {

	public void main() {
		SheepManager.main(null);
	}
}

class SheepManager {
	private int sheepCount = 0;

	private void incrementAndReport() {

		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		synchronized (this) {
			System.out.println((++sheepCount) + " ");
		}
	}

	public static void main(String[] args) {
		ExecutorService service = null;
		try {
			service = Executors.newFixedThreadPool(20);
			var manager = new SheepManager();
			for (int i = 0; i < 10; i++)
				service.submit(() -> manager.incrementAndReport());
		} finally {
			if (service != null)
				service.shutdown();
		}

		// my contribution.
		while (!service.isTerminated()) {
			//new SleeperAgain(1);
			System.out.print(".");
		}
	}

}


class  SleeperAgain {
	SleeperAgain(int msc ) {		 
			try {
				Thread.sleep(msc );
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			System.out.println("sleep  "+msc);						
	}
}