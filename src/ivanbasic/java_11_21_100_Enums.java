package ivanbasic;

public class java_11_21_100_Enums implements Lesson {
 
	public void main() {
		
		//Cannot instantiate the type Season
		//Season season= new Season();		
		
		Season season0= Season.SUMMER;
		System.out.println(season0.name() + " " + season0.ordinal());
		System.out.println();
		
		for(Season season1: Season.values()) {
			 System.out.println(season1.name() + " " + season1.ordinal());
		}
		System.out.println();
		
		
	}
	

}

enum Season {
	   WINTER, SPRING, SUMMER, FALL
}