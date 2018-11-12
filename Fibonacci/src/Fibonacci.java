import java.util.*;

public class Fibonacci {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int a=0,b=1,c=0,i,n;
		System.out.println("Enter the last no. of range");
		n = s.nextInt();
		
		System.out.println(a);
		System.out.println(" "+b);
		for(i=2;i<n;i++)
		{
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		System.out.println();
		System.out.println(n+"th value of the series is: "+c);
	}

}
