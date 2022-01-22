import java.util.Scanner;

class Q1{
  public static void main(String[] args) {
	car c1=new car();
	c1.setValues();
	c1.showInfo();
	car c2=new car();
	c2.setValues();
	c2.showInfo();
	car c3=new car();
	c3.setValues();
	c3.showInfo();
	if(c1.CarPrice>c2.CarPrice){
	  if(c1.CarPrice>c3.CarPrice){
		System.out.println(c1.CarName+" has Highest price.\nPrice is : "+c1.CarPrice);
	  }
	  else{
		System.out.println(c3.CarName+" has Highest price.\nPrice is : "+c3.CarPrice);
	  }
	}
	else{
	  if(c2.CarPrice>c3.CarPrice){
		System.out.println(c2.CarName+" has Highest price.\nPrice is : "+c2.CarPrice);
	  }
	  else{
		System.out.println(c3.CarName+" has Highest price.\nPrice is : "+c3.CarPrice);
	  }
	}
  }
}


//User-Defined Car Class
class car{
  
  long CarModel,CarPrice;
  String CarName,CarOwner;
  
  void setValues(){
	Scanner x=new Scanner(System.in);
	System.out.println("Enter Following Info About the car:\n");
	System.out.print("Model(YYYY):\t");
	this.CarModel=x.nextInt();
	x.nextLine();
	System.out.print("Name:\t\t");
	CarName=x.nextLine();
	System.out.print("Owner:\t\t");
	CarOwner=x.nextLine();
	System.out.print("Price:\t\t");
	CarPrice=x.nextInt();
  }
  
  void showInfo(){
	System.out.print("Car Name:\t"+CarName+
					 "\nCar Owner:\t"+CarOwner+
					 "\nCar Price:\t"+CarPrice+
					 "\nCar Model:\t"+CarModel+"\n\n");
	
  }
}