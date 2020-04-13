
public class User {
	int age,code;
	double goal,weight;
	String name;
	
	
	public User(){
		
	}
	
	public User(String name,int age,double weight,double goal,int code){
		this.name = name;
		this.goal = goal;
		this.age = age;
		this.weight = weight;
		this.code = code;
	}
	
	public void PrintInfo() {
		System.out.println("--------------------------------");
		System.out.println("Your name is "+ name);
		System.out.println("Your User code is "+ code);
		System.out.println("Your age is "+ age + "years old");
		System.out.println("Your weight is "+ weight + "kg");
		System.out.println("Your goal is "+ goal + "kg");
		System.out.println("--------------------------------");
	}
}
