import java.util.Scanner;
public class MenuManager {

	public static void main(String[] args) {
		int selection;
		Scanner scan = new Scanner(System.in);
		selection = -1;
		UserManagement usermanage = new UserManagement(scan);
		
		while(selection !=7 ) {
		showMenu() ;
		selection = scan.nextInt();
		
		switch(selection) {
		case 1 :
			usermanage.addUser();
			break;
		case 2:
			usermanage.addcals();
			break;
		case 3:
			usermanage.addexercise();
			break;
		case 4:
			usermanage.editUser();
			break;
		case 5:
			usermanage.viewall();
			break;
		case 6:
			usermanage.delete();
			break;
		default:
			continue;
		}
		}
	}
	public static void showMenu() {
		System.out.println(" ������������������������ MENU  ����������������������");
		System.out.println("��  1.  Add User's information  ��");
		System.out.println("��  2.        Calories          ��");   
		System.out.println("��  3.        Exercise          ��");    
		System.out.println("��  4.  Edit User's information ��");    
		System.out.println("��  5.  View User's information ��");
		System.out.println("��  6.Delete User's information ��");
		System.out.println("��  7.          Exit            ��");
		System.out.println(" ������������������������������������������������������������ ");
		System.out.println("Select the number \"1~6\"");
		System.out.println("\n");
	}
}
	