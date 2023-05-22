// Datei: Zeitschrift.java

package aufgabe1;

public class Zeitschrift extends Medium
{
   private static int bestand;

   public Zeitschrift (String titel, String issn, int anzahlExemplare)
   {
	   this (titel, "", issn, anzahlExemplare);
   }
   
   public Zeitschrift (String titel, String unterTitel, String issn, int anzahlExemplare)
   {
	   super (titel, unterTitel, issn, anzahlExemplare);
	   bestand++;
   }
   
   public static int getBestand()
   {
	   return bestand;
   }
   
   public String toString()
   {
      return "[Zeitschrift] " + super.toString();
   }
}