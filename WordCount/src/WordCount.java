import java.io.*;
public class WordCount
{
	public static void main (String args[]) throws IOException    
	{
		char ch;        
		int c=0;         
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
		System.out.print("Enter a String : ");  
		String str = br.readLine(); 
 
  for(int i = 0; i<str.length(); i ++)  
  {
	  ch = str.charAt(i);
	  if(ch!=' ')        
		  c++; 
	  }
  System.out.println("Character Count in the given string : " + c);   
  }
}