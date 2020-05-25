package User;

import java.util.Scanner;
	

public class AdultUser extends User {
	
	public AdultUser(UserKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner scan) {
		setUserName(scan);
		setUserCode(scan);
		setUserAge(scan);
		setUserWeight(scan);
		setUserGoal(scan);	
		setUserExercises(scan);
		setUserCalories(scan);
	}
	public void PrintInfo() {
		String skind = getKindString();
		System.out.println("Type : "+ skind);
		System.out.println("---------------------------------");
		System.out.println("Your name is "+ name);
		System.out.println("Your User code is "+ code);
		System.out.println("Your age is "+ age + "years old");
		System.out.println("Your weight is "+ weight + "kg");
		System.out.println("Your goal is "+ goal + "kg");
		System.out.println("You consume "+ calories + "calories");
		System.out.println("You acted "+ exercises);
		System.out.println("--------------------------------");
}
	public String getKindString() {
		String skind = "none";
		switch(this.kind){
		
		case Adult:
			skind = "Adult";
			break;
		case Senior:
			skind = "Senior";
			break;
		case Teen:
			skind = "Teen";
			break;
		case Child:
			skind = "Child";
			break;
		default:
		}
		return skind;
	}
		
}
