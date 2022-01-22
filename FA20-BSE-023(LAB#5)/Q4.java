package com.assignment1;

import java.util.*;
class Q4 {
  public static void main(String[] args) {
	student S1 = new student();
	student S2 = new student();
	S1.getData(1);
	S2.getData(2);
	System.out.println();
	System.out.println();
	S1.showData();
	System.out.println();
	System.out.println();
	S2.showData();
  }
}

class student {
  String name;
  String city;
  int age;
  int n;
  Scanner x = new Scanner(System.in);
  
  void getData(int v) {
	n = v;
	System.out.print("Enter the name of Student #" + v + "\s");
	name = x.nextLine();
	System.out.print("Enter age of Student #" + v + "\s");
	age = x.nextInt();
	x.nextLine();
	System.out.print("Enter city name of Student #" + v + "\s");
	city = x.nextLine();
  }
  
  void showData() {
	System.out.println("Student # " + n);
	System.out.println();
	System.out.println("Name\t=\t" + name);
	System.out.println("City\t=\t" + city);
	System.out.println("Age\t\t=\t" + age);
  }
}