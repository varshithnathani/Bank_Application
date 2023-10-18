# Bank_Application
In this program I have taken care of Methods, Keywords, Identifiers, Loops, Modifiers.


Question:


Develop a Bank Application to perform deposit, withdraw, balanceEnquiry operations using Java program.

In project you must create BankAccount objects with the below properties:
	1. bankName
	2. branchName
	3. ifsc
	4. accNum
	5. accHName
	6. balance

Storing values, read and display values in above variables you must define methods. Also define bussiness operation methods deposit(), withdraw(), and currentBalance().

Execution of files:

Step1: Download both .java files
Step2: run Bank.java file to get output.

Program explanation:

In BankAccount.java file i have created the variable with some of them are staic and some of them are non staic.
To access the non static variables we created oject in Bank.java file.

In BankAccount.java I have taken the modifiers deposit(), withdraw(), currentBalance() and written their logic as
deposit         => balance + amount
withdraw        => balance - amount
currentBalance  => balance

these above are implemented in the if and else condition loops.
these methods are accessed in the Bank.java file as

Instance creation ==> BankAccount acc1 = new BankAccount();
acc1 => instance is created in the name of acc1 

acc1.deposit("Enter double value");
acc1.withdraw("Enter double value");
acc1.currentBalance();







