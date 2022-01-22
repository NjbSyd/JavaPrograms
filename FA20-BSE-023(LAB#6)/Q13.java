class Q13{
  public static void main(String[] args) {
	area a=new area();
    a.calcArea(34.98);
    a.calcArea(3.7,76);
  }
}

class area{
  void calcArea(double width,double length){
    System.out.println("Area of rectangle = " + width*length);
  }
  void calcArea(double length){
    System.out.println("Area of square= " + length*length);
  }
}