package aufgabe8;

public class Zeitschrift extends Medium {
	
	private static int bestand = 0;
	
	public Zeitschrift(String issn, String titel, String unterTitel, int anzahlExemplare)
	{
		super(issn, titel, unterTitel, anzahlExemplare);		
		bestand++;
	}
	
	public void ausgeben()
	{
		System.out.println("[Zeitschrift]: " + titel + " mit ISSN: " + mediumNummer + ", Bestand: " + anzahlExemplare);
	}
	
	public static int getBestand()
	{
		return bestand;
	}
	
	

}
