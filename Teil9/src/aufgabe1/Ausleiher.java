package aufgabe1;

public class Ausleiher extends Person{
	
	private int ausleiherNummer;
	
	public Ausleiher(String vorname, String nachname)
	{
		this(vorname, nachname, 0);
	}
	
	public Ausleiher(String vorname, String nachname, int ausleiherNummer)
	{
		super(vorname, nachname);	
		this.ausleiherNummer = ausleiherNummer;
	}
	
	public int getAusleihernummer()
	{
		return this.ausleiherNummer;
	}
	
	public void setAusleihernummer(int ausleiherNummer)
	{
		this.ausleiherNummer =  ausleiherNummer;
	}
	
	public void printCredentials()
	{
		System.out.println("Vorname: " + this.name + System.lineSeparator() + "Nachname: " + this.vorname + System.lineSeparator() + "Ausleihernummer: " + this.ausleiherNummer);
		System.out.println("----------");
	}
	
	

}
