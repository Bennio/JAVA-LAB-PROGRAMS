import java.util.*;

public class MatrixMulti {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter order of matrix A");
		int m = s.nextInt();
		int n = s.nextInt();
		System.out.println("Enter elements of matrix A");
		int a[][] = new int[m][n];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				a[i][j] = s.nextInt();
		}//end for
		
		System.out.println("Enter order of matrix B");
		int p = s.nextInt();
		int q = s.nextInt();
		System.out.println("Enter elements of matrix B");
		int b[][] = new int[p][q];
		for(int i=0;i<p;i++)
		{
			for(int j=0;j<q;j++)
				a[i][j] = s.nextInt();
		}//end for
	
		int mul[][] = new int[m][q];
		int sum=0;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<q;j++)
			{
				
				for(int k=0;k<n;k++)
				{
					sum = sum + a[i][k]*b[k][j] ;
				}//end for k
				mul[i][j] = sum;
				sum=0;
			}//end for j
		}//end for i
		
		System.out.println("MATRIX MULTI IS");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<q;j++)
			{
				System.out.print(mul[i][j]);
				System.out.print("\t");
			}//end for
			System.out.println();
		}//end for i
	
	}//end main
	

}//end class
