import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import logpack.EventLogger;
public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	public static void main(String[] args) {
		UserManagement usermanage = getObject("Usermanager.ser");
		int selection;
		Scanner scan = new Scanner(System.in);
		selection = -1;
		if(usermanage == null) {
			usermanage = new UserManagement(scan);
			
		}
		else {
			usermanage.setScanner(scan);;
		}
			
		selectMenu(scan, usermanage);
		putObject(usermanage,"Usermanager.ser");
		}
	
	public static void selectMenu(Scanner scan, UserManagement usermanage) {
		int selection;
		selection = -1;
		
		while(selection !=5 ) {
			try {
		showMenu() ;
		selection = scan.nextInt();
		
		switch(selection) {
		case 1 :
			usermanage.addUser();
			logger.log("add User");
			break;
		case 2:
			usermanage.editUser();
			logger.log("edit User");
			break;
		case 3:
			usermanage.viewall();
			logger.log("view User");
			break;
		case 4:
			usermanage.delete();
			logger.log("delete User");
			break;
		default:
			continue;
	
				}
			} 
		catch(InputMismatchException e) {
				System.out.println("Enter the number between 1~5");
				if(scan.hasNext()) {
					scan.next();
				}
				selection = -1;
			}
		
		}
	}
	
	public static void showMenu() {
		System.out.println(" 式式式式式式式式式式式式 MENU  式式式式式式式式式式式");
		System.out.println("弛  1.  Add User's information  弛");  
		System.out.println("弛  2.  Edit User's information 弛");    
		System.out.println("弛  3.  View User's information 弛");
		System.out.println("弛  4.Delete User's information 弛");
		System.out.println("弛  5.          Exit            弛");
		System.out.println(" 式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式 ");
		System.out.println("Select the number \"1~5\"");
		System.out.println("\n");
	}
	public static UserManagement getObject(String filename) {
		UserManagement usermanage = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream obj = new ObjectInputStream(file);
			usermanage = (UserManagement)obj.readObject();
			obj.close();
			file.close();
			
		} 
		catch(FileNotFoundException e) {
			return usermanage;
		}
		catch (IOException e) {
		
		}
		catch(ClassNotFoundException e) {
			
		}
		return 	usermanage;
	}


public static void putObject(UserManagement usermanage, String filename) {

	try {
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream obj = new ObjectOutputStream(file);
		obj.writeObject(usermanage);
		
		obj.close();
		file.close();
		
	} 
	catch(FileNotFoundException e) {
		
	}
	catch (IOException e) {
	
	}
}

}