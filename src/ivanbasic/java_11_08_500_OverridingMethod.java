package ivanbasic;

public class java_11_08_500_OverridingMethod implements Lesson {

	public void main() {
		Cammel 		   camCam= new 	Cammel();		
		Cammel 		   camBac= new 	BactrianCammel();
		BactrianCammel bacBac= new 	BactrianCammel();
		
		 camCam.getNumberOfHumps() ;
		 camBac.getNumberOfHumps() ;		
		 bacBac.getNumberOfHumps() ;		
		 
	}

}
class Cammel {
	public void getNumberOfHumps( ) {
		System.out.println( "Number Of Humps = 1" );
	}
}
class BactrianCammel extends Cammel {
	public void getNumberOfHumps( ) {
		System.out.println( "Number Of Humps = 2" );
	}
}
