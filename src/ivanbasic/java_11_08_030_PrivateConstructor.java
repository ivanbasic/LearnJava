package ivanbasic;

public class java_11_08_030_PrivateConstructor implements Lesson {

 
	public void main() {
		ConstructorX ss;
		
		ss= new ConstructorX(789);
		ss= new ConstructorX("XYZUV");
		ss= ConstructorX.factory(45, "MN");
		
	}

}

class ConstructorX {
	
	public ConstructorX(int ii) {  
		this(ii, "AAAAAA"); 
		System.out.println("...from public cons");
	} 
	public ConstructorX(String ss) {
		this(11111, ss); 		
		System.out.println("...from public cons");		
	}	
	
	private ConstructorX(int ii, String  ss) {
		System.out.println("Calling private constructor "+ii+"+"+ss );
		
	}		
	public  static ConstructorX factory(int ii, String ss) {		
		System.out.println("from (static) method:");	
		return new ConstructorX(ii, ss );
		
	}
	
	
}