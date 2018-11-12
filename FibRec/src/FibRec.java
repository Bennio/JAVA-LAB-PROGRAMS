import java.util.*;
import java.lang.*;

class demo
{
	int fib(int n)
	{
		if(n==1)
			return (0);
		else if(n==2)
			return (1);
		else
			return (fib(n-1)+fib(n-2));
	}//end method
	
}//end class

public class FibRec {
	public static void main(String args[])
	{
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter the last digit of series");
		int n = s.nextInt();
		demo d = new demo(); //constructor
		System.out.println("FIB series is-->>");
		int res=0;
		for(int i=1;i<=n;i++)
		{
			res = d.fib(i);
			System.out.println(" "+res);
			//break;
		}
		System.out.println();
		System.out.println(n+"th value of the series is "+res);
	
	}

}
