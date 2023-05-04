package aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class Buch {
	
	public static List<Buch> alleBuecher = new ArrayList<Buch>();
	
	private String titel;
	private String isbn;
	private int anzahlExemplare;
	
	private static int anzahlBuecher;
	
//	public Buch()
//	{
//		alleBuecher.add(this);
//		anzahlBuecher++;
//	}
	
	public Buch(String titel, String isbn, int anzahlExemplare)
	{
		this.titel = titel;
		this.isbn = isbn;
		this.anzahlExemplare = anzahlExemplare;		
		
		alleBuecher.add(this);		
		anzahlBuecher++;
	}
	
	public void setTitel(String titel)
	{
		this.titel = titel;
	}
	
	public String getTitel()
	{
		return this.titel;
	}
	
	public void setIsbn(String isbn)
	{
		this.isbn = isbn;
	}
	
	public String getIsbn()
	{
		return this.isbn;
	}
	
	public void setAnzahlExemplare(int anzahlExemplare)
	{
		this.anzahlExemplare = anzahlExemplare;
	}
	
	public int getAnzahlExemplare()
	{
		return this.anzahlExemplare;
	}
	
	public static int AnzahlBuecher()
	{
		return anzahlBuecher;
	}	
	
	public static void printAlleBuecher()
	{
		System.out.printf("%-22s%-22s%-22s\n","Titel","ISBN","Anzahl Exemplare");
		
		for (Buch buch : alleBuecher)
		{
			Buch ab = buch;			
			System.out.printf("%-22s%-22s%-30d\n", buch.getTitel(), buch.getIsbn(), buch.getAnzahlExemplare());
		}		
		System.out.println("--------------\nAnzahl Bücher: " + anzahlBuecher);
	}
	

}
