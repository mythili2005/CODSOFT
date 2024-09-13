import java.util.Scanner;
class ATM{
	static int balance = 1000;
	static int flag = 0;
	static int amount_temp;
	static void withdraw(int amount)
	{
		System.out.println();
		if(amount > balance)
		{
			flag++;
			System.out.println("Please check the balance");
		}
		else if(balance < 500)
		{
			flag++;
			System.out.println("Insufficient Balance");
		}
		else{
			amount_temp = balance-amount;
			if(amount_temp >= 500)
			{	flag = 0;
				balance = amount_temp;
				System.out.println("Transaction successful");
			}
			else{
				System.out.println("You should have the minimum deposit");
				flag++;
			}
		}
	if(flag>0)
	{
		System.out.println("Transaction failed");
	}
	}
	static void deposit(int amount)
	{
		System.out.println();
		balance = balance+amount;
		System.out.println("Your amount deposited successfully");
	}
	static int checkBalance()
	{
		System.out.println();
		return balance;
		
	}
}
class User_account extends ATM{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);	
	for(;;)
	{
	System.out.println("To withdraw : Enter 1");
	System.out.println("To deposit : Enter 2");
	System.out.println("To Checkbalance : Enter 3");
	int n = sc.nextInt();
	int amt;
	switch(n){
	case 1:{
	System.out.print("Enter the amount: ");
	amt = sc.nextInt();	
	withdraw(amt);
	System.out.println();
	continue;
	}
	case 2:
	{
	System.out.print("Enter the amount: ");
	amt = sc.nextInt();	
	deposit(amt);
	System.out.println();
	continue;
	}
	case 3:{
		amt = checkBalance();
		System.out.println("You have "+amt+" in your account");
		System.out.println();
		continue;
			}
		}
	}
	}
}
