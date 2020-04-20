package User;

import java.util.Scanner;

public class SeniorUser extends User {
	
	protected String medicine;
	
	
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
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
		System.out.println("Do you consume medicine? ");
			answer = scan.next().charAt(0);
		if ( answer == 'y' || answer == 'Y') {
			System.out.println("Input the medicine");
			String phone = scan.next();
			this.setMedicine(phone);
			break;
		}
		else if ( answer == 'n' || answer == 'N') {
			this.setMedicine("");
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
		System.out.println("You consume " + medicine);
		System.out.println("Your weight is "+ weight + "kg");
		System.out.println("Your goal is "+ goal + "kg");
		System.out.println("--------------------------------");
}
}
