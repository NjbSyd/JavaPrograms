package com.assignment1;

import java.util.Scanner;

class Q5 {
  public static void main(String[] args) {
	number n = new number();
	Scanner x = new Scanner(System.in);
	System.out.print("Enter a number:");
	n.var = x.nextInt();
	System.out.println("Zero:\t" + n.isZero());
	System.out.println("Even:\t" + n.isEven());
	System.out.println("Odd:\t" + n.isOdd());
	System.out.println("Prime:\t" + n.isPrime());
	System.out.println("Negative:\t" + n.isNegative());
	System.out.println("Positive:\t" + n.isPositive());
	System.out.println("Factorial:\t" + n.getFactorial());
    System.out.println("Reverse:\t"+n.getReverse());
	System.out.println("Square:\t" + n.getSqr());
	System.out.println("Sqrt:\t" + n.getSqrt());
//	System.out.println("Prime:\t" + n.getSum());
	System.out.println("Sum:\t"+n.getSum());
	
  }
}

class number {
  int var;
  
  boolean isZero() {
	return var == 0;
  }
  
  boolean isPositive() {
	return var > 0;
  }
  
  boolean isNegative() {
	return var < 0;
  }
  
  boolean isPrime() {
	int count=0;
	for (int i = 1; i < var; i++) {
	  if(var%i==0){
		count++;
	  }
	}
	return count <= 2;
  }
  
  boolean isOdd() {
	return var % 2 != 0;
  }
  
  boolean isEven() {
	return var % 2 == 0;
  }
  
  int getFactorial() {
	int fact=1;
	for (int i = 1; i <= var; i++) {
	  fact=fact*i;
	}
	return fact;
  }
  
  double getSqrt() {
	return Math.sqrt(var);
  }
  
  int getSqr() {
	return var*var;
  }
  
  int getSum() {
	int sum=0;
	for (int i = 0; i <= var; i++) {
	  sum+=i;
	}
	return sum;
  }
  
  int getReverse() {
	int rev=0;
	int var_cp;
	for (var_cp = var; var_cp >0; ) {
	  rev=(rev+(var_cp%10))*10;
	  var_cp/=10;
	}
	return rev;
  }
}