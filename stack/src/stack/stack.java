package stack;

import java.util.*; 
import java.lang.*;

public class stack{  
public static void main(String args[]){  

	Stack<String> s = new Stack<String>();  

	s.push("avhi");  

	s.push("lovee");  

	s.push("mom");  

	s.push("dad");  

	s.push("dadu");  

	s.pop();
	s.pop();

	Iterator<String> itr=s.iterator();  

	while(itr.hasNext()){  

		System.out.println(itr.next());  

	
		}  
	}  
}