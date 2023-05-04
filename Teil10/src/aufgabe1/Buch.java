package aufgabe1;

import java.util.Scanner;

public class Buch extends Medium{	
	
	private static int bestand;	
	

	public Buch(Scanner sc)
	{
		super(sc);		
		
		System.out.println("Bitte geben Sie eine ISBN für das Buch ein: ");
		this.mediumNummer = sc.next();				
		
		bestand++;		
	}
	
	public Buch(String isbn, String titel, String unterTitel, int anzahlExemplare)
	{
		super(isbn, titel, unterTitel, anzahlExemplare);			
		bestand++;
	}
	
	public String toString()
	{
		return "[Buch]: " + super.toString() + " mit ISBN: " + this.mediumNummer;
	}	
	
	public static int getBestand()
	{
		return bestand;
	}	
}
