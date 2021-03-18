package ivanbasic;

public class java_11_21_120_EnumConstructor implements Lesson {

 
	public void main() {
		System.out.println("the constructor argument list match the declaration-of-constants argument list.");
		System.out.println("but Selikoff didn't explain why");		
	}

	
}


enum Season2 {
	WINTER(100),  SUMMER (200);
	private Season2( int ii) { }
}

enum Season3 {
	WINTER( 100f ),  SUMMER ( 200f );
	private Season3( float ff) {}
}
 
enum Season4 {
	WINTER( true ),  SUMMER ( false );
	private Season4( boolean bb) {}
}
enum Season5 {
	WINTER( true,1f ),  SUMMER ( false, 2f );	
	private Season5( boolean bb, float ff) {}
}
