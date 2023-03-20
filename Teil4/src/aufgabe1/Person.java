package aufgabe1;

/* Die Klasse Person verwaltet Personendaten
 * @version 1.0
 * @author Kilian
 */

public class Person {
	
	private static int anzahlPersonen;
	
	private String vorname;
	private String name;
	
	public Person(String name, String vorname)
	{
		
		this.name = name;
		this.vorname = vorname;
		
		anzahlPersonen++;
	}
	
	public static int getAnzahlPersonen()
	{
		return anzahlPersonen;
	}
	
	/* Die Methode setName() setzt den Namen der Person.
	 * @param n Name der Person
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	// Methode um den Vornamen zu setzen
	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}
	
	/* Die Methode getName() gibt den Namen der Person zurück.
	 * @return Name der Person vom Typ String.
	 */
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
		System.out.println("----------");
	}
}
