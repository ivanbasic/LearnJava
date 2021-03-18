package ivanbasic;

import java.util.Optional;

public class java_11_24_200_ReturningAnOptional implements Lesson {

 
	public void main() {
		Optional<Integer> op1 =Optional.of( 23); 
		Optional<Integer> op2 =Optional.empty();  
	
		System.out.println(  op1.isEmpty()    );
		System.out.println(  op1.isPresent()  );
		System.out.println(  op1.get()        );
	
		System.out.println(    );		
		System.out.println(  op2.isEmpty()    );
		System.out.println(  op2.isPresent()  );
		//System.out.println(  opi2.get()        );
 		

		System.out.println(    );		
		System.out.println(    );		
		op1.ifPresentOrElse(  (s)->System.out.println("op1: "+s )  , ()->System.out.println("op1 is empty " )  ) ;
		op2.ifPresentOrElse(  (s)->System.out.println("op2: "+s )  , ()->System.out.println("op2 is empty " )  ) ;
		
				
		
	}

}
