package User;

import java.io.Serializable;
import java.util.Scanner;

public abstract class User implements UserInput ,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2459629380286793486L;
	protected UserKind kind = UserKind.Adult;
	protected int age,code,calories;
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

	public void setCalories(int calories) {
		this.calories = calories;
	}
	public int getCalories() {
		return calories;
	}
	public void setExercises(String exercises) {
		this.exercises = exercises;
	}
	public String getExercises() {
		return exercises;
	}
	
	protected double goal,weight;
	protected String name,exercises;
	
	
	public User(){
		
	}
	public User(UserKind kind){
		this.kind = kind;
	}
	
	public User(String name,int age,double weight,double goal,int code,String exercises){
		this.name = name;
		this.goal = goal;
		this.age = age;
		this.weight = weight;
		this.code = code;
		this.exercises = exercises;
	}
	public User(UserKind kind ,String name,int age,double weight,double goal,int code,int calories){
		this.kind = kind;
		this.name = name;
		this.goal = goal;
		this.age = age;
		this.weight = weight;
		this.code = code;
	}
	public abstract void PrintInfo();
	
	public void setUserName(Scanner scan) {
		System.out.println("Add User's Name : ");
		String name = scan.nextLine();
		name = scan.nextLine();
		this.setName(name);
	}
	public void setUserCode(Scanner scan) {
		System.out.println("Add User code : ");
		int code = scan.nextInt();
		this.setCode(code);
	}
	public void setUserAge(Scanner scan) {
		System.out.println("Add User's Age");
		int age = scan.nextInt();
		this.setAge(age);
	}
	public void setUserWeight(Scanner scan) {
		System.out.println("Add User's weight");
		double weight = scan.nextDouble();
		this.setWeight(weight);
	}
	public void setUserGoal(Scanner scan) {
		System.out.println("Enter your goal");
		Double goal = scan.nextDouble();
		this.setGoal(goal);
	}
	public void setUserCalories(Scanner scan) {
		System.out.println("Enter your consumed calories");
		int calories = scan.nextInt();
		this.setCalories(calories);
	}
	public void setUserExercises(Scanner scan) {
		String exercises2 = scan.nextLine();
		System.out.println("Enter the exercise you acted");
		String exercises = scan.nextLine();
		this.setExercises(exercises);
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


}
