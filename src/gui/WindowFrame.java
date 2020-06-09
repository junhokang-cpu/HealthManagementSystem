package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame {
	MenuSelction menu;
	public MenuSelction getMenu() {
		return menu;
	}

	public void setMenu(MenuSelction menu) {
		this.menu = menu;
	}

	public Viewer getView() {
		return view;
	}

	public void setView(Viewer view) {
		this.view = view;
	}

	public UserAdd getAdd() {
		return add;
	}

	public void setAdd(UserAdd add) {
		this.add = add;
	}

	Viewer view;
	UserAdd add;
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public WindowFrame() {
		this.setSize(700,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.menu = new MenuSelction(this);
		this.add = new UserAdd(this);
		this.view = new Viewer(this);
		this.setupPanel(menu);
		
		this.setVisible(true);
	}
}
