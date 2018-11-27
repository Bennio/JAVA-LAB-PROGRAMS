package arraydeque;

import java.util.*;  

public class arraydeque{  
public static void main(String[] args) {  

	//Creating Deque and adding elements  

	ArrayDeque<String> deque = new ArrayDeque<String>();  

	deque.add("abhi");  

	deque.add("lovee");  

	deque.add("bob");  

	//Traversing elements  

	Iterator<String>  itr=deque.iterator();  
	
	while(itr.hasNext()){  
	
		System.out.println(itr.next());  

		}  
	}  
}  