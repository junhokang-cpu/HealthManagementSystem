import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {
		int selection;
		Scanner scan = new Scanner(System.in);
		selection = -1;
		UserManagement usermanage = new UserManagement(scan);
		
		while(selection !=6 ) {
			
		System.out.println(" ������������������������ MENU  ����������������������");
		System.out.println("��  1.  Add User's information  ��");
		System.out.println("��  2.        Calories          ��");   
		System.out.println("��  3.        Exercise          ��");    
		System.out.println("��  4.  Edit User's information ��");    
		System.out.println("��  5.  View User's information ��");
		System.out.println("��  6.          Exit            ��");
		System.out.println(" ������������������������������������������������������������ ");
		System.out.println("Select the number \"1~6\"");
		System.out.println("\n");
		selection = scan.nextInt();
		if(selection == 1) {
			usermanage.addUser();
		}
		if(selection ==2) {
			usermanage.addcals();
	
	  }
		if(selection ==3) {
			usermanage.addexercise();
		}
		if(selection ==4) {
			usermanage.editUser();
		}
		if(selection ==5) {
			usermanage.viewall();
		}
		else
			continue;
		}
	}
}