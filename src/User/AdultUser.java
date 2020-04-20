package User;

import java.util.Scanner;

public class AdultUser extends User {
	protected String phone;


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void getUserInput(Scanner scan) {
		System.out.println("Add User's Name : ");
		String name = scan.nextLine();
		name = scan.nextLine();
		this.setName(name);
		
		System.out.println("Add User code : ");
		int code = scan.nextInt();
		this.setCode(code);
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N') {
		System.out.println("Do you have phone number ? (Y/N) ");
			answer = scan.next().charAt(0);
		if ( answer == 'y' || answer == 'Y') {
			System.out.println("Enter your phone number");
			String phone = scan.next();
			this.setPhone(phone);
			break;
		}
		else if ( answer == 'n' || answer == 'N') {
			this.setPhone("");
			break;
		}
		else {
			
		}
		}
		System.out.println("Add User's Age");
		int age = scan.nextInt();
		this.setAge(age);
		
		System.out.println("Add User's weight");
		Double weight = scan.nextDouble();
		this.setWeight(weight);
		
		System.out.println("Enter your goal");
		Double goal = scan.nextDouble();
		this.setGoal(goal);
	}
	public void PrintInfo() {
		System.out.println("--------------------------------");
		System.out.println("Your name is "+ name);
		System.out.println("Your User code is "+ code);
		System.out.println("Your age is "+ age + "years old");
		System.out.println("Your phone number is "+ phone);
		System.out.println("Your weight is "+ weight + "kg");
		System.out.println("Your goal is "+ goal + "kg");
		System.out.println("--------------------------------");
}
}
