package ivanbasic;

public class java_11_07_030_WorkingWithVarargs implements Lesson {
	public void main() {

		
		System.out.println("walk(int start, int... nums), length of nums:" );		
		
		walk(1); // 0
		walk(1, 2); // 1
		walk(1, 2, 3); // 2
		walk(1, new int[] { 4, 5 }); // 2

	}

	public static void walk(int start, int... nums) {
		System.out.println(nums.length);
	}

}
