package aufgabe3;

import java.awt.*;
import javax.swing.*;

public class PanelTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Hauptfenster");
		
		// Panel 1
		
			JPanel panel1 = new JPanel();
			panel1.setSize(300, 100);
			
			JLabel lblSendenAn = new JLabel("Senden an:");
			JTextField tbxEmpfaenger = new JTextField("Hier könnte Ihre Werbung stehen", 20);			
			
			panel1.add(lblSendenAn);
			panel1.add(tbxEmpfaenger);
		
		
		
		// Panel 2
			
			JPanel panel2 = new JPanel();
			
			JTextArea txtBody = new JTextArea("Hier auch", 15, 30);
			
			panel2.add(txtBody);
		
		// Panel 3
			
			JPanel panel3 = new JPanel();
			
			JButton btnVerwerfen = new JButton("Verwerfen");
			JButton btnSenden = new JButton("Senden");
			
			panel3.add(btnVerwerfen);
			panel3.add(btnSenden);		
		
		frame.add(panel1, BorderLayout.NORTH);
		frame.add(panel2, BorderLayout.CENTER);
		frame.add(panel3, BorderLayout.SOUTH);
		
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
