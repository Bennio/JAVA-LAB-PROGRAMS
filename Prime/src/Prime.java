import java.lang.*;
import java.util.*;

public class Prime {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the limit no.");
		int n = s.nextInt();
		System.out.println("PRIME NOS ARE-->>");
		
		for(int i=1;i<=n;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					c++;
			}//end for j

			if(c==2)
				System.out.println(" "+i);
		}//end for i
	}
}
