class BankAccount{

	static String bankName		= "SBI";
	static String branchName	= "Martur";
	static String ifsc			= "SBI10003";
		   int	  accNum;		
		   String accHName;
		   double balance;

	
	public void deposit(double amount){

		if(amount>0){
			balance = balance+amount;
			System.out.println("\nNew balance after deposit\t\t:"+balance);
		}else{
			System.out.println("Pls check again");
		}

	}

	public void withdraw(double amount){

		if(amount>0 && amount <= balance){
			balance = balance - amount;
			System.out.println("\nNew Balance after Withdraw\t\t:"+balance);
		}else{
			System.out.println("Pls Check again");
		}
	}

	
	public void currentBalance(){
		System.out.println("Current Balance\t\t\t:"+balance);
		
	}
	
		


	
}
