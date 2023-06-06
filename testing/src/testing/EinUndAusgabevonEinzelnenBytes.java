package testing;

import java.io.*;

public class EinUndAusgabevonEinzelnenBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (FileOutputStream fos = new FileOutputStream("Bytes.txt"))
		{
			for (int i = 0; i < 10; i++)
			{
				fos.write(i);
			}
			System.out.println("Success");
		}
		catch (IOException ex)
		{
			System.err.println("IO-Fehler beim Schreiben");
			ex.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("Bytes.txt"))
		{
			for(int i = 0; i < 10; i++)
			{
				System.out.print(fis.read());
				System.out.print(" ");				
			}
		}
		catch (IOException ex)
		{
			System.err.println("IO Fehler beim Lesen");
			ex.printStackTrace();
		}

	}

}
