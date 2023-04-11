package aufgabe1;

public class Buch {
	
	private String titel;
	private String isbn;
	private int anzahlExemplare;
	
	public Buch()
	{
		
	}
	
	public Buch(String titel, String isbn, int anzahlExemplare)
	{
		this.titel = titel;
		this.isbn = isbn;
		this.anzahlExemplare = anzahlExemplare;
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
	

}
