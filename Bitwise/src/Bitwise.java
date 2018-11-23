import java.util.*;

public class Bitwise {
	public static void main(String args[])
	{
		int x,y,ch;
		
		Scanner s = new Scanner(System.in);
		System.out.println("ENTER X AND Y");;
		x = s.nextInt();
		y = s.nextInt();
		for(;;)
		{
			System.out.println("\n BITWISE OPERATOR\n");
			System.out.println("1.AND");
			System.out.println("2.OR");
			System.out.println("3.XOR");
			System.out.println(" 4.LEFT SHIFT");
			System.out.println(" 5.RIGHT SHIFT");
			System.out.println(" 6.NOT");
			System.out.println(" 7.EXIT\n"); 
			System.out.println(" \n enter your choice:"); 
			ch = s.nextInt();
			
			switch(ch)
			{
			case 1: System.out.println("AND OPERATION:"+(x+y));
			break; 
			
			case 2: System.out.println("OR OPERATION:"+(x|y)); 
			break; 
			
			case 3: System.out.println("XOR OPERATION:"+(x^y)); 
			break; 
			
			case 4: System.out.println("LEFT SHIFT:"+(x<<y)); 
			break; 
			
			case 5: System.out.println("RIGHT SHIFT:"+(x>>y)); 
			break; 
			
			case 6: System.out.println("NOT of x :"+(~x));
					System.out.println("NOT of y :"+(~y)); 
			break; 
			
			case 7: System.exit(1); 
			break; 
			
			default: System.out.println("\n enter only 1 to 7"); 
			break; 
			}
		}
	}

}
