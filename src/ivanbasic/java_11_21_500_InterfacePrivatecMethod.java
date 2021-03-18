package ivanbasic;

public class java_11_21_500_InterfacePrivatecMethod implements Lesson {

	public void main() {
		
		System.out.println("\nMonday");		
		MondaySchedule mon	= new MondaySchedule();
		mon.doItAll();		
		
		
		System.out.println("\nSaturday");		
		SaturdaySchedule sat	= new SaturdaySchedule();
		sat.doItAll();				
		
		
	}

}

interface Schedule {
	default void wakeUp()        {	checkTime(7);	}
	default void haveBreakfast() {	checkTime(9);	}
	default void haveLunch()     {	checkTime(12);	}
	default void workOut()       {	checkTime(18);	}

	default void doItAll() {
		wakeUp()       ;
		haveBreakfast();
		haveLunch()    ;
		workOut()      ;
		
	}
	
	private void checkTime(int hour) {
		if (hour > 17) {
			System.out.println("You're late!");
		} else {
			System.out.println("You have " + (17 - hour) + " hours left to make the appointment");
		}
	}
}

class MondaySchedule implements Schedule {
	
}
class SaturdaySchedule implements Schedule {
 
	 public void wakeUp()        {	System.out.println("skip wakeup "); 	}
	 public void haveBreakfast() {	System.out.println("skip breakfast"); 	}
 
} 

