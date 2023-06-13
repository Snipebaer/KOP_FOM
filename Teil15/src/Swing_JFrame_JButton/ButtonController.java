package Swing_JFrame_JButton;

import java.awt.event.*;
import javax.swing.JButton;

public class ButtonController implements ActionListener {
	
	private int counter = 0;
	
	public void actionPerformed(ActionEvent action)
	{
		counter++;
		
		JButton refSource = (JButton) action.getSource();
		refSource.setText("Gedrückt:" + counter);
	}
	

}
