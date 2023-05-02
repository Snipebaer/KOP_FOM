package aufgabe7;

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
	
	public void ausgeben()
	{
		super.ausgeben();
		
		System.out.println("Hadwa");
	}
	
	public void printCredentials()
	{
		super.printCredentials();
		
		System.out.println("Ausleihernummer: " + this.ausleiherNummer);
		System.out.println("----------");
	}
	
	public String toString()
	{
		return super.toString() + " mit Ausleihernummer: " + ausleiherNummer;
	}
	
	

}
