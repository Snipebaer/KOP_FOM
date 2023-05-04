package Person;

public class HelloWorld {

	public static void main(String[] args) 
	{
		Ausleiher a1 = new Ausleiher();
		a1.setName("hi");
		a1.setAusleihernummer(5);
		
		System.out.println(a1.getName());
		System.out.println(a1.getAusleihernummer());

	}

}
