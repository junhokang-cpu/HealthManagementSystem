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
		System.out.println(" 式式式式式式式式式式式式 MENU  式式式式式式式式式式式");
		System.out.println("弛  1.  Add User's information  弛");
		System.out.println("弛  2.        Calories          弛");   
		System.out.println("弛  3.        Exercise          弛");    
		System.out.println("弛  4.  Edit User's information 弛");    
		System.out.println("弛  5.  View User's information 弛");
		System.out.println("弛  6.Delete User's information 弛");
		System.out.println("弛  7.          Exit            弛");
		System.out.println(" 式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式 ");
		System.out.println("Select the number \"1~6\"");
		System.out.println("\n");
	}
}
	