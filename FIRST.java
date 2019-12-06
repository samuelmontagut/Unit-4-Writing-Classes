import java.util.*;
public class FIRST {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		BankAccount samCheck = new BankAccount(452183739, 345.04, "Samuel Montagut");
		
		System.out.println(samCheck.toString());
		samCheck.deposit(8568.45);
		samCheck.addInterest(34.5);
		samCheck.setName("Samuel Montagut Agudelo");
		System.out.println("\n" + samCheck.toString());
		samCheck.withdrawl(4528.6);
		System.out.println("The name on the account is: " + samCheck.getName());
		
		System.out.println("\nType in routing number to get access: ");
		int rout = scan.nextInt();
		
		if (rout == samCheck.getRountingNumber()) {
			System.out.println(samCheck.toString());
		}
		else {
			System.out.println("Sorry that is the wrong routing number");
		}
		

	}

}
