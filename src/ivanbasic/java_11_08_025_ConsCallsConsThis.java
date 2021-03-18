package ivanbasic;

public class java_11_08_025_ConsCallsConsThis implements Lesson {

 
	public void main() {
 
		ConsCallsCons ccc; 
		
		ccc= new ConsCallsCons(1);
		ccc= new ConsCallsCons(1,2);
		
	}

}
class ConsCallsCons {
	public ConsCallsCons(int i1) {
		this(i1,0);
		System.out.println("CONS I" );		
	}
	public ConsCallsCons(int i1, int i2  ) {
		System.out.println("Cons II "+i1+" "+i2);
	}	
	
}
