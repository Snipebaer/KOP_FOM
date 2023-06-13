// Datei: BestandAnzeigenGUI.java

package aufgabe4;

import javax.swing.JTable;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.Dimension;
import java.lang.reflect.Array;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import entitaeten.Buch;
import entitaeten.MediumVerwaltung;

public class BestandAnzeigenGUI . . . . .
{
   private static final long serialVersionUID = 1L;

   public BestandAnzeigenGUI(JFrame parent)
   {
      super (parent, "Bestand anzeigen", true);

      dialogAufbauen();

      pack();
      setVisible (true);
   }

   private void dialogAufbauen()
   {
      // Model für die Tabelle anlegen. Die Implementierung der Klasse
      // TableModel finden Sie unterhalb der Klasse BestandAnzeigenGUI.
      TableModel model = new TableModel();
      // Tabelle anlegen und Referenz auf Model übergeben.
      JTable table = new JTable (model);

      // Tabelle mit Sortierfunktion ausstatten
      table.setRowSorter(new TableRowSorter<TableModel>(model));

      // Tabelle wird in einen scrollbaren GUI-Container vom
      // Typ JScrollPane gelegt.
      JScrollPane scrollingTable = new JScrollPane (table, 
                    ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                    ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      // Die bevorzugte Größe des scrollbaren GUI-Containers wird gesetzt.
      scrollingTable.setPreferredSize (new Dimension (500, 100));
      // Hinzufügen des GUI-Containers zum Dialogfenster.
      add (scrollingTable);
   }
}


// Eigenes Model für die GUI-Komponente JTable. Ein Model für eine GUI-
// Komponten JTable muss von der abstrakten Klasse AbstractTableModel
// ableiten.
class TableModel extends AbstractTableModel
{
   // AbstractTableModel setzt eindeutige serialVersionUID voraus.
   private static final long serialVersionUID = 1L;

   // Spaltennamen für die Tabelle festlegen.
   private String[] columnNames = { "Titel", "Untertitel", "ISBN", "Anzahl"}; 

   private MediumVerwaltung buecher = . . . . .

   // Überschriebene Methode zur Rückgabe des Spaltennamens.
   public String getColumnName (int col) 
   {
      return . . . . .
   }

   // Überschriebene Methode zur Rückgabe der Spaltenanzahl.
   public int getColumnCount() 
   {
      return Array.getLength (columnNames);
   }

   // Überschriebene Methode zur Rückgabe der Zeilenanzahl.
   public int getRowCount() 
   {
      . . . . .
   }

   // Überschriebene Methode zur Rückgabe des Wertes einer Zelle.
   public Object getValueAt (int row, int column) 
   {
      Buch ref = buecher.getBuch (row);
      if (column == 0)
         return ref.getTitel();
      else if (. . . . .)
         return ref.getUnterTitel();
      else if (. . . . .)
         return . . . . .
      else
         return . . . . .
   }
}
