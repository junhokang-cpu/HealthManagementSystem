package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.UserAdd;
import gui.Viewer;
import gui.WindowFrame;

public class ButtonAL implements ActionListener{
	WindowFrame frame;
	
	public ButtonAL(WindowFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		UserAdd add = frame.getAdd();
		frame.setupPanel(add);
	}

}
