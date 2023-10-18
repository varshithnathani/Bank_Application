/**

Develop a Bank Application to perform deposit, withdraw, balanceEnquiry operations using Java program.

In project you must create BankAccount objects with the below properties:
	1. bankName
	2. branchName
	3. ifsc
	4. accNum
	5. accHName
	6. balance

Storing values, read and display values in above variables you must define methods. Also define bussiness operation methods deposit(), withdraw(), and currentBalance().


		Author		: Nathani Varshith
		Contact		: varshithnathani@gmail.com
		Date		: 19-10-2023		

*/

class Bank{

	
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();

		acc1.accNum		= 1000101;
		acc1.accHName	= "Varshith Nathani";
		acc1.balance	= 1000.0;

		System.out.println("Bank Account Details: 1");
		System.out.println();

		System.out.println("Bank Name\t\t\t:"+		acc1.bankName);
		System.out.println("Branch Name\t\t\t:"+	acc1.branchName);
		System.out.println("ifsc\t\t\t\t:"+			acc1.ifsc);
		System.out.println("accNum\t\t\t\t:"+		acc1.accNum);
		System.out.println("accHName\t\t\t:"+		acc1.accHName);
		System.out.println("Balance\t\t\t\t:"+		acc1.balance);
		

		acc1.deposit(500.0);
		acc1.withdraw(1000.0);
		acc1.currentBalance();
		
	}
}
