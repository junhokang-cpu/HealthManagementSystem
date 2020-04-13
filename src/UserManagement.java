import java.util.Scanner;
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
		User user = new User();
		System.out.println("Add User's Name : ");
		user.name = scan.nextLine();
		user.name = scan.nextLine();
		System.out.println("Add User code : ");
		user.code = scan.nextInt();
		System.out.println("Add User's Age");
		user.age = scan.nextInt();
		System.out.println("Add User's weight");
		user.weight = scan.nextDouble();
		System.out.println("Enter your goal");
		user.goal = scan.nextDouble();
		user.PrintInfo();
		System.out.println("\n");
		users.add(user);
			
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
			int code = scan.nextInt();
			for (int i = 0; i<users.size(); i++) {
				
			User user = users.get(i);
			if (user.code == code) {
				
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
				user.name = scan.nextLine();
				user.name = scan.nextLine();
			}
			if(selection ==2) {
				System.out.println("Add User code : ");
				user.code = scan.nextInt();
		  }
			if(selection ==3) {
				System.out.println("Add User's Age");
				user.age = scan.nextInt();
			}
			if(selection ==4) {
				System.out.println("Add User's weight");
				user.weight = scan.nextDouble();
			}
			if(selection ==5) {
				System.out.println("Enter your goal");
				user.goal = scan.nextDouble();
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
				if (users.get(i).code == code) {
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

