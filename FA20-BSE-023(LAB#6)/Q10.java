class Q10{
  public static void main(String[] args) {
	rectangle r=new rectangle(4,5);
    r=new rectangle(5,8);
  }
}

class rectangle{
  double length,width;
  rectangle(double length,double width){
    this.length=length;
    this.width=width;
    Area();
  }
  void Area(){
    System.out.println("Area is "+length*width);
    System.out.println("Length = " + length);
    System.out.println("Width = " + width);
  }
}