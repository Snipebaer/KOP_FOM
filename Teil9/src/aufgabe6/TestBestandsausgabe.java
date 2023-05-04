package aufgabe6;

public class TestBestandsausgabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Medium[] alleMedien = new Medium[3];
		
		alleMedien[0] = new Buch("123-456", "Simgri Buch", "Down Under", 5);
		alleMedien[1] = new Buch("567-8999", "Simgri Buch2", "Down Over", 15);
		alleMedien[2] = new Zeitschrift("5-55-2", "Simgri Zeitschrift", "Up Under", 3);
		
		for (Medium medium : alleMedien)
		{
			medium.ausgeben();
			System.out.println("-------");
		}

	}

}
