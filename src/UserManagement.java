import java.util.Scanner;

import Calories.CaloInput;
import Calories.Calories;
import Calories.FemaleCal;
import Calories.GenderKind;
import Calories.MaleCal;
import User.AdultUser;
import User.ChildUser;
import User.SeniorUser;
import User.TeenUser;
import User.User;
import User.UserInput;
import User.UserKind;
import java.util.ArrayList;

public class UserManagement {
	Scanner scan,scan2;
	ArrayList<UserInput> users = new ArrayList<UserInput>();
	ArrayList<CaloInput> cals = new ArrayList<CaloInput>();
	ArrayList<Exercise> exercises = new ArrayList<Exercise>();
	Exercise exercise;
	UserManagement(Scanner scan){
		this.scan = scan;
		this.scan2 = scan;
}

	
	public void addUser() {
		int kind =0;
		UserInput userInput;
		while(kind != 1 && kind !=2 && kind !=3 && kind !=4) {
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
			
		}
	public void addcals() {	
			CaloInput caloInput ;
			String borg = "NONE";
			System.out.println("A.Female");
			System.out.println("B.Male");
			borg = scan2.next();
			while(borg !="A" && borg !="B") {
				if (borg.equals("A")) {
					caloInput = new FemaleCal(GenderKind.Female);
					caloInput.getUserInput(scan2);
					cals.add(caloInput);
					break;
				}
				if(borg.equals("B")) {
					caloInput = new MaleCal(GenderKind.Male);
					caloInput.getUserInput(scan2);
					cals.add(caloInput);
					break;
				}
				else {
					System.out.println("Select num for between 1 and 2");
				}
			}
			}

		
		public void addexercise() {	
			Exercise exercise = new Exercise();
			
			System.out.println("Add what you exerciseed");
			exercise.move = scan.nextLine();
			exercise.move = scan.nextLine();
			System.out.println("How much calories you used per hour?");
			exercise.consume = scan.nextDouble();
			System.out.println("How many hours did you exercise?");
			exercise.time = scan.nextInt();
			exercise.InfoExer();
			exercises.add(exercise);
		}
		
		
		// add exercise
		
		
		
		
		public void editUser() {
			System.out.println("User's code ? :");
			int Usercode = scan.nextInt();
			for (int i = 0; i<users.size(); i++) {
				
			UserInput userInput = users.get(i);
			if (userInput.getCode() == Usercode) {
				
			int selection;
			selection = -1;
			
			while(selection !=6 ) {
				
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
			for(int j=0; j<cals.size(); j++) {
				cals.get(j).InfoCalo();
				
			}
			for(int k=0; k<exercises.size(); k++) {
				exercises.get(k).InfoExer();
			}
			
		}
			// view User's data
		public void delete() {
			System.out.println("Your User Code? : ");
			int code =  scan.nextInt();
			int index = findIndex(code);
			removefromUsers(index, code);	
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
				cals.remove(index);
				exercises.remove(index);
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
			System.out.println("弛  6.          Exit            弛");
			System.out.println(" 式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式 ");
			System.out.println("Select the number \"1~6\"");
			System.out.println("\n");
		}
}

