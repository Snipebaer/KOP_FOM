// Datei: Buecherverwaltung.java
package aufgabe4;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import entitaeten.MediumVerwaltung;

public class Buecherverwaltung extends JFrame
{
   private static final long serialVersionUID = 1L;

   public Buecherverwaltung()
   {
      // Konstruktor der Vaterklasse JFrame aufrufen.
      super ("Bücherverwaltung");

      // Layout-Manager für das Hauptfenster setzen.
      setLayout (new GridLayout (5, 1));

      dialogAufbauen();

      // Window-Listener zum Hauptfenster hinzufügen, um das
      // Ereignis abzufangen, das beim Schließen des Fensters
      // ausgelöst wird.
      addWindowListener (new WindowAdapter()
      {
         public void windowClosing (WindowEvent e)
         {
            // Referenz auf Objekt vom Typ MediumVerwaltung holen.
            MediumVerwaltung buecher = MediumVerwaltung.getRefToInstance();
            // Bücherbestand mit Hilfe des Objektes vom Typ
            // MediumVerwaltung in der Datei speichern.
            buecher.bestandSpeichern();
         }
      });

      setSize (new Dimension (250, 250));
      setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      setVisible (true);
   }

   private void dialogAufbauen()
   {
      // Controller-Objekt vom Typ ButtonController erzeugen.
      ButtonController controller = new ButtonController();

      JButton buchAufnehmen = new JButton ("Buch aufnehmen");
      buchAufnehmen.setActionCommand ("Buch aufnehmen");
      buchAufnehmen.addActionListener(controller);

      JButton ausleiherAufnehmen = new JButton ("Ausleiher aufnehmen");
      ausleiherAufnehmen.setActionCommand ("Ausleiher aufnehmen");
      ausleiherAufnehmen.addActionListener(controller);

      JButton bestandAnzeigen = new JButton ("Bestand anzeigen");
      bestandAnzeigen.setActionCommand ("Bestand anzeigen");
      bestandAnzeigen.addActionListener(controller);     

      JButton ausleihe = new JButton ("Buchausleihe erfassen");
      ausleihe.setActionCommand ("Buchausleihe erfassen");
      ausleihe.addActionListener(controller);      
      
      JButton rueckgabe = new JButton ("Buchrückgabe erfassen");
      rueckgabe.setActionCommand ("Buchrückgabe erfassen");
      rueckgabe.addActionListener(controller);  

      // 5 Schaltflächen dem Hauptfenster hinzufügen.
      add (buchAufnehmen);
      add (ausleiherAufnehmen);
      add (bestandAnzeigen);
      add (ausleihe);
      add (rueckgabe);   
   }

   public static void main (String args[])
   {
      Buecherverwaltung fenster = new Buecherverwaltung();
   }

class ButtonController implements ActionListener
{
   public void actionPerformed (ActionEvent e)
   {
      if (e.getActionCommand() == "Buch aufnehmen")
      {
    	 
         BuchAufnehmenGUI b = new BuchAufnehmenGUI (Buecherverwaltung.this);
         
      }
      // Falls Schaltfläche "Bestand anzeigen" gedrückt wurde, erzeuge den
      // Dialog BestandAnzeigenGUI.
      else if (e.getActionCommand() == "Ausleiher aufnehmen")
      {
         
      }
      else if (e.getActionCommand() == "Bestand anzeigen")
      {
    	  BestandAnzeigenGUI a = new BestandAnzeigenGUI(Buecherverwaltung.this);
      }
      else if (e.getActionCommand() == "Buchausleihe erfassen")
      {
//         . . . . .
      }
      else if (e.getActionCommand() == "Buchrückgabe erfassen")
      {
//         . . . . .
      }
      else
      {
    	  System.out.println("hi");
      }
   }
}
}
