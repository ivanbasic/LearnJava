package ivanbasic;

public class java_11_08_010_This implements Lesson {

 
	public void main() {
 
		ClassThis ct= new ClassThis();
		ct.setColor("desolate");
		
		System.out.println("The color is "+ ct.getColor());
		
		
	}

	
}
class ClassThis {
	private String color;

	public void setColor(String color) {
		this.color=color;
	}
	
	public String  getColor() {
		return color;
	}	
	
}
 