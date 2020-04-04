
public class Calories {
	double calories;
	String food;

	
	public Calories() {
		
	}
	public Calories(double calories,String food) {
		this.calories = calories;
		this.food = food;
	}

	
	public void InfoCalo() {
		System.out.println("You ate :"+ food);
		System.out.println("Total calories are "+calories+"kcals");
		
	}
	
}

