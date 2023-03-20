
public class Person {
	
	private String vorname;
	private String name;
	
	
	// Methode um den Namen zu setzen
	public void setName(String pName)
	{
		name = pName;
	}
	
	// Methode um den Vornamen zu setzen
	public void setVorname(String pVorname)
	{
		vorname = pVorname;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getVorname()
	{
		return vorname;
	}
}
