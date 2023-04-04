package aufgabe1;

public class AddInteger {

	public static void main(String[] args) {
		
		if(args.length == 0)
		{
			throw new IndexOutOfBoundsException("No arguments passed!");			
		}
		
		int zahl1 = Integer.parseInt(args[0]);
		int zahl2 = Integer.parseInt(args[1]);
		int summe = zahl1+zahl2;
		
		System.out.println(zahl1 + " + " + zahl2 + " = " + summe);
		
	       
		
		
	}

}
