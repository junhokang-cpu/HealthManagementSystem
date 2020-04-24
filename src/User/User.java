package User;

import java.util.Scanner;

public class User {
	protected UserKind kind = UserKind.Adult;
	protected int age,code;
	public UserKind getKind() {
		return kind;
	}

	public void setKind(UserKind kind) {
		this.kind = kind;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getGoal() {
		return goal;
	}

	public void setGoal(double goal) {
		this.goal = goal;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected double goal,weight;
	protected String name;
	
	
	public User(){
		
	}
	public User(UserKind kind){
		this.kind = kind;
	}
	
	public User(String name,int age,double weight,double goal,int code){
		this.name = name;
		this.goal = goal;
		this.age = age;
		this.weight = weight;
		this.code = code;
	}
	public User(UserKind kind ,String name,int age,double weight,double goal,int code){
		this.kind = kind;
		this.name = name;
		this.goal = goal;
		this.age = age;
		this.weight = weight;
		this.code = code;
	}
	
	public void PrintInfo() {
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
		System.out.println("Type : "+ skind);
		System.out.println("--------------------------------");
		System.out.println("Your name is "+ name);
		System.out.println("Your User code is "+ code);
		System.out.println("Your age is "+ age + "years old");
		System.out.println("Your weight is "+ weight + "kg");
		System.out.println("Your goal is "+ goal + "kg");
		System.out.println("--------------------------------");
	}
	public void getUserInput(Scanner scan) {
		System.out.println("Add User's Name : ");
		String name = scan.nextLine();
		name = scan.nextLine();
		this.setName(name);
		System.out.println("Add User code : ");
		int code = scan.nextInt();
		this.setCode(code);
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


}
