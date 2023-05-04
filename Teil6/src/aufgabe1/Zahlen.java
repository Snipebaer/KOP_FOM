// Datei: Zahlen.java
package aufgabe1;
import java.util.Scanner;

public class Zahlen
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner (System.in);
      System.out.print("Geben Sie eine Zahl ein: ");
      int zahl = scan.nextInt();
      System.out.print ("Die eingegebene Zahl ist ");     
      
      switch(zahl)
      {
      case 1:
    	  System.out.println("EINS");
    	  break;
    	  
      case 2:
    	  System.out.println("ZWEI");
    	  break;
      case 3:
    	  System.out.println("DREI");
    	  break;
      case 4:
    	  System.out.println("VIER");
    	  break;
      case 5:
    	  System.out.println("FÜNF");
    	  break;
      case 6:
    	  System.out.println("SECHS");
    	  break;
      case 7:
    	  System.out.println("SIEBEN");
    	  break;
      case 8:
    	  System.out.println("ACHT");
    	  break;
      case 9:
    	  System.out.println("NEUN");
    	  break;
      case 10:
    	  System.out.println("ZEHN");
    	  break;
      default:
    	  System.out.println("UNBEKANNT");
    		  
      }
      
      
      
      
      
      
      
//      if (zahl == 1)
//      {
//         System.out.println ("EINS");
//      }
//      else if (zahl == 2)
//      {
//         System.out.println ("ZWEI");
//      }
//      else if (zahl == 3)
//      {
//         System.out.println ("DREI");
//      }
//      else if (zahl == 4)
//      {
//         System.out.println ("VIER");
//      }
//      else if (zahl == 5)
//      {
//         System.out.println ("FUENF");
//      }
//      else
//      {  
//         System.out.println ("UNBEKANNT");
//      }
   }
}