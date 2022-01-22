import java.util.Scanner;

class Main3 {
  static int accountsCount = 0;
  
  public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	
	System.out.print("Enter number of Accounts:\t");
	final int NoOfAccounts = x.nextInt();
	final bankAccount[] accounts = new bankAccount[NoOfAccounts];
	for (; ; ) {
	  System.out.println();
	  System.out.println("1 - Enter the information.\n" +
						 "2 - Print the information of account ID.\n" +
						 "3 - Deposit\n" +
						 "4 - Withdraw\n" +
						 "5 - Change the address\n" +
						 "6 - Total Number of transactions.\n" +
						 "7 - Exit!\n" +
						 "Choice>> ");
	  int opt = x.nextInt();
	  if (opt < 1 || opt > 7) {
		System.out.println();
	  } else if (opt == 7) {
		System.out.println("Exiting....");
		break;
	  } else {
		if (opt == 1) {
		  if (accountsCount >= NoOfAccounts) {
			System.out.println("Account creation limit reached!!!");
		  } else {
			accounts[accountsCount] = new bankAccount();
		  }
		  
		}
		if (opt == 2) {
		  System.out.println("\n------------------\n***Print Info***\n------------------");
		  for (; ; ) {
			System.out.println("Enter ID: [" + accounts[0].accountID + "-" + accounts[(accountsCount) - 1].accountID + "]");
			int tempId = x.nextInt();
			if (tempId < accounts[0].accountID || tempId > accounts[(accountsCount - 1)].accountID) {
			} else {
			  accounts[(tempId - 1000)].ShowInfo(tempId);
			  break;
			}
		  }
		}
		if (opt == 3) {
		  System.out.println("\n------------------\n***Deposit Cash***\n------------------");
		  for (; ; ) {
			System.out.println("Enter ID: [" + accounts[0].accountID + "-" + accounts[(accountsCount) - 1].accountID + "]");
			int tempId = x.nextInt();
			if (tempId < accounts[0].accountID || tempId > accounts[(accountsCount - 1)].accountID) {
			} else {
			  accounts[(tempId - 1000)].deposit();
			  break;
			}
		  }
		}
		if (opt == 4) {
		  System.out.println("\n------------------\n***Withdraw Cash***\n------------------");
		  for (; ; ) {
			System.out.println("Enter ID: [" + accounts[0].accountID + "-" + accounts[(accountsCount) - 1].accountID + "]");
			int tempId = x.nextInt();
			if (tempId < accounts[0].accountID || tempId > accounts[(accountsCount - 1)].accountID) {
			} else {
			  accounts[(tempId - 1000)].withdraw();
			  break;
			}
		  }
		}
		if (opt == 5) {
		  System.out.println("\n------------------\n***Change Address***\n------------------");
		  for (; ; ) {
			System.out.println("Enter ID: [" + accounts[0].accountID + "-" + accounts[(accountsCount) - 1].accountID + "]");
			int tempId = x.nextInt();
			if (tempId < accounts[0].accountID || tempId > accounts[(accountsCount - 1)].accountID) {
			} else {
			  accounts[(tempId - 1000)].changeaddress();
			  break;
			}
		  }
		}
		if (opt == 6) {
		  System.out.println("\n\t----------------------------------\n" +
							 "\t    ***Totals Transactions >> [" + bankAccount.n_trans + "]" +
							 "\n\t----------------------------------");
		}
	  }
	  
	}
	
  }
}


class bankAccount {
  static int id = 1000, n_trans = 0;
  Scanner x = new Scanner(System.in);
  int accountID;
  String name, address, a_type;
  int balance = 0;
  
  bankAccount() {
	accountID = id;
	System.out.println("USER-ID\t=\t\t[ " + id + " ]");
	System.out.print("Enter username:\t\t");
	name = x.nextLine();
	System.out.print("Enter address:\t\t");
	address = x.nextLine();
	System.out.print("Enter Account type:\t");
	a_type = x.nextLine();
	System.out.print("Enter Account balance:\t");
	balance = x.nextInt();
	x.nextLine();
	id++;
	Main3.accountsCount++;
  }
  
  void ShowInfo(int tempId) {
	System.out.print("\nUSER-ID\t\t\t\t[ " + tempId + " ]" +
					 "\nUserName\t\t=\t" + name +
					 "\nAddress\t\t\t=\t" + address +
					 "\nAccount type\t\t=\t" + a_type +
					 "\nBalance\t\t\t=\t" + balance +
					 "\nNumber of transactions\t=\t" + n_trans + "\n\n");
  }
  
  void deposit() {
	for (; ; ) {
	  System.out.print("Enter balance to deposit: ");
	  int d = x.nextInt();
	  if (d <= 0) {
	  } else {
		balance += d;
		n_trans++;
		break;
	  }
	}
	x.nextLine();
  }
  
  void withdraw() {
	for (; ; ) {
	  System.out.print("Enter balance to withdraw: ");
	  int d = x.nextInt();
	  if (d > balance) {
	  } else {
		balance -= d;
		n_trans++;
		break;
	  }
	}
	x.nextLine();
  }
  
  void changeaddress() {
	System.out.print("Current address: " + address + "\nEnter address to change: ");
	String ch = x.nextLine();
	address = ch;
  }
  
}