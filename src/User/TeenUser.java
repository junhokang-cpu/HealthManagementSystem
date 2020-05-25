package User;

import java.util.Scanner;

import Exceptions.SchoolException;

public class TeenUser extends User {
	public TeenUser(UserKind kind){
		super(kind);
	}
	protected String school;
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) throws SchoolException{
		if(!school.equals("Elementary") && !school.equals("Middle") && !school.equals("High") && !school.equals("")) {
			throw new SchoolException();
		}
		this.school = school;
	}
	

	public void getUserInput(Scanner scan) {
		setUserName(scan);
		setUserCode(scan);
		setYorN(scan);
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
		System.out.println("You go to " + this.getSchool() + " school" );
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
	public void setYorN(Scanner scan) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N') {
		System.out.println("Do you go to school ? (Y/N) ");
			answer = scan.next().charAt(0);
		try {
		if ( answer == 'y' || answer == 'Y') {
			setUserSchool(scan);
			break;
		}
		else if ( answer == 'n' || answer == 'N') {
			this.setSchool("");
			break;
		}
		}
		catch(SchoolException e) {
			
		}
		}
	}
		public void setUserSchool(Scanner scan) {
			String school = "NULL";
			while(!school.equals("Elementary") && !school.equals("Middle") && !school.equals("High") && !school.equals("")) {
				System.out.println("Elementary/ Middle / High  ?");
				school = scan.next();
			try {
				this.setSchool(school);
			} catch (SchoolException e) {
				System.out.println("Please contain correct word");
				
			}
		}
	
		
	}
}

