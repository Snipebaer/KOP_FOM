package aufgabe1;

public class LaserDrucker implements Drucker {
	
	private boolean druckerEingeschaltet;
	private int druckerID;
	private static int anzahlDrucker;
	
	public LaserDrucker()
	{		
		druckerID = ++anzahlDrucker;
	}
	
	public void druckerEinschalten()
	{
		if(!druckerEingeschaltet)
		{
			druckerEingeschaltet = true;
			System.out.println("Laserdrucker" + this.druckerID + " wurde eingeschaltet.\n");
			
			return;			
		}
		
		System.out.println("Laserdrucker" + this.druckerID + " ist bereits eingeschaltet.\n");
	}
	
	public int drucken(String text) throws DruckerNichtEingeschaltetException
	{
		if(!this.druckerEingeschaltet) throw new DruckerNichtEingeschaltetException("Laserdrucker" + this.druckerID + " nicht eingeschaltet. Druck kann nicht gestartet werden.");

		System.out.println("Drucker Laser" + this.druckerID + " meldet sich");
		System.out.println(text + "\n");
		
		return DRUCK_ERFOLGREICH;
	}
	
	public int testAusdruck() throws DruckerNichtEingeschaltetException
	{
		if(!this.druckerEingeschaltet) throw new DruckerNichtEingeschaltetException("Laserdrucker" + this.druckerID + " nicht eingeschaltet. Testdruck kann nicht gestartet werden.");
		
		System.out.println("Drucker Laser" + this.druckerID + " meldet sich");
		System.out.println("Test erfolgreich\n");
		
		return DRUCK_ERFOLGREICH;
	}
	

}
