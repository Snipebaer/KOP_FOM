package aufgabe2;

public class Person {
	
	private static int anzahlPersonen;
	
	private String vorname;
	private String name;
	
	public Person()
	{
		
	}
	
	public Person(String name, String vorname)
	{
		
		this.name = name;
		this.vorname = vorname;
		
		anzahlPersonen++;
	}
	
	public static int AnzahlPersonen()
	{
		return anzahlPersonen;
	}
	
	// Methode um den Namen zu setzen
	public void setName(String name)
	{
		this.name = name;
	}
	
	// Methode um den Vornamen zu setzen
	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getVorname()
	{
		return vorname;
	}
	
	public void printCredentials()
	{
		System.out.println("Vorname: " + this.vorname + System.lineSeparator() + "Nachname: " + this.name);
		System.out.println("----------");
	}
}
