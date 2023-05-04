package aufgabe3;

public class Bankkonto {

	private double kontostand;
	
	
	public void einzahlen(double betrag) throws TransaktionsException
	{		
		if(betrag < 0)
		{
			throw new TransaktionsException("Es kann kein Betrag kleiner gleich 0 eingezahlt werden.");
		}
		
		kontostand += betrag;
		
		System.out.println("Betrag: " + betrag + " erfolgreich eingezahlt.\nNeuer Kontostand: " + kontostand + "eur\n");
	}
	
	public void auszahlen(double betrag) throws TransaktionsException
	{
		if(kontostand < betrag)
		{
			throw new TransaktionsException("Kontostand zu gering. Auszahlung kann nicht getätigt werden.");
		}
		
		kontostand -= betrag;
		
		System.out.println("Betrag: " + betrag + " erfolgreich ausgezahlt.\nNeuer Kontostand: " + kontostand + "eur\n");

	}
	
	public double getKontostand()
	{
		return kontostand;
	}
	
}
