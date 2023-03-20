
public class Person {
	
	private String vorname;
	private String name;
	
	public Person(String name, String vorname)
	{
		this.name = name;
		this.vorname = vorname;
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
		System.out.println("Vorname: " + vorname + System.lineSeparator() + "Nachname: " + name);
	}
}
