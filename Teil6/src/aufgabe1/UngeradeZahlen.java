// Datei: UngeradeZahlen.java
package aufgabe1;
import java.util.Scanner;

public class UngeradeZahlen
{
   public static void main (String[] args)
   {
      int startwert, endwert;
      Scanner scan = new Scanner (System.in);

      System.out.println ("Dieses Programm gibt alle " +
                          "ungeraden Zahlen zwischen " +
                          "dem Startwert und Endwert aus.");
      System.out.print ("Gib den Startwert ein: ");
      startwert = scan.nextInt();

      do
      {
         System.out.print ("Gib den Endwert ein: ");
         endwert = scan.nextInt();
         System.out.println();
      } while (endwert < startwert);

//      for (int i = startwert; i <= endwert; i++)
//      {
//         if(i%2==0)
//         {
//        	 continue;
//         }
//
//         System.out.println ("Die Zahl " + i + " ist ungerade!");
//      }
//      int i = startwert;
      
      while(startwert <= endwert)
      {
    	  if(startwert%2==0)
    	  {
    		  startwert++;
    		  continue;
    	  }   	  
    	  
    	  System.out.println ("Die Zahl " + startwert + " ist ungerade!");
    	  
    	  startwert++;
    	  
      }
      
      
      
   }
}
