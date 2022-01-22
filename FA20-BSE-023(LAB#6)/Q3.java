import java.util.Scanner;

class Q3 {
  public static void main(String[] args) {
	Student st1=new Student();
	Student st2=new Student();
	st1.InputData(1);
	st2.InputData(2);
	st1.showInfo(1);
	st2.showInfo(2);
  }
}

class Student {
  int ClassNo;
  String Name;
  double average;
  int[] SubjectMarks = new int[6];
  Scanner x = new Scanner(System.in);
  
  void InputData(int id) {
	System.out.println("*****************************\n"+
			"		Student # "+id+"\n"+
			"*****************************\n");
	System.out.print("Enter Student Name:\t");
	Name = x.nextLine();
	System.out.print("Enter Student ClassNo:\t");
	ClassNo = x.nextInt();
	x.nextLine();
	System.out.print("Enter marks of\n");
	for (int i = 0; i < SubjectMarks.length; i++) {
	  System.out.print("\t\tSubject No " + (i + 1)+":\t");
	  SubjectMarks[i] = x.nextInt();
	}
	average = calculateAverage(SubjectMarks);
	
  }
  
  double calculateAverage(int[] a) {
	double av = 0;
	for (int i = 0; i < a.length; i++) {
	  if (i == (a.length - 1)) {
		av = av / a.length;
	  } else {
		av += a[i];
	  }
	}
	return av;
  }
  void showInfo(int id){
	System.out.println("*****************************\n"+
					   "		Student # "+id+"\n"+
					   "*****************************\n");
	System.out.println("Name = " + Name);
	System.out.println("ClassNo = " + ClassNo);
	int i=1;
	for (int a:SubjectMarks) {
	  System.out.println("Subject No "+i+":\t"+a);
	  i++;
	}
	System.out.println("average = " + average);
  }
}