package ivanbasic;

import java.util.stream.Stream;

public class java_11_24_500_UsingCommonTerminalOperations implements Lesson {
	public void main() {
		
		Stream<Short> 
			ff,
		    f0= ReturnStreamOfShort.finity(),		
			f1= ReturnStreamOfShort.finity(),
			f2= ReturnStreamOfShort.finity(),	
			f3= ReturnStreamOfShort.finity(),
			f4= ReturnStreamOfShort.finity(),
			f5= ReturnStreamOfShort.finity(),
			f6= ReturnStreamOfShort.finity(),	
			f7= ReturnStreamOfShort.finity(),
			f8= ReturnStreamOfShort.finity(),			
			f9= ReturnStreamOfShort.finity();
		
		
		Stream<Short> 
			i0= ReturnStreamOfShort.infinity(),		
			i1= ReturnStreamOfShort.infinity(),
			i2= ReturnStreamOfShort.infinity(),	
			i3= ReturnStreamOfShort.infinity(),
			i4= ReturnStreamOfShort.infinity(),
			i5= ReturnStreamOfShort.infinity(),
			i6= ReturnStreamOfShort.infinity(),		
			i7= ReturnStreamOfShort.infinity(),
			i8= ReturnStreamOfShort.infinity(),	
			i9= ReturnStreamOfShort.infinity(); 			
			
					
		System.out.println("FINITY" );		
		System.out.print("forEach: " );	
		f0.forEach( s-> System.out.print(s+" ") );			
		System.out.println();					
				
		System.out.println("count: "+   f1.count() );
		System.out.println("min : "+ f2.min( (s1,s2)->(s1-s2) ).get()  );
		System.out.println("max : "+ f3.max( (s1,s2)->(s1-s2) ).get()  );
		System.out.println("findAny : "+ f4.findAny().get() );
		System.out.println("anyMatch : "+ f5.anyMatch( s->s>40 ) );
		System.out.println("reduce : "+ f6.reduce( (a,b)->((short) (a+b) ) ).get()   );
		
		System.out.print("filer : "   );		
		ff = f7.filter( s -> s>10 && s<40); 
		ff.forEach( s-> System.out.print(s+" ") );					
		System.out.println();			
	 
		
		System.out.print("map : " );			
		Stream<String> fm;
		fm=f8.map(s-> "("+ s +")" );
		fm.forEach( s-> System.out.print(s+" ") );	
		System.out.println("" );			
		
		System.out.print("skip limit forEach : ");	
		f9.skip(3).limit(4).forEach(s-> System.out.print(s+" ")  );
		System.out.println("" );		
	
		
		System.out.println("" );	
		System.out.println("" );			
		System.out.println("INFINITY" );		
		//System.out.println( i1.count() );
		//System.out.println( i1.min( (s1,s2)->(s1-s2) ).get()  );
		//System.out.println( i1.max( (s1,s2)->(s1-s2) ).get()  );
		
		System.out.print("skip limit forEach : ");	
		i9.skip(3).limit(4).forEach(s-> System.out.print(s+" ")  );
		System.out.println("" );			
		
		
		
		System.out.println("" );				
		System.out.println("end" );				
		
	}

}
class ReturnStreamOfInteger  {
	static Stream<Integer> finity() {  
		Stream<Integer> finity = Stream.iterate(
				   1,                // seed
				   n ->  n <  50,  // Predicate to specify when done
				   n ->  n +  2  );  // UnaryOperator to get next value	
		return finity;		
	}
	
	
	static Stream<Integer> infinity() {  
		Stream<Integer> infinity = Stream.iterate(
			   1,                // seed
			   n ->  n +  2  );  // UnaryOperator to get next value	
		return infinity;		
		  
	}
}


// napraviti short stream je teze 
// i konstante, i zbir dva broja,  se tretiraju kao int
// kad se doda kastovanje dobije se
// (short) 32767+1 = -32768
// ciklicna petlja u krug
// mozda zgodno kao trik pitanje. 
class ReturnStreamOfShort  {
	
	static Stream<Short> finity() {  
		Stream<Short> finity = Stream.iterate(
				   (short) 1,                	// seed
				   n ->  n <  50,  			// Predicate to specify when done
				   n ->  (short) (n +  2)  );  	// UnaryOperator to get next value	
		return finity;		
	}
	
	static Stream<Short> infinity() {  
		Stream<Short> infinity = Stream.iterate(
			   (short) 1,                // seed
			   n ->  (short) (n +  2)  );  // UnaryOperator to get next value	
		return infinity;		
	}	
	
	
 
}

