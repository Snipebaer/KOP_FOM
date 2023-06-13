package aufgabe2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class ButtonDialogAnzeigenController implements ActionListener{
	
	public void actionPerformed(ActionEvent action)
	{
		JDialog refDialog = (JDialog) action.getSource();
		refDialog.setVisible(true);
		
	}

}
