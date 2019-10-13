import java.util.*;  

public class Linkedlist{  
public static void main(String args[]){  

	LinkedList<String> ll=new LinkedList<String>();  

	ll.add("ABHI");  

	ll.add("LOVEE");  

	ll.add("MRINAL");  

	ll.add("ANISH");  

	Iterator<String>  itr = ll.iterator();  

	while(itr.hasNext()){  

		System.out.println(itr.next());  

		}  

	}  

}