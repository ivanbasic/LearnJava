package ivanbasic;

import java.util.ArrayList;
import java.util.List;

public class java_11_08_520_GenericReturnTypes implements Lesson {
	public void main() {
 
	}

}


class Mammal {
	public List<CharSequence> play() {
		return null;
	}

	public CharSequence sleep() {
		return null;
	}
	
}

class Monkey extends Mammal {
	public ArrayList<CharSequence> play() {
		return null;
	}
}

class Goat extends Mammal {
	
	// DOES NOT COMPILE
	//public List<String> play() { return null;	} 

	public String sleep() {
		return null;
	}
}
