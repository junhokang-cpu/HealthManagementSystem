package Calories;

import java.util.Scanner;

public class MaleCal extends Calories implements CaloInput {
	public MaleCal(GenderKind borg) {
		super(borg);
	}
	public void InfoCalo() {
		String a = getGender();
		System.out.println("Type : "+a);
		System.out.println("---------------------------------");
		System.out.println("Your basal metabolism is  1700 kcals");
		System.out.println("You ate :"+ food);
		System.out.println("Total calories are "+calories+"kcals");
		System.out.println("--------------------------------");
		
	}
	public void getUserInput(Scanner scan2) {
		System.out.println("Your basal metabolism is  1700 kcals");
		setConsume(scan2);
		setCalories(scan2);
}
	public String getGender() {
		String a = "none";
		switch(this.borg){
			
		case Female:
			a = "Female";
		case Male:
			a = "Male";
		}
		return a;
	}
}
