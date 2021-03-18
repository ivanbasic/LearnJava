package ivanbasic;

public class java_11_21_600_InterfacePrivatecStaticMethod  implements Lesson {

 
	public void main() {
		
		Swim tarzan = new Tarzan();
		tarzan.backstroke();
 
		
		Swim.freestyle();
		Swim.butterfly();	
		
	}

}

interface Swim {
	   private static void breathe(String type) {
		  System.out.println("");		   
	      System.out.println("Inhale");
	      System.out.println("Performing stroke: " + type);
	      System.out.println("Exhale");
	   }
	   static void butterfly()        { breathe("butterfly");  }
	   public static void freestyle() { breathe("freestyle");  }
	   default void backstroke()      { breathe("backstroke"); }
	   private void breaststroke()    { breathe("breaststroke"); }
	}
class Tarzan implements Swim {
	
}
	 