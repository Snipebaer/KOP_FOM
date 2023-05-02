package aufgabe1;

import java.util.Scanner;

public class Buch extends Medium{	
	
	private static int bestand;	
	

	public Buch(Scanner sc)
	{
		super(sc);
		bestand++;
	}
	
	public Buch(String isbn, String titel, String unterTitel, int anzahlExemplare)
	{
		super(isbn, titel, unterTitel, anzahlExemplare);			
		bestand++;
	}
	
	public String toString()
	{
		return "[Buch]: " + super.toString();
	}	
	
	public static int getBestand()
	{
		return bestand;
	}	
}
