package ivanbasic;

public class java_11_21_200_NestedClasses4Flavors implements Lesson {

	public void main() {
		Outer oo = new Outer();

	}

}

class Outer {
	String str = "out";

	Outer() {
		System.out.println("constructor Outer, str=" + str + ", class=" + this.toString());
		Inner i1 = new Inner();
		Inner i2 = new Inner();
		StaticInner i3 = new StaticInner();
		StaticInner i4 = new StaticInner();		
		
		doIt();
	}

	class Inner {
		String str = "non-static-inn";

		Inner() {
			System.out.println("constructor Inner, str=" + str + ", class=" + this.toString());
		}

	}

	static class StaticInner {
		String str = "static inn";
		
		StaticInner() {
			System.out.println("constructor StaticInner, str=" + str + ", class=" + this.toString());
		}
		
	}

	abstract class AbsInner {
		String str = "absin";

		AbsInner() {
			System.out.println("constructor AbsInner, str=" + str + ", class=" + this.toString());
		}

		abstract void doAbs();
	}

	void doIt() {
		System.out.println("Outer method doIt");
		class Local {
			String str = "class-Local-in-method-doIt";

			Local() {
				System.out.println("constructor Local, str=" + str + ", class=" + this.toString());
			}

		}
		Local loc = new Local();
		AbsInner anonymous = new AbsInner() {void doAbs() {}};
	}

}