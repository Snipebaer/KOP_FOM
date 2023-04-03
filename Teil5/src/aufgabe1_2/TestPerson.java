package aufgabe1_2;
public class TestPerson {

	public static void main(String[] args) 
	{
		Person refPerson = null;
		refPerson = new Person();
		
		refPerson.setName("Mustermann");
		refPerson.setVorname("Max");
		
		refPerson.printCredentials();
		
		
	}

}
