// Datei: ModalerDialogTest.java
package aufgabe2;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ModalerDialogTest_CodeRahmen
{
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Vaterfenster");

      // Erster Parameter: Referenz auf das Vaterfenster.
      // Zweiter Parameter: In der Titelzeile anzuzeigender Text.
      // Dritter Parameter: Gibt an, ob der Dialog in einer modalen 
      // Beziehung zu seinem Vaterfenster stehen soll.
      final JDialog dialog = new JDialog(frame, "Modaler Dialog", true);


      JButton start = new JButton ("Dialog anzeigen");
      // Controller f�r die Schaltfl�che des Vaterfensters implementieren.
      start.addActionListener (new ActionListener() 
      {		
		public void actionPerformed(ActionEvent action) {
			
			dialog.setSize(200,200);
			dialog.setVisible(true);
			
		}
	});      
      
      frame.setLayout (new FlowLayout());
      frame.add (start);
      frame.setSize (400, 100);
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.setVisible (true);


      JButton close = new JButton ("Schlie�en");
      // Controller f�r die Schaltfl�che des Dialogfensters implementieren.
      close.addActionListener (new ActionListener()
      {
         public void actionPerformed (ActionEvent action)
         {
            // Dialog unsichtbar machen und zerst�ren.
            dialog.setVisible(false);
            dialog.dispose();
         }
      });

      dialog.setLayout (new FlowLayout());
      dialog.add (close);
      dialog.setSize (200, 100);
   }
}

