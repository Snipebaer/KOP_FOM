
public class Ausleiher extends Person{
	
	private int ausleiherNummer;
	
	public Ausleiher(String vorname, String nachname)
	{
		super(vorname, nachname);		
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
		System.out.println("Ausleihernummer: " + ausleiherNummer);
		System.out.println("Vorname: " + this.getVorname() + System.lineSeparator() + "Nachname: " + this.getName());
		System.out.println("----------");
	}
	
	

}
