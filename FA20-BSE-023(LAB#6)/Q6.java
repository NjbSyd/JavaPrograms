import java.util.Scanner;

class Q6 {
  public static Scanner x = new Scanner(System.in);
  
  public static void main(String[] args) {
	
	
	System.out.println("""
			**************************
			 Operations of Object #1
			**************************""");
	Point p1 = new Point();
	p1.display();
	p1 = new Point(Input('x'), Input('y'));
	p1.display();
	p1.setX(Input('x'));
	p1.display();
	p1.setY(Input('y'));
	p1.display();
	p1.setXY(Input('x'), Input('y'));
	p1.display();
	System.out.println("""
			**************************
			 Operations of Object #2
			**************************""");
	Point p2 = new Point();
	p2.display();
	p2 = new Point(Input('x'), Input('y'));
	p2.display();
	p2.setX(Input('x'));
	p2.display();
	p2.setY(Input('y'));
	p2.display();
	p2.setXY(Input('x'), Input('y'));
	p2.display();
	
  }
  
  public static int Input(char x) {
	System.out.print("Enter value of " + x + "\t:\t");
	return Q6.x.nextInt();
  }
}

class Point {
  private int x, y;
  
  Point() {
	x = 0;
	y = 0;
  }
  
  Point(int x, int y) {
	this.x = x;
	this.y = y;
  }
  
  public void setX(int x) {
	this.x = x;
  }
  
  public void setY(int y) {
	this.y = y;
  }
  
  public void setXY(int x, int y) {
	this.x = x;
	this.y = y;
  }
  
  void display() {
	System.out.println("x = " + this.x);
	System.out.println("y = " + this.y);
  }
}