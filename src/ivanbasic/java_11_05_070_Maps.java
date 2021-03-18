package ivanbasic;

import java.util.HashMap;
import java.util.Map;

public class java_11_05_070_Maps implements Lesson {
	public void main() {
		Map<String, String> map = new HashMap<>();
		map.put("koala", "bamboo");
		map.put("cow" , "grass");		
		map.put("cat" , "bird");

		
		String food = map.get("koala"); // bamboo
		String other = map.getOrDefault("ant", "leaf"); // leaf
		for (String key: map.keySet())
		System.out.println(key + " " + map.get(key)); // koala bamboo		
		System.out.println(map.toString());
		
		
		Map<AnythingAgain, String> map2= new HashMap<>();	
		AnythingAgain a1  =new AnythingAgain();
		AnythingAgain a2  =new AnythingAgain();
		
		map2.put(a1 ,"101" );
		map2.put(a1 ,"102" );		
		map2.put(a2 ,"201" );
		map2.put(a2 ,"202" );	
		
		
		System.out.println(map2.toString());
		
	}

}

class AnythingAgain  {
}