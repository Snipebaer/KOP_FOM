package aufgabe3;

public class TestBankkonto {

	public static void main(String[] args) {

		Bankkonto k1 = new Bankkonto();
		
		try
		{
			k1.einzahlen(300);
			
			k1.auszahlen(100);
			
			k1.auszahlen(500);
		}
		catch (TransaktionsException ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
