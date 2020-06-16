package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manage.UserManagement;
public class WindowFrame extends JFrame {
	UserManagement usermanage;
	MenuSelction menu;
	Viewer view;
	UserAdd add;
	
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

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public WindowFrame(UserManagement usermanage) {
		this.setSize(700,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.usermanage = usermanage;
		this.menu = new MenuSelction(this);
		this.add = new UserAdd(this);
		this.view = new Viewer(this,this.usermanage);
		this.setupPanel(menu);
	
		this.setVisible(true);
	}
}
