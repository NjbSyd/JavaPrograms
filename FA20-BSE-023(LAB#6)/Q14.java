import java.util.*;

class Q14 {
  public static Scanner x = new Scanner(System.in);
  
  public static void main(String[] args) {
	student[] StudentsArray = new student[10];
	for (int i = 0; i < StudentsArray.length; i++) {
	  StudentsArray[i] = new student();
	}
	for (int i = 0; i < StudentsArray.length; i++) {
	  StudentsArray[i].setInfo(input(), input("Name"));
	}
    for (int i = 0; i < StudentsArray.length; i++) {
      StudentsArray[i].DisplayInfo();
    }
    for (int i = 0; i < StudentsArray.length; i++) {
      StudentsArray[i].setInfo(input(), input("Name"),input("Address"));
    }
    for (int i = 0; i < StudentsArray.length; i++) {
      StudentsArray[i].DisplayInfo();
    }
  
  }
  
  static String input(String x) {
    Scanner z=new Scanner(System.in);
	System.out.print("Enter " + x + ": ");
	return z.nextLine();
  }
  
  static int input() {
	System.out.println("Enter Age: ");
	return x.nextInt();
  }
}

class student {
  String name, address;
  int age;
  
  student() {
	name = "Unknown";
	address = "Not Available";
	age = 0;
  }
  
  void setInfo(int age, String name) {
	this.age = age;
	this.name = name;
  }
  
  void setInfo(int age, String name, String address) {
	this.age = age;
	this.name = name;
	this.address = address;
  }
  
  void DisplayInfo() {
	System.out.println("Name =\\tt" + name);
	System.out.println("Address =\t" + address);
	System.out.println("Age =\t\t" + age);
  }
}