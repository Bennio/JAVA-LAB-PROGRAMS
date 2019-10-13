package hashset;

import java.util.*;  

public class hashset{  
public static void main(String args[]){  
//Creating HashSet and adding elements  

	HashSet<String> h=new HashSet<String>();  

	h.add("abhi");  

	h.add("lovee");  

	h.add("abhi");  

	h.add("lovee");  

	//Traversing elements  

	Iterator<String> itr=h.iterator();  

	while(itr.hasNext()){  

		System.out.println(itr.next());  

	
		}  
	}  
}
