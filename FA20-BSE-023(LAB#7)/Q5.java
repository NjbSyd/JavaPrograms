import java.util.Scanner;

class Main5 {
  public static void main(String[] args) {
	department ofComputerScience = new department();
	department ofMathematics = new department();
	ofMathematics.ShowInfo("Mathematics");
	department.hold();
	ofComputerScience.ShowInfo("Computer Science");
  }
}

class department {
  int[] facultyMembers;
  int[] paperUsed;
  long pagesUsedAtTheEndOfMonth = 0;
  
  department() {
	for (; ; ) {
	  facultyMembers = new int[(int) (100 * Math.random())];
	  if (facultyMembers.length <= 25) {
	  } else {
		paperUsed = new int[facultyMembers.length];
		for (int i = 0; i < paperUsed.length; i++) {
		  paperUsed[i] = 0;
		  for (int j = 0; j <= 30; j++) {
			paperUsed[i] += (int) (100 * Math.random());
		  }
		  pagesUsedAtTheEndOfMonth += paperUsed[i];
		}
		break;
	  }
	}
  }
  
  static void hold() {
	Scanner x = new Scanner(System.in);
	System.out.print("\nPress enter to continue......");
	x.nextLine();
	
  }
  
  void ShowInfo(String x) {
	System.out.print("Department of " + x + "\nFaculty Members: " + facultyMembers.length);
	System.out.println("\n< Total # of pages taken >");
	for (int i = 0; i < facultyMembers.length; i++) {
	  System.out.println("Faculty #" + (i + 1) + " has taken: " + paperUsed[i] + " papers");
	}
	
	System.out.println("Total pages taken from the printer: " + pagesUsedAtTheEndOfMonth);
  }
}