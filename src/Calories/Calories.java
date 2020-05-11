package Calories;
import java.util.Scanner;

public abstract class Calories implements CaloInput {
	protected GenderKind borg = GenderKind.Female;
	
	public GenderKind getBorg() {
		return borg;
	}
	public void setBorg(GenderKind borg) {
		this.borg = borg;
	}

	protected double calories;
	public double getCalories() {
		return calories;
	}
	public void setCalories(double calories) {
		this.calories = calories;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}

	protected String food;

	
	public Calories() {
		
	}
	public Calories(GenderKind borg) {
		this.borg = borg;
	}
	public Calories(double calories,String food) {
		this.calories = calories;
		this.food = food;
	}
	public Calories(GenderKind borg, double calories,String food) {
		
		this.borg = borg;
		this.calories = calories;
		this.food = food;
	}

	
	public abstract void InfoCalo() ;
	
	public void getUserInput(Scanner scan2) {
		setConsume(scan2);
		setCalories(scan2);
}
	public void setConsume(Scanner scan2) {
		System.out.println("Add what you consumed");
		String food = scan2.nextLine();
		food = scan2.nextLine();
		this.setFood(food);
	}
	public void setCalories(Scanner scan2) {
		System.out.println("Calories?");
		Double calories = scan2.nextDouble();
		this.setCalories(calories);
	}
}

