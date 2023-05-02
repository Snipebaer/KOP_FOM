package aufgabe8;

public class Zeitschrift extends Medium {
	
	private static int bestand = 0;
	
	public Zeitschrift(String issn, String titel, String unterTitel, int anzahlExemplare)
	{
		super(issn, titel, unterTitel, anzahlExemplare);		
		bestand++;
	}
	
	public String toString()
	{
		return "[Zeitschrift]: " + super.toString();
		
//		return "[Zeitschrift]: " + titel + " mit ISSN: " + mediumNummer + ", Bestand: " + anzahlExemplare;
//		System.out.println("[Zeitschrift]: " + titel + " mit ISSN: " + mediumNummer + ", Bestand: " + anzahlExemplare);
	}
	
	public static int getBestand()
	{
		return bestand;
	}
	
	

}
