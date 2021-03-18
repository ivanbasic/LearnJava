package ivanbasic;

public class java_11_08_530_RedeclaringPrivateMethods implements Lesson {
 
	public void main() {

		new PrivateRyan().doPublic();		
		
	}

}
class PrivateAny {
	private void doIt() {
		System.out.println("private doIt, PrivateAny." );
	}
	public void doPublic() {
		doIt();
	}
}
class PrivateRyan extends  PrivateAny {
	private void doIt() {
		System.out.println("private doIt, PrivateRyan. A Separate and independent method. Not an overridden version." );
	}	
	public void doPublic() {
		super.doPublic();
		doIt();
	}	
	
}