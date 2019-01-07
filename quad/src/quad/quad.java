import java.util.*;

public class quad {
	public static void main(String args[])
	{
		int a,b,c;
		double r1,r2,d;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter coeff a, b, c");
		a= s.nextInt();
		b= s.nextInt();
		c= s.nextInt();
		
		d = (b*b)-4*a*c;
		
		if(d>=0)
		{
			System.out.println("Roots are real and positive");
			r1 = ( -b + Math.sqrt(d) ) / (2*a);
			r2 = ( -b - Math.sqrt(d) ) / (2*a);
			System.out.println("First root is:"+r1);
			System.out.println("Second root is:"+r2); 
		}
		
		else {
			System.out.println("Roots are complex");
			r1 = -b / (2*a);
			r2 = Math.sqrt(-d) / (2*a);
			System.out.println("Root 1 = "+r1+"+i"+r2);
			System.out.println("Root 1 = "+r1+"-i"+r2);
		}
	}

}
