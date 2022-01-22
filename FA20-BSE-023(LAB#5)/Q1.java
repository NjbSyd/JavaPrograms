package com.assignment1;

import java.util.*;
class Q1 {
  public static void main(String [] arg){
	book b1=new book();
	book b2=new book();
	System.out.println("\n\n******************************\n\tBook # 1\n******************************");
	b1.get();
	b1.show();
	b1.set(123,345,4343);
	System.out.println("\n");
	b1.show();
	System.out.println("\n");
	System.out.println("\n\n******************************\n\tBook # 2\n******************************");
	b2.get();
	b2.show();
	b2.set(1873,6345,4343);
	System.out.println("\n");
	b2.show();
	System.out.println("\n\n******************************\n\tMaximum price\n******************************");
	if(b1.getPrice()>b2.getPrice()) b1.show();
	else b2.show();
	System.out.println("\n");
  }}

class book{
  int book_id,book_pages,book_price;
  Scanner x=new Scanner(System.in);
  
  void get()
  {
	System.out.println("Enter book Id:");
	book_id=x.nextInt();
	
	System.out.println("Enter book Price:");
	book_price=x.nextInt();
	
	System.out.println("Enter book pages:");
	book_pages=x.nextInt();
  }
  
  void show()
  {
	System.out.print("Book ID: "+book_id+"\nBook Price: "+book_price+"\nBook Pages: "+book_pages);
  }
  
  void set(int book_id,int book_pages,int book_price)
  {
	book_id=this.book_id;
	book_pages=this.book_pages;
	book_price=this.book_price;
  }
  
  int getPrice()
  {
	return book_price;
  }
}