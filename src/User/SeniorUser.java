package User;

import java.util.Scanner;

public class SeniorUser extends User  {
	public SeniorUser(UserKind kind) {
		super(kind);
	}
	
	protected String medicine;
	
	
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
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
		System.out.println("--------------------------------");
		System.out.println("Your name is "+ name);
		System.out.println("Your User code is "+ code);
		System.out.println("Your age is "+ age + "years old");
		System.out.println("You consume " + medicine);
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
	
	
	public void setUserMedicine(Scanner scan) {
		System.out.println("Input the medicine");
		String phone = scan.next();
		this.setMedicine(phone);
	}
	
	
	public void setYorN(Scanner scan) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N') {
		System.out.println("Do you consume medicine? (Y/N)");
			answer = scan.next().charAt(0);
		if ( answer == 'y' || answer == 'Y') {
			setUserMedicine(scan);
			break;
		}
		else if ( answer == 'n' || answer == 'N') {
			this.setMedicine("");
			break;
		}
		else {
			}
		}
	}
}
