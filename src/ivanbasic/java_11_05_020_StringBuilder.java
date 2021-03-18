package ivanbasic;

public class java_11_05_020_StringBuilder implements Lesson {
	public void main() {
		
		StringBuilder alpha = new StringBuilder();
		for(char current = 'a'; current <= 'z'; current++) {
			alpha.append(current);
		}
		System.out.println(alpha);
		System.out.println();		
		
		StringBuilder a =new StringBuilder();
		a.append('a');
		a.append('b');				
		a.append('c');			
		System.out.println(a);
		System.out.println();				
		
		
	}
	
}
