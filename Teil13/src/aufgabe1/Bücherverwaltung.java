package aufgabe1;
import java.util.Collections;
import java.util.List;
//Datei: Bücherverwaltung.java
import java.util.Scanner;
import java.util.Vector;


public class Bücherverwaltung 
{
private Vector<Buch> arr = new Vector<Buch>();

public void auswahlAnzeigen()
{
   System.out.println("\nBitte Zahl und dann RETURN eingeben:");
   System.out.println ("<1> Buch anlegen");
   System.out.println ("<2> Bestand ausgeben");
   System.out.println ("<3> Beenden");
   auswahlAuswerten();
}

private void auswahlAuswerten()
{
   Scanner eingabe = new Scanner (System.in);
   int auswahl = eingabe.nextInt();
   eingabe.nextLine(); // Zeilenumbruch einlesen.

   switch (auswahl)
   {
      case 1:
      {
         arr.add(new Buch (eingabe));
         auswahlAnzeigen();
         break;
      }
      case 2:
      {
         bestandAusgeben();
         auswahlAnzeigen();
         break;
      }
      case 3:
         break;

      default:
         System.out.println ("Falsche Eingabe");
    }
}

private void bestandAusgeben()
{
//   for (int i = 0; i < Buch.getBestand(); i++)
//      System.out.println (arr.get(i));
	
	Collections.sort(arr);
	
	for (Buch element : arr)
	{
		System.out.println(element);
	}
}

public static void main (String args[])
{
   Bücherverwaltung bibliothek = new Bücherverwaltung();
   bibliothek.auswahlAnzeigen();
}
}
