package aufgabe1_3;
public class TestPerson {

	public static void main(String[] args) 
	{
		Person derMax = new Person("Mustermann", "Max");	
		Person derRalf = new Person("Meister", "Ralf");
		
		derMax.printCredentials();	
		derRalf.printCredentials();
		
		System.out.println("Anzahl Personen: " + Person.getAnzahlPersonen());
	}

}
