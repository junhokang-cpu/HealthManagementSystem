package User;

import java.util.Scanner;

public class TeenUser extends User {
	public TeenUser(UserKind kind){
		super(kind);
	}
	protected String school;
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	

	public void getUserInput(Scanner scan) {
		setUserName(scan);
		setUserCode(scan);
		setYorN(scan);
		setUserAge(scan);
		setUserWeight(scan);
		setUserGoal(scan);
	}
	
	
	public void PrintInfo() {
		
		String skind = getKindString();
		System.out.println("Type : "+ skind);
		System.out.println("---------------------------------");
		System.out.println("Your name is "+ name);
		System.out.println("Your User code is "+ code);
		System.out.println("Your age is "+ age + "years old");
		System.out.println("You go to" + this.getSchool() + "school" );
		System.out.println("Your weight is "+ weight + "kg");
		System.out.println("Your goal is "+ goal + "kg");
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
		if ( answer == 'y' || answer == 'Y') {
			setUserSchool(scan);
			break;
		}
		else if ( answer == 'n' || answer == 'N') {
			this.setSchool("");
			break;
		}
		}
	}
		public void setUserSchool(Scanner scan) {
			System.out.println("Elementary / Middle / High  ?");
			String school = scan.next();
			this.setSchool(school);
		}
	
		
	}

