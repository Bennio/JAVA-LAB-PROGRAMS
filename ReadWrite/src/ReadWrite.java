//package filereadwrite;
import java.lang.*;
import java.io.*;

public class ReadWrite {
	public static void main(String args[]) throws IOException
	{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		FileOutputStream fout = new FileOutputStream("g.class");
		FileInputStream fin = new FileInputStream("g.class");
		char c;
		int i;
		
		do
		{
			c = (char)b.read();
			fout.write(c);
		}
		while(c!='q');
		System.out.println("\nContents of the file are");
		do
		{
			i = fin.read();
			if(i!=-1)
				System.out.print((char)i);
		}
		while(i!=-1);
		fin.close();
		fout.close();
	}

}
