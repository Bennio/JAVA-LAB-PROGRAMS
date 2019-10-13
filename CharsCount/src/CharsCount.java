import java.io.* ;
public class CharsCount {
	public static void main (String args[]) throws IOException
	{        
		String str; 
		int i = 0; 
		int count = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		System.out.print("Enter a String : "); 
		str = br.readLine(); 
		
		for(i=0; i<str.length(); i++)
		{
			count++;
		}
		System.out.println("Count is:"+count);
	}

}
