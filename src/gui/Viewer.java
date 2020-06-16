package gui;

import java.awt.desktop.UserSessionEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import User.UserInput;
import manage.UserManagement;

public class Viewer extends JPanel {
	
	WindowFrame frame;
	UserManagement usermanage;
	public Viewer(WindowFrame frame,UserManagement usermanage) {
		this.frame = frame;
		this.usermanage = usermanage;
		
		System.out.println(""+usermanage.size()+"");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("ID");
		model.addColumn("Age");
		model.addColumn("Weight");
		model.addColumn("Goal");
		model.addColumn("Calories");
		model.addColumn("Exercise");
		for(int i = 0 ; i<usermanage.size();i++) {
			Vector row = new Vector();
			UserInput us = usermanage.get(i);
			row.add(us.getCode());
			row.add(us.getName());
			row.add(us.getAge());
			row.add(us.getWeight());
			row.add(us.getGoal());
			row.add(us.getExercises());
			row.add(us.getCalories());
			row.add(us.getSchool());
			row.add(us.getPhone());
			row.add(us.getMedicine());
			model.addRow(row);
			
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
