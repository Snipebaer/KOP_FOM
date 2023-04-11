package aufgabe5;
public class TestPerson {

	public static void main(String[] args) 
	{
		Person p1 = null;
		
		p1 = new Person("Mustermann", "Max");		
		p1.ausgeben();
		
		p1 = new Person("Simgri", "Simon");
		p1.ausgeben();
				
	}

}
