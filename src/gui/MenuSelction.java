package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listener.ButtonAL;
import listener.ButtonVL;

public class MenuSelction extends JPanel {
	WindowFrame frame;
	
	public MenuSelction(WindowFrame frame) {
		this.frame = frame;
		this.setLayout(new BorderLayout());
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		JButton button1 = new JButton("Add User's Information");
		JButton button2 = new JButton("Edit User's Information");
		JButton button3 = new JButton("View User's Information");
		JButton button4 = new JButton("Delete User's Information");
		JButton button5 = new JButton("Exit");
		button1.addActionListener(new ButtonAL(frame));
		
		button3.addActionListener(new ButtonVL(frame));
		panel1.setLayout(new FlowLayout());
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.CENTER);
	
	
	}
}
