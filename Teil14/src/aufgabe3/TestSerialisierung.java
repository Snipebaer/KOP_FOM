package aufgabe3;

import java.io.*;

public class TestSerialisierung {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		

		Ausleiher a1 = new Ausleiher("Simon", "Simgri", 12345);
		Ausleiher a2 = new Ausleiher("Thomas", "Gottschalk", 53);

		
		FileOutputStream fos = new FileOutputStream("Ausleiher.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(a1);
		
//		fos.write("\n".getBytes());
//		fos.write("\n".getBytes());
		
		oos.writeObject(a2);
		
		oos.close();
		
		//-----
		
		FileInputStream fis = new FileInputStream("Ausleiher.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		a1 = (Ausleiher) ois.readObject();
		a1.printCredentials();
		
		a2 = (Ausleiher) ois.readObject();
		a2.printCredentials();
		
//		System.out.println(ois.readObject().toString());		
//		System.out.println(ois.readObject().toString());
		
		
		
		
		
	}

}
