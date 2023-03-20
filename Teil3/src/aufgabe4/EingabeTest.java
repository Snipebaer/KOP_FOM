package aufgabe4;
import java.util.Scanner;

public class EingabeTest {

	public static void main(String[] args) {
		
		Scanner eingabe = new Scanner(System.in);
		
		System.out.print("Erste Zahl eingeben: ");
		int zahl1 = eingabe.nextInt();
		
		System.out.print("Zweite Zahl eingeben: ");
		int zahl2 = eingabe.nextInt();
		
		int summe = zahl1 + zahl2;
		
		System.out.println(zahl1 + " + " + zahl2 + " ist Summe: " + summe);
		

	}

}
