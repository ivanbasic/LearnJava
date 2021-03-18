package ivanbasic;

public class java_11_02_004_PrimitivesAgain  implements Lesson {
	public void main() {
		
		System.out.println("\nchar");
		char ch, ch1=Character.MAX_VALUE;
		ch=0;
		ch=1;
		ch=1+1;
		ch=65;
		System.out.println("char 65="+ch  );
		
		
		
		System.out.println("\nboolean");	
		boolean bo;
		bo=false;
		bo=true;
		
		//cannot convert from int to boolean
		//bo=1;
		
		//Cannot cast from int to boolean
		//bo= (boolean) 1;
		
		
		System.out.println("\nbyte");			
		byte by,by1,by2;
		by=0;
		by=127;
		by=127-1;
		//by=127+1;
		by=-128;
		
		//cannot convert int to byte
		//by=128;
	
		//cannot convert long to byte
		//by=1L;
		
		//cannot convert from double to byte
		//by= 1.0;
		by1=100;
		by2=1;
		
		//Type mismatch: cannot convert from int to byte
		//by =by1+by2;
		//by =(byte) by1+by2;	
		by =(byte) (by1+by2);
		
		by= (byte) 123456789L;
				
		System.out.println("\nshort");			
		short sh,sh1=1,sh2=2;
		sh=0;
		sh=32767;
		sh=32767-1;
		
		//cannot convert from int
		//sh=32767+1;		
		
		//cannot convert from int
		//sh=sh1+sh2;
		
		System.out.println("\nshort again");		
		short sh3 =Short.MAX_VALUE; 
		sh3= (short) (sh3+ 1); 
		System.out.println(" (short) "+Short.MAX_VALUE+"+1 = "+   sh3 );		
		
		
		
		
		System.out.println("\nint");		
		int in, in1=Integer.MAX_VALUE, in2=Integer.MAX_VALUE;
		in=in1+in2; 
		System.out.println(""+in1+"+"+in2+"=" +in );

		System.out.println("\nlong");		
		long lo,lo1= Long.MAX_VALUE, lo2=Long.MAX_VALUE;
		lo=lo1+lo2;
		System.out.println("max+max, lo="+lo );
		lo=lo1-1;
		System.out.println("max-1, lo="+lo );		
		
		
		System.out.println("\nfloat");			
		float fl, fl1=Float.MAX_VALUE, fl2=Float.MAX_VALUE;
		fl=0;
		fl=1;
		fl=10.1f;
		
		//Type mismatch: cannot convert from double to float
		//fl=10.1;
		
		
		fl=fl1+fl2;
		System.out.println(""+fl1+"+"+fl2+"=" +fl  );
		System.out.println("Infinity-1="+(fl-1) );
		System.out.println("Infinity-Infinity="+(fl-fl) );		
		
		System.out.println("\ndouble");			
		double d, d1=Double.MAX_VALUE, d2=Double.MAX_VALUE;
		d=0;
		d=1;
		d=10.1f;
		d=10.1;
		
		d=d1+d2;
		System.out.println(""+d1+"+"+d2+"=" +d  );		
		
		
		
		
	}
}
