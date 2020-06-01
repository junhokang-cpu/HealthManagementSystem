package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class UserAdd extends JFrame {
	public UserAdd() {
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		//name
		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField textName = new JTextField(10);
		labelName.setLabelFor(textName);
		panel.add(labelName);
		panel.add(textName);
		//id
		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		JTextField textID = new JTextField(10);
		labelID.setLabelFor(textID);
		panel.add(labelID);
		panel.add(textID);
		
		//age
		JLabel labelage = new JLabel("Age : ", JLabel.TRAILING);
		JTextField textage = new JTextField(10);
		labelID.setLabelFor(textage);
		panel.add(labelage);
		panel.add(textage);
		
		//weight
		JLabel labelW = new JLabel("Weight : ", JLabel.TRAILING);
		JTextField textW = new JTextField(10);
		labelID.setLabelFor(textW);
		panel.add(labelW);
		panel.add(textW);
		
		//goal
		JLabel labelgoal = new JLabel("Goal  : ", JLabel.TRAILING);
		JTextField textgoal = new JTextField(10);
		labelID.setLabelFor(textgoal);
		panel.add(labelgoal);
		panel.add(textgoal);
		
		//calories
		JLabel labelCal = new JLabel("Calories : ", JLabel.TRAILING);
		JTextField textCal = new JTextField(10);
		labelID.setLabelFor(textCal);
		panel.add(labelCal);
		panel.add(textCal);
		//exercise
		JLabel labelEx = new JLabel("Exercise : ", JLabel.TRAILING);
		JTextField textEx = new JTextField(10);
		labelID.setLabelFor(textEx);
		panel.add(labelEx);
		panel.add(textEx);
		
		SpringUtilities.makeCompactGrid(panel, 7, 2, 6, 6, 6, 6);
		this.setSize(300,300);
		this.setContentPane(panel);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
