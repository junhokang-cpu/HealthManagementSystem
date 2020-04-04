import java.util.Scanner;

public class UserManagement {
	Scanner scan;
	User user;
	Calories cal;
	Exercise exercise;
	UserManagement(Scanner scan){
		this.scan = scan;			
}

	
	public void addUser() {
		user = new User();
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
			
		}
	public void addcals() {	
			cal = new Calories();
			
			
			System.out.println("Add what you consumed");
			cal.food = scan.nextLine();
			cal.food = scan.nextLine();
			System.out.println("Calories?");
			cal.calories = scan.nextDouble();
			cal.InfoCalo();
	}
		public void addexercise() {	
			exercise = new Exercise();
			
			System.out.println("Add what you exerciseed");
			exercise.move = scan.nextLine();
			exercise.move = scan.nextLine();
			System.out.println("How much calories you used per hour?");
			exercise.consume = scan.nextDouble();
			System.out.println("How many hours did you exercise?");
			exercise.time = scan.nextInt();
			exercise.InfoExer();
		}
		
		
		// add exercise
		
		
		
		
		public void editUser() {
			int selection;
			selection = -1;
			
			while(selection !=6 ) {
				
			System.out.println(" 式式式式式式式式式式式式 Edit  式式式式式式式式式式式");
			System.out.println("弛  1.     Edit your User code  弛");
			System.out.println("弛  2.     Edit your name       弛");   
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
		
		
		// Edit user's weight, goal etc..
		
		public void viewall() {
			System.out.println("Your User code? : ");
			int code = scan.nextInt();
			double dif = user.weight - user.goal;
			if(user.code == code) {
				user.PrintInfo();
				cal.InfoCalo();
				if(user.weight == user.goal) {
					System.out.println("You achieve your goal !");
				}
				else if (user.weight>user.goal) {
					System.out.println("You have to lose your weight : "+ dif);
				}
				else if (user.weight<user.goal)
					System.out.println("You have to increase your weight : "+ (-1)*dif);
				}
				
			}// view User's data
		
}

