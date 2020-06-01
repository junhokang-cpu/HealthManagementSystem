package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MenuSelction extends JFrame {
	public MenuSelction() {
		
		JFrame frame = new JFrame("HealthManagement");
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("Menu Selection");
		JButton button1 = new JButton("Add User's Information");
		JButton button2 = new JButton("Edit User's Information");
		JButton button3 = new JButton("View User's Information");
		JButton button4 = new JButton("Delete User's Information");
		JButton button5 = new JButton("Exit");
		
		panel1.setLayout(new FlowLayout());
		panel1.add(label);
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.CENTER);
		frame.setVisible(true);
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
