package aufgabe3;

public class MultifunktionsGeraet implements Drucker, Scanner {
	
	private boolean druckerEingeschaltet;
	private int multifunktionsgeraetID;
	private static int anzahlDrucker;
	
	public MultifunktionsGeraet()
	{
		this.multifunktionsgeraetID = ++anzahlDrucker;
	}
	
	public int testAusdruck()
	{
		System.out.println("Multifunktionsgeraet" + this.multifunktionsgeraetID + " meldet sich");
		System.out.println("Test erfolgreich\n");
		
		return DRUCK_ERFOLGREICH;
	}
	
	public int drucken(String text)
	{
		System.out.println("Multifunktionsgeraet:" + this.multifunktionsgeraetID + " meldet sich");
		System.out.println(text + "\n");
		
		return DRUCK_ERFOLGREICH;
	}
	
	public String alsTextScannen() throws ScanException
	{
		return "simulierter Text";
	}

}
