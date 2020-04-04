
public class Exercise {
	String move;
	int time;
	double consume;
	
	public Exercise(){
		
	}
	public Exercise(String move,int time,double consume) {
		this.move = move;
		this.time = time;
		this.consume = consume;
	}
	
	public void InfoExer() {
		double total = consume * time;
		System.out.println("You exercised " + move+ "and" + time + "hour(s)");
		System.out.println("You consumed  "+ total +"kcals");
	}
	
}
