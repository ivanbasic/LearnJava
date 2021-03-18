package ivanbasic;

public class java_11_05_010_Strings implements Lesson {
	public void main() {
		String str= "01234567890123";
		System.out.println(str);
		
		System.out.println("length="+  str.length()    );
		
		System.out.println("charAt(0)="+  str.charAt(0)  );
		System.out.println("charAt(6)="+  str.charAt(6)    );		
		//System.out.println("charAt(99)="+  str.charAt(99)    );		
		
		System.out.println("indexOf('0')="+  str.indexOf('0')  );			
		System.out.println("indexOf('0',10)="+  str.indexOf('0',10)  );				
		System.out.println("indexOf('0',12)="+  str.indexOf('0',12)  );	
		System.out.println("indexOf('890' )="+  str.indexOf("890")  );	

		System.out.println("substring(0  )="+  str.substring(0)  );			
		System.out.println("substring(2,5  )="+  str.substring(2,5)  );		
		//System.out.println("substring(-3  )="+  str.substring(-3)  );		
		//System.out.println("substring(0,99  )="+  str.substring(0,99)  );			
		
		System.out.println("startsWith(\"123\"  )="+  str.startsWith("012")  );			
		System.out.println("endsWith(\"123\"  )="+  str.endsWith("123")  );		
		
		System.out.println("replace( \"12\", \"..\"  )="+  str.replace( "12", ".." )  );				

		System.out.println();		
		str= "  СРЕДИНА  ";
		System.out.println('"'+ str+'"');		
		System.out.println("trim(str  )="+  str.trim(  )  );			
		System.out.println("strip(str  )="+  str.strip(  )  );		 		
		
	}

}
