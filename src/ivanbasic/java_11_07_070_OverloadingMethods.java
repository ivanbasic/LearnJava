/*
TABLE 4 . Order Java uses to choose the right overloaded method
Rule Example of what will be chosen for glide(1,2)
-----------------
1 Exact match by type.
	public String glide(int i, int j) {}
2 Larger primitive type.
	public String glide(long i, long j) {}
3 Autoboxed type.
	public String glide(Integer i, Integer j) {}
4 Varargs.
	public String glide(int... nums) {}
	
	
Let’s give this a practice run using the rules in Table 4.4. What do you think this outputs?
 */

package ivanbasic;

public class java_11_07_070_OverloadingMethods implements Lesson {
	public void main() {
		
		Glider2.main(null);		
	}
	
}

class Glider2 {
	public static String glide(final String s) {
		return "1";
	}
	
	public static String glide(final String... s) {
		return "2";
	}
	
	public static String glide(final Object o) {
		return "3";
	}
	
	public static String glide(final String s, final String t) {
		return "4";
	}
	
	public static void main(final String[] args) {
		System.out.print(glide("a"));
		System.out.print(glide("a", "b"));
		System.out.print(glide("a", "b", "c"));
	}
}
