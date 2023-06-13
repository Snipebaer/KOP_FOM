package aufgabe1;

import javax.swing.*;
import java.awt.*;

public class ContainerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Hauptfenster");
		
		JLabel lblName = new JLabel("Name");
		
		JButton btnSubmit = new JButton("Submit");
		
		JTextField txtName = new JTextField("Hier könnte Ihre Werbung stehen", 20);
		//txtName.setSize(new Dimension(50, 50));
		
		// Hauptfenster
		frame.setLayout(new FlowLayout());
		frame.setSize(500, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Label
		frame.add(lblName);	

		// Textfeld
		frame.add(txtName);
		
		// Button
		frame.add(btnSubmit);	
		
		// Haupfenster sichtbar machen
		frame.setVisible(true);
		
		

	}

}
