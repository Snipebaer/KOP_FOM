package aufgabe1;

import java.io.*;
import java.util.Scanner;

public class TestPrintStream {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("Lesbar.txt");
		PrintStream ps = new PrintStream(fos);
					
		for(int i = 0; i < 10; i++)
		{
			ps.println(i);			
		}
		ps.close();
				
		
		//File file = new File("Lesbar.txt");		
		
		FileInputStream fis = new FileInputStream("Lesbar.txt");		
		Scanner sc = new Scanner(fis);
		
		while(sc.hasNext())
		{
			int i = sc.nextInt();
			System.out.println(i);
		}
		sc.close();
			
		
		
	}

}
