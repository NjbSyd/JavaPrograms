/*
Object oriented programming
Assignment No 1
FA20-BSE-023
Najeeb Said
*/
import java.util.*;

public class AssignmentNo1 {

  public static void main(String[] args) {
	Scanner x = new Scanner(System.in);
	int total_items_entered = 0;
	ItemsList[] itemsAll = new ItemsList[10];
	for (int i = 0; i < itemsAll.length; i++) {
	  itemsAll[i] = new ItemsList();
	}
	for (; ; ) {
	  System.out.print("""
			  Choose an option:
			  [1]. Add new Parts
			  [2]. Display all records
			  [3]. Display a particular record by given the PartID and Modify the existing information
			  [4]. Analysis of record level
			  [5]. Sales update Report
			  [6]. Delete all those records having quantity less than 10
			  [7]. Exit
			  \t>>\s""");
	  int opt = x.nextInt();
	  if (opt == 1 || opt == 2 || opt == 3 || opt == 4 || opt == 5 || opt == 6 || opt == 7) {
		if (opt == 7) {
		  System.out.println("Program Exiting......");
		  break;
		} else {
		  if (opt == 1) {
			System.out.println("***********************************\n" +
					"\t\tItem # " + (total_items_entered + 1) +
					"\n***********************************\n");
			itemsAll[total_items_entered].addItem();
			total_items_entered++;
			C();
		  } else if (opt == 2) {
			for (int i = 0; i < total_items_entered; i++) {
			  itemsAll[i].displayItem(itemsAll[i].item_ID);
			}
			C();
		  } else if (opt == 3) {
			int i;
			boolean idfound = false;
			System.out.println("Enter product ID to display it");
			int id = x.nextInt();
			for (i = 0; i < total_items_entered; i++) {
			  if (itemsAll[i].item_ID == id) {
				itemsAll[i].displayItem(itemsAll[i].item_ID);
				idfound = true;
				break;
			  }
			}
			if (idfound) {
			  System.out.println("Enter modified info for the chosen product");
			  itemsAll[i].addItem();
			  C();
			} else if (!idfound) {
			  System.out.println("Entered ID doesn't exist...");
			}
			C();
		  } else if (opt == 4) {
			int i;
			for (i = 0; i < total_items_entered; i++) {
			  if (itemsAll[i].item_Quantity <= 50) {
				itemsAll[i].displayItem(itemsAll[i].item_ID);
			  }
			}
			C();
		  } else if (opt == 5) {
			boolean itemfound_condition = false;
			System.out.print("Enter Item ID to be sold:");
			int id = x.nextInt();
			for (int i = 0; i < total_items_entered; i++) {
			  if (id == itemsAll[i].item_ID) {
				itemfound_condition = true;
				System.out.println("""
						Item Found!!!
						Please Enter amount to be sold""");
				int itemsold = x.nextInt();
				if (itemsold > itemsAll[i].item_Quantity || itemsold < 0) {
				  System.out.println("***ERROR***\nEntered amount is invalid!!");
				  C();
				  break;
				} else if (itemsold > 0 && itemsold < itemsAll[i].item_Quantity) {
				  itemsAll[i].sellItem(itemsold, id);

				}
			  }

			}
			if (!itemfound_condition) {
			  System.out.println("""
					  Item not Found!!!
					  Please try again""");
			  C();
			}
		  } else if (opt == 6) {
			System.out.println("This will delete all Items of quantity less than 10");
			for (int i = 0; i < total_items_entered; i++) {
			  if (itemsAll[i].item_Quantity <= 10) {
				itemsAll[i].deleteItem();
				total_items_entered--;
				for (int j = i; j < total_items_entered; j++) {
				  itemsAll[j] = itemsAll[j + 1];
				}
			  }
			}
		  }
		}

	  } else {
		System.out.println("Option out of range...");
	  }
	}

  }

  static void C() {
	System.out.println("Press enter to continue...");
	try {
	  System.in.read();
	} catch (Exception e) {
	  e.printStackTrace();
	}
  }
}

class ItemsList {
  Scanner x = new Scanner(System.in);
  int item_ID;
  int item_Price;
  int item_Quantity;
  String item_Description;
  String item_Manufacturing_date;

  void addItem() {
	System.out.println("Please enter the given data:\n");
	for (; ; ) {
	  System.out.print("Item ID:");
	  item_ID = x.nextInt();
	  if (item_ID <= 0) System.out.println("Item ID must not be <= 0\n");
	  else break;

	}
	System.out.print("Item Price:");
	item_Price = x.nextInt();
	System.out.print("Item Quantity:");
	item_Quantity = x.nextInt();
	x.nextLine();
	System.out.print("Description:");
	item_Description = x.nextLine();
	System.out.print("Manufacturing Date:");
	item_Manufacturing_date = x.nextLine();
  }

  void displayItem(int id) {
	if (id == 0) {
	} else {
	  System.out.println("*************************************");
	  System.out.println("Item ID:\t\t" + item_ID);
	  System.out.println("Item Price:\t\t" + item_Price);
	  System.out.println("Item Quantity:\t\t" + item_Quantity);
	  System.out.println("Description:\t\t" + item_Description);
	  System.out.println("Manufacturing Date:\t" + item_Manufacturing_date);
	  System.out.println("*************************************");
	}
  }

  void sellItem(int y, int z) {
	item_Quantity -= y;
	System.out.println("Updated info of Item " + z);
	displayItem(z);
	C();
  }

  void deleteItem() {
	item_Quantity = 0;
	item_Price = 0;
	item_Description = null;
	item_ID = 0;
	item_Manufacturing_date = null;
  }

  void C() {
	System.out.println("Press enter to continue...");
	try {
	  System.in.read();
	} catch (Exception e) {
	  e.printStackTrace();
	}
  }
}
