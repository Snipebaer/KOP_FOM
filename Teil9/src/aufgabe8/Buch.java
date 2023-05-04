package aufgabe8;
public class Buch extends Medium{	
	
	private static int bestand;	
	
//	public Buch(String titel, String isbn, int anzahlExemplare)
//	{
//		this(titel, isbn, anzahlExemplare, "");			
//	}
	
	public Buch(String isbn, String titel, String unterTitel, int anzahlExemplare)
	{
		super(isbn, titel, unterTitel, anzahlExemplare);			
		bestand++;
	}
	
	public String toString()
	{
		return "[Buch]: " + super.toString();
		
//		return "[Buch]: " + titel + " mit IBSN: " + mediumNummer + ", Bestand: " + anzahlExemplare;
//		System.out.println("[Buch]: " + titel + " mit IBSN: " + mediumNummer + ", Bestand: " + anzahlExemplare);
	}	
	
	public static int getBestand()
	{
		return bestand;
	}	
}
