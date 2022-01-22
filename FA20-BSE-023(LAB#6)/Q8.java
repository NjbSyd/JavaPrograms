class Q8 {
  public static void main(String[] args) {
	person p1 = new person();//first constructor will be used
	p1.display();
	p1 = new person(24);//second constructor will be used
	p1.display();
	p1 = new person(26, "Najeeb Said");//third constructor will be executed
	p1.display();
	System.out.println(add(1,98));//first function will be executed based on the given attributes
	System.out.println(add(8.778,9.09));//second function will be executed based on the given attributes
	System.out.println(add(765,8.0987));//third function will be executed based on the given attributes
	System.out.println(add(876.887,876));//fourth function will be executed based on the given attributes
  }
  
  static int add(int x, int y) {
	return x + y;
  }
  
  static double add(double x, double y) {
	return x + y;
  }
  
  static int add(int x, double y) {
	return (int) (x + y);
  }
  
  static double add(double x, int y) {
	return x + y;
  }
}

class person {
  int age;
  String name;
  
  /*
   * Below are examples of constructor overloading
   * the values can be given from method in this class or
   * using object in another class
   * it will depend on the attributes
   * if there are no attributes then first one will be executed
   * if only int attribute is added then second will be executed
   * if int and string are both input then 3rd will be executed
   * */
  person() {
	age = 23;
	name = "Habib Ahmad";
  }
  
  person(int age) {
	this.age = age;
  }
  
  person(int age, String name) {
	this.age = age;
	this.name = name;
  }
  
  void display() {
	System.out.println("Age = " + age);
	System.out.println("Name = " + name);
  }
}