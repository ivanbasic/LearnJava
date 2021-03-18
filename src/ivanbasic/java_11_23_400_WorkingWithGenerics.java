package ivanbasic;

public class java_11_23_400_WorkingWithGenerics implements Lesson {

 
	public void main() {	
		//class, int, method, ?
		
	}

}

class GenericClass<T> {
	private T content;
	void Set(T t) {
		content=t;
	}
	T get() {
		return content;
	}
}
interface GenericInterface<T> {
	void accept(T t);
}
class ClassWithGenericMethod {
	 <T> void genericMethod(T t1, T t2, T t3) {
	}
}