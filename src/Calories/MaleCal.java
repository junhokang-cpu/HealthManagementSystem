package Calories;

import java.util.Scanner;

public class MaleCal extends Calories {
	public MaleCal(GenderKind borg) {
		super(borg);
	}
	public void InfoCalo() {
		String a = "none";
		switch(this.borg){
			
		case Female:
			a = "Female";
		case Male:
			a = "Male";
		}
		System.out.println("Type : "+a);
		System.out.println("--------------------------------");
		System.out.println("Your basal metabolism is  1700 kcals");
		System.out.println("You ate :"+ food);
		System.out.println("Total calories are "+calories+"kcals");
		System.out.println("--------------------------------");
		
	}
	public void getUserInput(Scanner scan) {
		System.out.println("Your basal metabolism is  1700 kcals");
		System.out.println("Add what you consumed");
		String food = scan.nextLine();
		food = scan.nextLine();
		this.setFood(food);
		System.out.println("Calories?");
		Double calories = scan.nextDouble();
		this.setCalories(calories);
		
}
}
