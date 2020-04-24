import java.util.Scanner;


import User.ChildUser;
import User.SeniorUser;
import User.TeenUser;
import User.User;
import User.UserKind;

import java.util.ArrayList;

public class UserManagement {
	Scanner scan;
	ArrayList<User> users = new ArrayList<User>();
	ArrayList<Calories> cals = new ArrayList<Calories>();
	ArrayList<Exercise> exercises = new ArrayList<Exercise>();
	Exercise exercise;
	UserManagement(Scanner scan){
		this.scan = scan;			
}

	
	public void addUser() {
		int kind =0;
		User user;
		while(kind != 1 && kind !=2 && kind !=3 && kind !=4) {
		System.out.println("Select User Kind ");
		System.out.println("1.Adult");
		System.out.println("2.Senior");
		System.out.println("3.Teen");
		System.out.println("4.Child");
		kind = scan.nextInt();
		if(kind == 1) {
			user = new User(UserKind.Adult);
			user.getUserInput(scan);
			users.add(user);
			break;
		}
		else if(kind == 2) {
			user = new SeniorUser(UserKind.Senior);
			user.getUserInput(scan);
			users.add(user);
			break;
		}
		if(kind == 3) {
			user = new TeenUser(UserKind.Teen);
			user.getUserInput(scan);
			users.add(user);
			break;
		}
		if(kind == 4) {
			user = new ChildUser(UserKind.Child);
			user.getUserInput(scan);
			users.add(user);
			break;
		}
		else {
			System.out.println("Select num for User Kind between 1 and 4");
		}
		}
			
		}
	public void addcals() {	
			Calories cal = new Calories();
			
			
			System.out.println("Add what you consumed");
			cal.food = scan.nextLine();
			cal.food = scan.nextLine();
			System.out.println("Calories?");
			cal.calories = scan.nextDouble();
			cal.InfoCalo();
			cals.add(cal);
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
				
			User user = users.get(i);
			if (user.getCode() == Usercode) {
				
			int selection;
			selection = -1;
			
			while(selection !=6 ) {
				
			System.out.println(" 式式式式式式式式式式式式 Edit  式式式式式式式式式式式");
			System.out.println("弛  1.     Edit your Name       弛");
			System.out.println("弛  2.     Edit your code       弛");   
			System.out.println("弛  3.     Edit your age        弛");    
			System.out.println("弛  4.     Edit your weight     弛");    
			System.out.println("弛  5.     Edit your goal       弛");    
			System.out.println("弛  6.          Exit            弛");
			System.out.println(" 式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式 ");
			System.out.println("Select the number \"1~5\"");
			System.out.println("\n");
			selection = scan.nextInt();
			
			if(selection == 1) {
				System.out.println("Add User's Name : ");
				String name = scan.nextLine();
				name = scan.nextLine();
				user.setName(name);
			}
			if(selection ==2) {
				System.out.println("Add User code : ");
				int code = scan.nextInt();
				user.setCode(code);
		  }
			if(selection ==3) {
				System.out.println("Add User's Age");
				int age = scan.nextInt();
				user.setAge(age);
			}
			if(selection ==4) {
				System.out.println("Add User's weight");
				double weight = scan.nextDouble();
				user.setWeight(weight);
				
			}
			if(selection ==5) {
				System.out.println("Enter your goal");
				Double goal = scan.nextDouble();
				user.setGoal(goal);
			}
			else
				continue;
			}
			}
			break;
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
			int index = -1;
			for(int i=0; i<users.size(); i++){
				if (users.get(i).getCode() == code) {
					index = i;
					break;
				}
				
			}
			if (index >=0) {
				users.remove(index);
				cals.remove(index);
				exercises.remove(index);
				System.out.println("The User's code" + code + " is deleted");
			}
			else {
				System.out.println("Your data has not been registered");
				return;
			}
		}
		
}

