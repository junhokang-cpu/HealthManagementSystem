package manage;
import java.util.Scanner;

import User.AdultUser;
import User.ChildUser;
import User.SeniorUser;
import User.TeenUser;
import User.User;
import User.UserInput;
import User.UserKind;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class UserManagement implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7435626570633326140L;
	
	transient Scanner scan;
	ArrayList<UserInput> users = new ArrayList<UserInput>();


	UserManagement(Scanner scan){
		this.scan = scan;
}
	public void setScanner(Scanner scan) {
	    this.scan = scan;
	}
	
	public void addUser() {
		int kind =0;
		UserInput  userInput;
		while(kind != 1 && kind !=2 && kind !=3 && kind !=4) {
			try {
		System.out.println("Select User Kind ");
		System.out.println("1.Adult");
		System.out.println("2.Senior");
		System.out.println("3.Teen");
		System.out.println("4.Child");
		kind = scan.nextInt();
		if(kind == 1) {
			userInput = new AdultUser(UserKind.Adult);
			userInput.getUserInput(scan);
			users.add(userInput);
			break;
		}
		else if(kind == 2) {
			userInput = new SeniorUser(UserKind.Senior);
			userInput.getUserInput(scan);
			users.add(userInput);
			break;
		}
		if(kind == 3) {
			userInput = new TeenUser(UserKind.Teen);
			userInput.getUserInput(scan);
			users.add(userInput);
			break;
		}
		if(kind == 4) {
			userInput = new ChildUser(UserKind.Child);
			userInput.getUserInput(scan);
			users.add(userInput);
			break;
		}
		else {
			System.out.println("Select num for User Kind between 1 and 4");
		}
			}
		catch(InputMismatchException e) {
			
			System.out.println("Enter the number 1~4");
			if(scan.hasNext()) {
				scan.next();
			}
			kind = -1;
		}
		}
			
		}


		
	
		
		
		public void editUser() {
			System.out.println("User's code ? :");
			int Usercode = scan.nextInt();
			for (int i = 0; i<users.size(); i++) {
				
			UserInput userInput = users.get(i);
		
			if (userInput.getCode() == Usercode) {
				
			int selection;
			selection = -1;
			
			while(selection !=8 ) {
				
			showEditMenu()	;
			selection = scan.nextInt();
			switch(selection) {
			case 1:
				userInput.setUserName(scan);
				break;
			case 2:
				userInput.setUserCode(scan);
				break;
			case 3:
				userInput.setUserAge(scan);
				break;
			case 4:
				userInput.setUserWeight(scan);
				break;
			case 5:
				userInput.setUserGoal(scan);
			case 6 :
				userInput.setUserExercises(scan);

			case 7 :
				userInput.setUserCalories(scan);
				break;
			default:
				continue;
			}
			}
			break;
			}
			}
		}
		
		
		// Edit user's weight, goal etc..
		
		public void viewall() {
			
			for(int i=0; i<users.size(); i++) {
				users.get(i).PrintInfo();
			}
		
			}
			
			// view User's data
		public void delete() {
			System.out.println("Your User Code? : ");
			int code =  scan.nextInt();
			int index = findIndex(code);
			removefromUsers(index,code);	
		}
		
		public int findIndex(int code) {
			int index = -1;
			for(int i=0; i<users.size(); i++){
				if (users.get(i).getCode() == code) {
					index = i;
					break;
				}
			}
			return index;
		}
		
		public int removefromUsers(int index, int code) {
			if (index >=0) {
				users.remove(index);
				System.out.println("The User's code" + code + " is deleted");
				return 1;
			}
			else {
				System.out.println("Your data has not been registered");
				return -1;
			}
		}
		
		
	
		
		public static void showEditMenu() {
			System.out.println(" 式式式式式式式式式式式式 Edit  式式式式式式式式式式式");
			System.out.println("弛  1.     Edit your Name       弛");
			System.out.println("弛  2.     Edit your code       弛");   
			System.out.println("弛  3.     Edit your age        弛");    
			System.out.println("弛  4.     Edit your weight     弛");    
			System.out.println("弛  5.     Edit your goal       弛"); 
			System.out.println("弛  6.     Edit your Exercise   弛"); 
			System.out.println("弛  7.     Edit your Calories  弛"); 
			System.out.println("弛  8.          Exit            弛");
			System.out.println(" 式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式 ");
			System.out.println("Select the number \"1~8\"");
			System.out.println("\n");
		}
		
		public int size() {
			return users.size();
		}
		
		public UserInput get(int index) {
			return (User) users.get(index);
		}
}

