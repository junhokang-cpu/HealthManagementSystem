package User;

import java.util.Scanner;
public interface UserInput {
	public void getUserInput(Scanner scan);
	public String getExercises();
	public void setExercises(String exercises);
	public void setCalories(int calories);
	public int getCalories();
	public int getCode();
	public void setAge(int age);
	public int getAge();
	public void setCode(int code);
	public void setGoal(double goal);
	public double getGoal();
	public void setWeight(double weight);
	public double getWeight();
	public void setName(String name);
	public String getName();
	public void PrintInfo();
	public void setUserName(Scanner scan);
	public void setUserCode(Scanner scan);
	public void setUserAge(Scanner scan);
	public void setUserWeight(Scanner scan);
	public void setUserGoal(Scanner scan);
	public void setUserCalories(Scanner scan);
	public void setUserExercises(Scanner scan);
	public String getMedicine();
	public String getSchool();
	public String getPhone();
	
	
	
}
