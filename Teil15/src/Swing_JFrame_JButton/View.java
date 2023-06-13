package Swing_JFrame_JButton;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;


public class View {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hauptfenster erzeugen
		JFrame jframe = new JFrame("Hauptfenster");
		
		JButton button = new JButton("Schaltflaeche 1");
		button.addActionListener(new ButtonController());
		
		
		jframe.setLayout(new FlowLayout());
		jframe.setSize(400, 400);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Schaltfläche hinzufügen
		jframe.add(button);
		
		// Hauptfenster sichtbar machen
		jframe.setVisible(true);
		
		

	}

}
