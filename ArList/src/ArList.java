import java.util.*;

class ArList{  

public static void main(String args[]){  

	ArrayList<String> list=new ArrayList<String>();//Creating arraylist  

	list.add("abhi");//Adding object in arraylist  

	list.add("lovee");  

	list.add("Gurdarshan");  

	list.add("Jatinder");  

	//Traversing list through Iterator  
	Iterator<String>  itr=list.iterator();  
	
	while(itr.hasNext()){  
	
		System.out.println(itr.next()); 
		}  
	}  
}  