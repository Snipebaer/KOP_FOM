package aufgabe1;
import java.util.Arrays;
// Datei: IntArray.java

public class IntArray
{
   private int[] arrayOfInt = null;

   // Default-Konstruktor
   public IntArray()
   {
	   // Es wird ein Array angelegt, das einen int-Wert aufnehmen kann.
       arrayOfInt = new int [1];   
   }

   // Erweitern der Arraygröße um anzahlElemente Array-Elemente. 
   public void expand (int anzahlElemente)
   {
	   // aktuelle Array-Größe ermitteln
       int size = arrayOfInt.length;
       // neues größeres Array anlegen 
       int[] tmp = new int [size + anzahlElemente];
       
       // bestehendes zu kleines Array umkopieren 
       for (int i = 0; i < size; i++)
       {
          tmp [i] = arrayOfInt [i];
       }
       arrayOfInt = tmp;
   }

   public int max()
   {   
	  int max = 0; 
      for(int i = 0; i < arrayOfInt.length-1; i++)
      {
    	  if(arrayOfInt[i] > arrayOfInt[i+1])
    	  {
    		  max = arrayOfInt[i];
    	  }
      }
      return max;
   }

   public int min()
   {   
	   int max = 0; 
	      for(int i = 0; i < arrayOfInt.length-1; i++)
	      {
	    	  if(arrayOfInt[i] < arrayOfInt[i+1])
	    	  {
	    		  max = arrayOfInt[i];
	    	  }
	      }
	      return max; 
   }

   // Die Methode put() legt den übergebenen Wert der Variable newValue
   // an der Position index im Array ab. Der erste Aufruf erfolgt mit
   // dem Indexwert = 0. Es dürfen nur positive int-Werte übergeben werden.
   public void put (int index, int newValue)
   {
      // Liegt die Position, an die der neue Wert geschrieben werden
      // soll, außerhalb der aktuellen Arraygröße, dann muss dass
      // Array vergrößert werden.
      if (arrayOfInt.length <= index)
         expand (index - arrayOfInt.length + 1);
      arrayOfInt [index] = newValue;
   }

   // Liefert den Wert an der Array-Postion index oder -1,
   // falls der übergebene Index zu groß war.
   public int get (int index)
   {
      if (arrayOfInt.length > index)
         return arrayOfInt [index];
      // Fehlerfall, der angegebene Index ist zu groß.
      return -1;
   }

   // Methode darf nur mit Indexwerten >= 0 aufgerufen
   // werden.
   public void swap (int index1, int index2)
   {
      if ((index1 < 0) || (index2 < 0))
         return;
      int size = arrayOfInt.length;
      if ((index1 > size) || (index2 > size))
         return;
      int hilf = arrayOfInt [index1];
      arrayOfInt [index1] = arrayOfInt [index2];
      arrayOfInt [index2] = hilf;        
   }

   public float average()
   {	  
	   float sum = 0;
	   
	   for(int i = 0; i < arrayOfInt.length; i++)
	      {
	    	  sum += arrayOfInt[i];
	      }
	   
	   return sum / arrayOfInt.length;
   }

   public void sort()
   {
	 //Arrays.sort(arrayOfInt);
	   
	   for(int i = 0; i < arrayOfInt.length; i++)
	      {
		   for(int x = 0; x < arrayOfInt.length-i-1; x++)
		      {
		    	 if(arrayOfInt[x] > arrayOfInt[x+1])
		    	 {
		    		 int buffer = arrayOfInt[x];
		    		 arrayOfInt[x] = arrayOfInt[x+1];
		    		 arrayOfInt[x+1] = buffer;
		    	 }
		      }
	      }   
   }

   public void print()
   {
      System.out.println ("Ausgabe des Array-Inhaltes: ");
      for (int i = 0; i < arrayOfInt.length; i++)
      {
         System.out.print ('\t' + "Index: " + i + " Wert: "); 
         System.out.println (arrayOfInt [i]);
      }
   }
}
