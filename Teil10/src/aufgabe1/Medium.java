package aufgabe1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Medium {
	
	protected String mediumNummer;
	private String titel;
	private String unterTitel;
	private int anzahlExemplare;
	
//	private static int bestand;
	
	public Medium (Scanner sc)
	{		
		try
		{		
			System.out.println("Bitte geben Sie einen Namen für das Medium ein: ");
			this.titel = sc.next();
			
			System.out.println("Bitte geben Sie einen Untertitel für das Medium ein: ");
			this.unterTitel = sc.next();		
			
			System.out.println("Bitte geben Sie die Anzahl Exemplare für das Medium ein: ");
			this.anzahlExemplare = sc.nextInt();
		}
		catch(InputMismatchException ex)
		{
			ex.printStackTrace();
			System.out.println("Bitte Zahl eingeben.");
		}
	}
	
	public Medium(String mediumNummer, String titel, int anzahlExemplare)
	{
		this(mediumNummer, titel, "", anzahlExemplare);		
	}
	
	
	
	public Medium(String mediumNummer, String titel, String unterTitel, int anzahlExemplare)
	{
		this.mediumNummer = mediumNummer;
		this.titel = titel;
		this.unterTitel = unterTitel;
		this.anzahlExemplare = anzahlExemplare;
// 		bestand++;
	}
	
//	public static int getBestand()
//	{
//		return bestand;
//	}
	
	public String toString()
	{
		return titel + ", Bestand: " + anzahlExemplare;
		
//		System.out.println("[Medium]: " + titel + " mit Mediumnummer: " + mediumNummer + ", Bestand: " + anzahlExemplare);
	}

}
