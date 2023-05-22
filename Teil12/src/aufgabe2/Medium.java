// Datei: Medium.java

package aufgabe2;

public class Medium
{
   protected String titel;
   protected String mediumNummer;
   protected String unterTitel;
   protected int anzahlExemplare;

   public Medium (String titel, String unterTitel, String mediumNummer, int anzahlExemplare)
   {
	   this.titel = titel;
	   this.unterTitel = unterTitel;
	   this.mediumNummer = mediumNummer;
	   this.anzahlExemplare = anzahlExemplare;
   }
   
   public String toString()
   {
      return titel + " : " + mediumNummer + " : " + anzahlExemplare;
   }
}