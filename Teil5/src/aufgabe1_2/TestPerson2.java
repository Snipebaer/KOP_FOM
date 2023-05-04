package aufgabe1_2;

public class TestPerson2 {

	public static void main(String[] args) {

		Person[] refPersonen = new Person[3];
		
		refPersonen[0] = new Person("Simon", "Simgri");
		refPersonen[1] = new Person("Marlon", "Schmiddi");
		refPersonen[2] = new Person("Sarah", "Springaer");
		
		for(int i = 0; i < refPersonen.length; i++)
		{
			refPersonen[i].printCredentials();
		}
		

	}

}
