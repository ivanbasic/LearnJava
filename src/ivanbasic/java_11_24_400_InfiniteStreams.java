package ivanbasic;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class java_11_24_400_InfiniteStreams implements Lesson {

 
	public void main() {
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

		Stream<Integer> MyoddNumbers = Stream.iterate(1, new ReplaceUnary() );		
		
		
		Stream<Integer> oddNumberUnder100 = Stream.iterate(
				    1,                // seed
				    n -> n < 100,     // Predicate to specify when done
				    n -> n + 2);      // UnaryOperator to get next value		
		
		
		Stream<Integer> MyNumberUnder = Stream.iterate(
					1,                			// seed
					new ReplacePredicate(),     // Predicate to specify when done
					new ReplaceUnary() );      	// UnaryOperator to get next value		
		
		
		//same:
		//MyoddNumberUnder100.forEach( System.out::print);
		
		
		MyNumberUnder.forEach( s-> System.out.print(s+" ") );
		
		//can't do it again:
		//stream has already been operated upon or closed
		//MyNumberUnder.forEach( s-> System.out.print(s+" ") );		
		
		System.out.println();
		MyNumberUnder = Stream.iterate(2, n->n<=50, n->n+2 );
		MyNumberUnder.forEach( s-> System.out.print(s+" ") );	
		System.out.println();		
	}

}

//Just checking... Do you know what the lambda expression is?
//Yeees, I know. Let me see. n->n+2, Its unary...
class ReplaceUnary implements UnaryOperator<Integer> {
	public Integer apply(Integer t) {
		return t+2;
	}
}
//
class ReplacePredicate implements Predicate<Integer> {
	public boolean test(Integer t) {
 
		return t<50;
	}
}

