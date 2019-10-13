package treeset;

import java.util.*;  

public class treeset{  
public static void main(String args[]){  

	//Creating and adding elements  


	TreeSet<String> set=new TreeSet<String>();  

	set.add("abhi");  

	set.add("lovee");  

	set.add("bob");  

	set.add("kaur");  

	//traversing elements  

	Iterator<String> itr=set.iterator();  

	while(itr.hasNext()){  

		System.out.println(itr.next());  
		
		}  
	}  
}