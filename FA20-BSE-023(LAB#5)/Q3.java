package com.assignment1;

import java.util.*;

class Q3{
  public static void main(String[] args) {
	rectangle r=new rectangle();
  r.get();
  //checking input for 0.0-20.0 range
  if(!r.set(r.wid)||!r.set(r.len))
    {
      System.out.println("Please input inRange 0.0-20.0!!");
      return;
    }
    r.area();
  r.perimeter();
  
  }
}

class rectangle{
Scanner x=new Scanner(System.in);
  double len =1;
  double wid =1;
   void perimeter(){
  double p=2*(len+wid);
     System.out.println("The perimeter is "+p);
   }
  
   void area(){
     double p=(len+wid);
     System.out.println("The area is "+p);
   }
   
   void get(){
     System.out.println("Enter length: ");
     len=x.nextDouble();
     System.out.println("Enter width: ");
     wid=x.nextDouble();
     
   }
   
   boolean set(double d){
   if (d<0.0||d>20.0) {
     return false;
   }
   else{return true;}
   }
}