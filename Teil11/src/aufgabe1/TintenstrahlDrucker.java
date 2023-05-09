package aufgabe1;

public class TintenstrahlDrucker implements Drucker{
	
	private boolean druckerEingeschaltet;
	private int druckerID;
	private static int anzahlDrucker;
	
	public TintenstrahlDrucker()
	{		
		druckerID = ++anzahlDrucker;
	}
	
	public void druckerEinschalten()
	{
		if(!druckerEingeschaltet)
		{
			druckerEingeschaltet = true;
			System.out.println("Tintenstrahldrucker" + this.druckerID + " wurde eingeschaltet.\n");
			
			return;			
		}
		
		System.out.println("Tintenstrahldrucker" + this.druckerID + " ist bereits eingeschaltet.\n");
	}
	
	public int drucken(String text) throws DruckerNichtEingeschaltetException
	{
		if(!this.druckerEingeschaltet) throw new DruckerNichtEingeschaltetException("Tintenstrahldrucker" + this.druckerID + " nicht eingeschaltet. Druck kann nicht gestartet werden.");

		System.out.println("Tintenstrahldrucker" + this.druckerID + " meldet sich");
		System.out.println(text + "\n");
		
		return DRUCK_ERFOLGREICH;
	}
	
	public int testAusdruck()
	{
		System.out.println("Tintenstrahldrucker" + this.druckerID + " meldet sich");
		System.out.println("Test erfolgreich\n");
		
		return DRUCK_ERFOLGREICH;
	}

}
