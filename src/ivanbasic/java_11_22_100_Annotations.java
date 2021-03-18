package ivanbasic;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;


public class java_11_22_100_Annotations implements Lesson {

	public void main() {
		Tornado tornado = new Tornado();
		
		
		System.out.println( "\nclass annotations"  );			
		for ( Annotation ann: tornado.getClass().getAnnotations() ) {
			 System.out.println( ann  );		
		}

		
		System.out.println( "\nall fields annotations"  );				
		for(Field field: tornado.getClass().getDeclaredFields () )		{
			for ( Annotation ann: field.getAnnotations()  ) {
				 System.out.println( ann +" for "+field );		
			}				
		}		
		
		
		
	}

}

/* ANNOTATION DECLARATION 1 */
@Retention(RetentionPolicy.RUNTIME)
@interface Hazard {
	int danger();									/* required element */
	public String description() default "Fire";     /* optional element */
	public static final int UNKNOW= -1;             /* constant variable */  
}

/* ANNOTATION DECLARATION 2 */
@Retention(RetentionPolicy.RUNTIME)
@interface Alert{
	
}

/* ANNOTATION DECLARATION 3 */
@Retention(RetentionPolicy.RUNTIME)
@interface Ordinary{
	
}

/* ANNOTATION DECLARATION 4 */
@Retention(RetentionPolicy.RUNTIME)
@interface Special{
	
}



/* USING ANNOTATIONs*/
@Hazard(danger=100, description="Wind Damage")
@Alert
class Tornado {
	@Ordinary
	public int t1;
	
	@Ordinary
	public static int t2;

	@Ordinary
	@Special
	private int[] t3;	
	
	
}