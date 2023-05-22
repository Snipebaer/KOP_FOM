// Datei: TestMedienArray.java

package aufgabe3;

public class TestMedienArray
{
   public static void main (String[] args)
   {
	   
	   
      Buch buch1 = new Buch ("Lehrbuch der SW-Technik","SW-Management", "978-3-8274-1161-7", 5);
      
      Buch buch2 = new Buch ("Lehrbuch der Agilen-Methoden", "Agile", "1378-3-8584-1161-7", 5);
      
      Zeitschrift z1 = new Zeitschrift("Zeitschrift der Dichter und Denker", "Supi", "252-5733-885-53", 5);
      
      System.out.println ("Nur Bücher erlaubt:");
      // aktueller Typparameter Buch verwenden:
      
      MedienArray<Buch> buchArr = new MedienArray<Buch>();
      buchArr.einfuegen (buch1);
      buchArr.einfuegen (buch2);
      // buchArr.einfuegen (z1); Geht nicht!
      buchArr.ausgeben();
      buchArr.sortieren();
      buchArr.ausgeben();
      
//      System.out.println ("\nNur Zeitschriften erlaubt:");
//      . . . . . 
//      System.out.println ("\nBücher und Zeitschriften erlaubt:");
//      . . . . .
   }
}