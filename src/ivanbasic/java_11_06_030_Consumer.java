package ivanbasic;

import java.util.function.Consumer;

public class java_11_06_030_Consumer implements Lesson {
	public void main() {

		
		System.out.println("The Consumer functional interface: void accept(T t)");	
		
		
		Accepter aa = new Accepter();
		Consumer<Accepter> consumer2 = x -> x.two();
		Consumer<Accepter> consumer3 = x -> x.three();
		Consumer<Accepter> consumerM = x -> x.more(7, 8);

		System.out.println(aa);

		consumer2.accept(aa);
		consumer2.accept(aa);
		consumer2.accept(aa);
		System.out.println(aa);

		consumer3.accept(aa);
		System.out.println(aa);

		consumerM.accept(aa);
		System.out.println(aa);

	}

}

class Accepter {
	int aa = 1;

	void two() {
		System.out.println("accepting *2");
		this.aa *= 2;
	}

	int three() {
		System.out.println("accepting *3");
		this.aa *= 3;
		return aa;
	}

	int more(int a, int b) {
		System.out.println("accepting more *" + a + ", *" + b);
		this.aa *= a * b;
		return aa;
	}

	public String toString() {
		return "" + aa;
	}
}
