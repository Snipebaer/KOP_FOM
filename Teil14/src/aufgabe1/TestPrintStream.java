package aufgabe1;

import java.io.*;
import java.util.Scanner;

public class TestPrintStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(PrintStream ps = new PrintStream("Lesbar.txt"))
		{
			for(int i = 0; i < 10; i++)
			{
				ps.println(i);			
			}
		}
		catch(IOException ex)
		{
			System.err.println("IO-Fehler");
			ex.printStackTrace();
		}
		
		
		
		File file = new File("Lesbar.txt");				
		try
		{
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext())
			{
				int i = sc.nextInt();
				System.out.println(i);
			}
			sc.close();
			
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
