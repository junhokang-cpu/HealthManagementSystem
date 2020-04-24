package Calories;
import java.util.Scanner;

public class Calories {
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

	
	public void InfoCalo() {
		String a = "none";
		switch(this.borg){
			
		case Female:
			a = "Female";
		case Male:
			a = "Male";
		}
		System.out.println("Type : " +a);
		System.out.println("--------------------------------");
		System.out.println("Your basal metabolism is  1300 kcals");
		System.out.println("You ate :"+ food);
		System.out.println("Total calories are "+calories+"kcals");
		System.out.println("--------------------------------");
		
	}
	
	public void getUserInput(Scanner scan2) {
		System.out.println("Your basal metabolism is  1300 kcals");
		System.out.println("Add what you consumed");
		String food = scan2.nextLine();
		food = scan2.nextLine();
		this.setFood(food);
		System.out.println("Calories?");
		Double calories = scan2.nextDouble();
		this.setCalories(calories);
		
}
		
}

