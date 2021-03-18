package ivanbasic;

public class java_11_02_002_ThePrimitiveTypes implements Lesson {
	public void main() {
		boolean  vBoolean;
		byte 	 vByte 	 ;
		short 	 vShort  ;
		int 	 vInt 	 ;
		long 	 vLong 	 ;
		float 	 vFloat  ;
		double 	 vDouble ;
		char 	 vChar 	 ;
	
		System.out.println("MIN_VALUE MAX_VALUE"  );		
		System.out.println( );			
		System.out.println("boolean " + Boolean.FALSE 		+"   "+ Boolean.TRUE );
		System.out.println("byte 	" + Byte.MIN_VALUE 		+"   "+ Byte.MAX_VALUE );
		System.out.println("short 	" + Short.MIN_VALUE 	+"   "+ Short.MAX_VALUE );
		System.out.println("int 	" + Integer.MIN_VALUE 	+"   "+ Integer.MAX_VALUE );
		System.out.println("long 	" + Long.MIN_VALUE 		+"   "+ Long.MAX_VALUE );
		System.out.println("float 	" + Float.MIN_VALUE 	+"   "+ Float.MAX_VALUE );
		System.out.println("double 	" + Double.MIN_VALUE 	+"   "+ Double.MAX_VALUE );
		System.out.println("char    " + (int) Character.MIN_VALUE +"   "+(int)  Character.MAX_VALUE );
		

		System.out.println(  );		
		System.out.println("BYTES");	
		System.out.println(  );			
		System.out.println("boolean " + "-"  				);
		System.out.println("byte 	" + Byte.BYTES 			);
		System.out.println("short 	" + Short.BYTES 		);
		System.out.println("int 	" + Integer.BYTES 		);
		System.out.println("long 	" + Long.BYTES 			);
		System.out.println("float 	" + Float.BYTES 		);
		System.out.println("double 	" + Double.BYTES 		);
		System.out.println("char    " + Character.BYTES 	);		
		
		
		
		
	}	
 
 
 
}


