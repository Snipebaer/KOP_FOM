package aufgabe3;

public class TestAusleiher {

	public static void main(String[] args) {

		Person refPerson = new Ausleiher("Max", "Mustermann", 100);
		Ausleiher refAusleiher = (Ausleiher) refPerson;
		
		refPerson.ausgeben();
		System.out.println(refAusleiher.getAusleihernummer());
		
		refAusleiher.ausgeben();
		
		
		

	}

}
