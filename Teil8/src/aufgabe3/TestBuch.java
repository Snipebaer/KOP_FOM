package aufgabe3;

public class TestBuch {

	public static void main(String[] args) {
		
		Buch b1 = new Buch("E Commerce", "917-123-456", 5);
		Buch b2 = new Buch("Statistics", "123-123-456", 5);	
		Buch b3 = new Buch("Simons Frisur", "333-666-999", 1);
		
		Buch.printAlleBuecher();	
	}

}
