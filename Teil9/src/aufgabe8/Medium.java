package aufgabe8;

public class Medium {
	
	protected String mediumNummer;
	protected String titel;
	protected String unterTitel;
	protected int anzahlExemplare;
	
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
		return "[Medium]: " + titel + " mit Mediumnummer: " + mediumNummer + ", Bestand: " + anzahlExemplare;
		
//		System.out.println("[Medium]: " + titel + " mit Mediumnummer: " + mediumNummer + ", Bestand: " + anzahlExemplare);
	}

}
