package aufgabe1;

public class TestParameter {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("Mustermann");
		p1.setVorname("Max");
		
		p1.printCredentials();
		
		veränderePerson(p1);
		
		p1.printCredentials();
	}
	
	public static void veränderePerson(Person person)
	{
		person.setName("Weihnachtsmann");
		person.printCredentials();
	}

}
