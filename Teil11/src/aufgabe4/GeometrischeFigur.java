// Datei: GeometrischeFigur_Vorlage.java
package aufgabe4;

public abstract class GeometrischeFigur
{
   protected abstract double berechneFlaeche();
   protected abstract double berechneUmfang();

   public void print()
   {
      System.out.println ("Die Fl�che betr�gt: " +
                          berechneFlaeche());
      System.out.println ("Der Umfang betr�gt: " +
                          berechneUmfang());
      System.out.println();
   }
}
