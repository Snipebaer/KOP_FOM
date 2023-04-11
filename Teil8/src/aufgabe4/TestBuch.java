package aufgabe4;

public class TestBuch {

	public static void main(String[] args) {
		
		Buch b1 = new Buch("E Commerce", "917-123-456", 5);
		Buch b2 = new Buch("Statistics", "123-123-456", 5);	
		Buch b3 = new Buch("Simons Frisur", "333-666-999", 1, "Beatiful!");
		
		System.out.printf("%-22s%-22s%-22s%-22s\n", "Titel", "ISBN", "Anzahl Exemplare", "Untertitel");
		System.out.println("---------------------------------------------------------------------------------");	
		
		b1.ausgeben();
		b2.ausgeben();
		b3.ausgeben();
	}

}
