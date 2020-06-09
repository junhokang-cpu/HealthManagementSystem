package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Viewer extends JPanel {
	
	WindowFrame frame;
	public Viewer(WindowFrame frame) {
		this.frame = frame;
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("ID");
		model.addColumn("Age");
		model.addColumn("Weight");
		model.addColumn("Goal");
		model.addColumn("Calories");
		model.addColumn("Exercise");
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}
}
