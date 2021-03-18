package ivanbasic;

import java.util.List;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.LinkedBlockingQueue;

public class java_11_27_400_UsingConcurrentCollections implements Lesson {

 
	public void main() {
		
		ConcurrentMap <O1, O2>  a1 =  new   ConcurrentHashMap     <>();              	   
		Queue         <O1> 		a2 =  new   ConcurrentLinkedQueue <>();                                   
	    ConcurrentMap <O1,O2> 	a3 =  new   ConcurrentSkipListMap <>();
	    SortedMap     <O1,O2>   a4 =  new   ConcurrentSkipListMap <>();
	    NavigableMap  <O1,O2>   a5 =  new   ConcurrentSkipListMap <>();                       
	    SortedSet     <O1>      a6 =  new   ConcurrentSkipListSet <>();
	    NavigableSet  <O1>      a7 =  new   ConcurrentSkipListSet <>();                        
	    List          <O1>      a8 =  new   CopyOnWriteArrayList  <>();            
	    Set           <O1>      a9 =  new   CopyOnWriteArraySet   <>();            
	    BlockingQueue <O1>      aA =  new   LinkedBlockingQueue   <>();

		
		
	}

}
class O1 {}
class O2 {}
