// Datei: Medium.java

package aufgabe1;

import java.util.Scanner;
import java.util.InputMismatchException;

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
   
   public Medium (Scanner eingabe)
   {
	      System.out.print ("\nBitte geben Sie den Titel ein: ");
	      titel = eingabe.nextLine();
	      System.out.print ("Bitte geben Sie den Untertitel ein: ");
	      unterTitel = eingabe.nextLine();
	      while (true)
	      {
	         try
	         {
	            System.out.print("Bitte geben Sie die Exemplare ein: ");
	            anzahlExemplare = eingabe.nextInt();
	            break;
	         }
	         catch (InputMismatchException ex)
	         {
	            System.out.println ("Falsche Eingabe!");
	            System.out.println ("Bitte eine ganze Zahl eingeben!");
	         }
	         finally
	         {
	            eingabe.nextLine(); // Zeilenumbruch einlesen
	         }
	      }
   }
   
   public String toString()
   {
      return titel + " : " + mediumNummer + " : " + anzahlExemplare;
   }
}