package aufgabe8;

public class Medium {
	
	private String mediumNummer;
	private String titel;
	private String unterTitel;
	private int anzahlExemplare;
	
//	private static int bestand;
	
	
	
	public Medium(String mediumNummer, String titel, String unterTitel, int anzahlExemplare)
	{
		this.mediumNummer = mediumNummer;
		this.titel = titel;
		this.unterTitel = unterTitel;
		this.anzahlExemplare = anzahlExemplare;
//		bestand++;
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
