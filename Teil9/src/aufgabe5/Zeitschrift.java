package aufgabe5;

public class Zeitschrift {
	
	private static int bestand = 0;
	
	private String titel;
	private String unterTitel;
	private String issn;
	private int anzahlExemplare;
	
	public Zeitschrift()
	{
		this("", "", "", 0);
	}
	
	public Zeitschrift(String titel, String unterTitel, String issn, int anzahlExemplare)
	{
		this.titel = titel;
		this.unterTitel = unterTitel;
		this.issn = issn;
		this.anzahlExemplare = anzahlExemplare;
		
		bestand++;
	}
	
	public void ausgeben()
	{
		System.out.println("Titel: " + this.titel);
		System.out.println("Untertitel: " + this.unterTitel);
		System.out.println("ISSN: " + this.issn);
		System.out.println("Anzahl Exemplare: " + this.anzahlExemplare);
	}
	
	public static int getBestand()
	{
		return bestand;
	}
	
	

}
