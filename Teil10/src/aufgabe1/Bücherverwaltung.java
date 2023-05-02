// Datei: B�cherverwaltung.java
package aufgabe1;


import java.util.Scanner;

public class B�cherverwaltung
{
   private Buch[] arr = new Buch [100];

   public void auswahlAnzeigen()
   {
      System.out.println("\nBitte Zahl und dann [RETURN] eingeben:");
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
            arr [Buch.getBestand()] = new Buch(eingabe);
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
      for (int i = 0; i < Buch.getBestand(); i++)
         System.out.println (arr[i]);
   }

   public static void main (String args[])
   {
      B�cherverwaltung bibliothek = new B�cherverwaltung();
      bibliothek.auswahlAnzeigen();
   }
}
