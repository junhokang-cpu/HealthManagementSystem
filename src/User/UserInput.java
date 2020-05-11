package User;

import java.util.Scanner;
public interface UserInput {
	public void getUserInput(Scanner scan);
	
	public int getCode();
	public void setAge(int age);
	public void setCode(int code);
	public void setGoal(double goal);
	public void setWeight(double weight);
	public void setName(String name);
	public void PrintInfo();
	public void setUserName(Scanner scan);
	public void setUserCode(Scanner scan);
	public void setUserAge(Scanner scan);
	public void setUserWeight(Scanner scan);
	public void setUserGoal(Scanner scan);
	
	
	
}
