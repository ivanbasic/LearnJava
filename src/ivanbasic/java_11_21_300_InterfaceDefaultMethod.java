package ivanbasic;

public class java_11_21_300_InterfaceDefaultMethod  implements Lesson {

	@Override
	public void main() {
		Walk ww = new Cat2();
		Run  rr = new Cat2();
		Cat2  cc = new Cat2();
		System.out.println("cat as run, speed="+ rr.getSpeed());		
		System.out.println("cat as walk, speed="+ ww.getSpeed());
		System.out.println("cats inherited walk speed="+ cc.getWalkSpeed()	);		
		System.out.println("cats inherited run speed="+ cc.getRunSpeed()	);	
	}

}

interface Walk {
	public default int getSpeed() {
		return 5;
	}
}

interface Run {
	public default int getSpeed() {
		return 10;
	}
}

//DOES NOT COMPILE
//class Cat1 implements Walk, Run { }

class Cat2 implements Walk, Run { 
	public   int getSpeed() {
		return 7;
	}
	
	public int getWalkSpeed() {
	      return Walk.super.getSpeed();
	   }
	public int getRunSpeed() {
	      return Run.super.getSpeed();
	   }
	
}