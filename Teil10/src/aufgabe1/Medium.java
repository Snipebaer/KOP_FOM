package aufgabe1;

import java.util.Scanner;

public class Medium {
	
	private String mediumNummer;
	private String titel;
	private String unterTitel;
	private int anzahlExemplare;
	
//	private static int bestand;
	
	public Medium (Scanner sc)
	{
		Scanner eingabe = new Scanner(System.in);
		
		System.out.println("Bitte geben Sie einen Namen für das Medium ein: ");
		this.titel = eingabe.next();
		
		System.out.println("Bitte geben Sie einen Untertitel für das Medium ein: ");
		this.unterTitel = eingabe.next();		
		
		System.out.println("Bitte geben Sie eine Mediumnummer ein: ");
		this.mediumNummer = eingabe.next();
		
		System.out.println("Bitte geben Sie die Anzahl Exemplare für das Medium ein: ");
		this.anzahlExemplare = eingabe.nextInt();
		
//		eingabe.close();
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
		return titel + " mit Mediumnummer: " + mediumNummer + ", Bestand: " + anzahlExemplare;
		
//		System.out.println("[Medium]: " + titel + " mit Mediumnummer: " + mediumNummer + ", Bestand: " + anzahlExemplare);
	}

}
