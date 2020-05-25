package User;

import java.util.Scanner;

import Exceptions.HyperException;
	
public class ChildUser extends User{
	
	public ChildUser(UserKind kind) {
		super(kind);
	}
	
	protected String phone;
	
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) throws HyperException {
		if(!phone.contains("-") && !phone.equals("")){
			throw new HyperException();
		}
		this.phone = phone;
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
		System.out.println("Your parent's phone number is " + this.getPhone());
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
	
	
	public void setUserPhone(Scanner scan){
		String phone = "NULL";
		while(!phone.contains("-") && !phone.equals("")) {
			
		System.out.println("Input the phone number");
		phone = scan.next();
		try {
		this.setPhone(phone);
		}
		catch(HyperException e) {
			System.out.println("Please use Hyper -");
		}
	}
		
	}
	
	public void setYorN(Scanner scan) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer !='N') {
		System.out.println("Do you have parent's phone number? (Y/N)");
			answer = scan.next().charAt(0);
		try {
		if ( answer == 'y' || answer == 'Y') {
			setUserPhone(scan);
			break;
		}
		else if ( answer == 'n' || answer == 'N') {
			this.setPhone("");
			break;
		}
		else {
			}
		}
		catch(HyperException e){
			
		}
		}
	}
}
