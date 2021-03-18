package ivanbasic;

import java.util.List;

public class java_11_08_510_OverridingGenericMethod implements Lesson {
	public void main() {
		Anteater ae = new Anteater();
		ae.chew(   null  );
	}

}

class LongTailAnimal {
	protected void chew(List<String> input) {
		System.out.println("LongTailAnimal");
	}
}

class Anteater extends LongTailAnimal {
	protected void chew(List<String> input) {
		System.out.println("Anteater");		
	}
}