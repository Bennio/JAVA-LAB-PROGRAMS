package linkedhashset;

import java.util.LinkedHashSet;
import java.util.Iterator;

public class linkedhashset {
	public static void main(String args[]){  
		//Creating HashSet and adding elements  

			LinkedHashSet<String> h=new LinkedHashSet<String>();  

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

