package testing;

import java.io.*;

public class TestDataOutputInputStream {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		
		FileOutputStream fos = new FileOutputStream("Daten.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(1);
		dos.writeDouble(1.1);
		dos.writeInt(2);
		dos.close();
		
		FileInputStream fis = new FileInputStream(("Daten.dat"));
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readDouble());
		System.out.println(dis.readInt());
		
		dis.close();

	}

}
