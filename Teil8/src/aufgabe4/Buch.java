package aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class Buch {
	
	public static List<Buch> alleBuecher = new ArrayList<Buch>();
	private static int anzahlBuecher;
	
	private String titel, isbn, untertitel;	
	private int anzahlExemplare;
	
	public Buch(String titel, String isbn, int anzahlExemplare)
	{
		this(titel, isbn, anzahlExemplare, "");			
	}
	
	public Buch(String titel, String isbn, int anzahlExemplare, String untertitel)
	{
		this.titel = titel;
		this.isbn = isbn;
		this.anzahlExemplare = anzahlExemplare;		
		this.untertitel = untertitel;
		
		alleBuecher.add(this);		
		anzahlBuecher++;
	}
	
	public void ausgeben()
	{
		System.out.printf("%-22s%-22s%-22d%-22s\n",this.titel, this.isbn, this.anzahlExemplare, this.untertitel);
	}	
	
	public static int AnzahlBuecher()
	{
		return anzahlBuecher;
	}	
}
