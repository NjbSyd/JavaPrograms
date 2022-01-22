class Q7{
  public static void main(String[] args) {
	Car c1=new Car();
    String VarInMain=c1.getBrand();
    System.out.println("Variable = " + VarInMain);
  }
}

class Car{
  String Brand;
  Car(){
    Brand ="Ford";
  }
  public String getBrand(){
    return this.Brand;
  }
}