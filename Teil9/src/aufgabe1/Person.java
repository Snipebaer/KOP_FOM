package aufgabe1;

public class Person {
	
	private static int anzahlPersonen;
	
	protected String vorname;
	protected String name;
	
	public Person()
	{
		this("","");
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
	
	public void ausgeben()
	{
		System.out.println(this.vorname + " " + this.name);
	}
	
	public void printCredentials()
	{
		System.out.println("Vorname: " + this.vorname + System.lineSeparator() + "Nachname: " + this.name);
		System.out.println("----------");
	}
}
