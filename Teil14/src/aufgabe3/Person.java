package aufgabe3;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static int anzahlPersonen;
	
	private String vorname;
	private String name;
	
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
	
	public String toString()
	{
		return "Name: " + name + "\nVorname: " + vorname;	
	}
}
