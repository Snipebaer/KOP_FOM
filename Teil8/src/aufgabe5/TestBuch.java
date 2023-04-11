package aufgabe5;

public class TestBuch {

	public static void main(String[] args) {
		
		System.out.printf("Bestand: %d", Buch.getBestand());
		
		Buch b1 = new Buch("E Commerce", "917-123-456", 5);
		Buch b2 = new Buch("Statistics", "123-123-456", 5);	
		Buch b3 = new Buch("Simons Frisur", "333-666-999", 1, "Beatiful!");
		
		System.out.printf("\nBestand: %d", Buch.getBestand());
	}

}
