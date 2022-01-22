import java.util.Scanner;

class Q2 {
  static Scanner x = new Scanner(System.in);
  public static void main(String[] args) {
	employee e1 = new employee();
	e1.AssignValues();
	int tenure1 = calculateTenure(currentDateInput(), e1.DOJ);
	System.out.println("tenure = " + tenure1 + " Years");
	employee e2 = new employee();
	e2.AssignValues();
	int tenure2 = calculateTenure(currentDateInput(), e2.DOJ);
	System.out.println("tenure = " + tenure2 + " Years");
  }
  
  static int calculateTenure(char[] a, char[] b) {
	int C_yy = ((Integer.parseInt(String.valueOf(a[6]))) * 10) + (Integer.parseInt(String.valueOf(a[7])));
	int doj_yy = ((Integer.parseInt(String.valueOf(b[6]))) * 10) + (Integer.parseInt(String.valueOf(b[7])));
	return (C_yy - doj_yy);
  }
  
  static char[] currentDateInput() {
	char[] CurrentDate = new char[8];
	for (; ; ) {
	  System.out.print("Enter Today's Date in (dd/mm/yy) format:\t");
	  CurrentDate = x.next().toCharArray();
	  boolean Date_Check =
			  (CurrentDate[0] >= '0' || CurrentDate[0] <= '9') && (CurrentDate[1] >= '0' || CurrentDate[1] <= '9') && (CurrentDate[2] == '/') && (CurrentDate[3] >= '0' || CurrentDate[3] <= '9') && (CurrentDate[4] >= '0' || CurrentDate[4] <= '9') && (CurrentDate[5] == '/') && (CurrentDate[6] >= '0' || CurrentDate[6] <= '9') && (CurrentDate[7] >= '0' || CurrentDate[7] <= '9');
	  if (Date_Check) {
		break;
	  }
	  System.out.println("Please enter date in given format!!!");
	}
	return CurrentDate;
  }
}

class employee {
  int EmployeeCode;
  String EmployeeName;
  char[] DOJ = new char[8];
  Scanner x = new Scanner(System.in);
  
  void AssignValues() {
	System.out.println("Enter the info:");
	System.out.print("Employee Code:\t");
	EmployeeCode = x.nextInt();
	x.nextLine();
	System.out.print("Employee Name:\t");
	EmployeeName = x.nextLine();
	for (; ; ) {
	  System.out.print("Date of joining:\n(dd/mm/yy)\t");
	  DOJ = x.next().toCharArray();
	  boolean DOJ_Check =
			  (DOJ[0] >= '0' || DOJ[0] <= '9') && (DOJ[1] >= '0' || DOJ[1] <= '9') && (DOJ[2] == '/') && (DOJ[3] >= '0' || DOJ[3] <= '9') && (DOJ[4] >= '0' || DOJ[4] <= '9') && (DOJ[5] == '/') && (DOJ[6] >= '0' || DOJ[6] <= '9') && (DOJ[7] >= '0' || DOJ[7] <= '9');
	  if (DOJ_Check) {
		break;
	  }
	  System.out.println("Please enter date in given format!!!");
	}
  }
}

