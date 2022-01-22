import java.util.Scanner;

class Q4 {
  static Scanner x=new Scanner(System.in);
  public static void main(String[] args) {
	Account A1 = new Account();
	boolean end=false;
	for(;;) {
	  if(end) break;
	  System.out.println("""
			  1. Deposit Cash
			  2. Withdraw Cash
			  3. Show Balance
			  4. Exit""");
	int opt =x.nextInt();
	switch (opt){
	  case 1:
		A1.deposit();
		break;
	  case 2:
		A1.withdraw();
		break;
	  case 3:
		A1.Display_Balance();
		break;
	  case 4:
		end=true;
		System.out.println("Program ended!!");
		break;
	  default:
		System.out.println("Enter valid Option!!!");
		break;
	}
	}
  }
}

class Account {
  Scanner x = new Scanner(System.in);
  int balance;
  
  Account() {
	balance = 0;
  }
  
  int get_balance() {
	return balance;
  }
  
  void deposit() {
	for (; ; ) {
	  System.out.print("Enter deposit amount:\t");
	  int deposit = x.nextInt();
	  if (deposit > 0) {
		balance += deposit;
		break;
	  } else {
		System.out.println("Please! Enter valid amount!!!");
	  }
	}
  }
  
  void withdraw() {
	for (; ; ) {
	  System.out.println("Enter withdrawal amount:\t");
	  int withdrawal = x.nextInt();
	  if (withdrawal <= get_balance()) {
		balance -= withdrawal;
		break;
	  } else {
		System.out.println("Please! Enter valid amount!!!");
	  }
	}
  }
  
  void Display_Balance() {
	double BalanceIn$ = (get_balance()) * 1.0 / 100;
	System.out.println("Balance = " + BalanceIn$ + "$");
  }
}