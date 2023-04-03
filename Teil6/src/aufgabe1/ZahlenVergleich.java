// Datei: ZahlenVergleich.java
package aufgabe1;
import java.util.Scanner;

public class ZahlenVergleich
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.print ("Gib die erste Zahl ein: ");
      int zahl1 = scan.nextInt();
      System.out.print ("Gib die zweite Zahl ein: ");
      int zahl2 = scan.nextInt();

      if (zahl1 == zahl2)
      {
    	  System.out.print ("Die Zahlen sind gleich!");
      } 
      else if (zahl1 > zahl2)
      {
    	  System.out.print ("Die Zahl " + zahl1 + " ist größer als " + zahl2);
      }
      else
      {
    	  System.out.print ("Die Zahl " + zahl2 + " ist größer als " + zahl1);
      }
   }
}
