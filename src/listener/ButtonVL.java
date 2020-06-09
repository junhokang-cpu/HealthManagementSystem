package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.Viewer;
import gui.WindowFrame;

public class ButtonVL implements ActionListener{
	WindowFrame frame;
	
	public ButtonVL(WindowFrame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		Viewer viewer = frame.getView();
		frame.setupPanel(viewer);
	}

}
