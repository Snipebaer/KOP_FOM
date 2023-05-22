package aufgabe1;
// Datei: Buch.java


public class Buch extends Medium
{
   private static int bestand;

   public Buch (String titel, String isbn, int anzahlExemplare)
   {
	   this (titel, "", isbn, anzahlExemplare);
   }
   
   public Buch (String titel, String unterTitel, String isbn, int anzahlExemplare)
   {
	   super (titel, unterTitel, isbn, anzahlExemplare);
	   bestand++;
   }
   
   public static int getBestand()
   {
	   return bestand;
   }
   
   public String toString()
   {
      return "[Buch] " + super.toString();
   }
}