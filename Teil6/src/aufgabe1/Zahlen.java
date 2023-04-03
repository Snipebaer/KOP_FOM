// Datei: Zahlen.java
package aufgabe1;
import java.util.Scanner;

public class Zahlen
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      int zahl = scan.nextInt();
      System.out.print ("Die eingegebene Zahl ist ");
      if (zahl == 1)
      {
         System.out.println ("EINS");
      }
      else if (zahl == 2)
      {
         System.out.println ("ZWEI");
      }
      else if (zahl == 3)
      {
         System.out.println ("DREI");
      }
      else if (zahl == 4)
      {
         System.out.println ("VIER");
      }
      else if (zahl == 5)
      {
         System.out.println ("FUENF");
      }
      else
      {  
         System.out.println ("UNBEKANNT");
      }
   }
}