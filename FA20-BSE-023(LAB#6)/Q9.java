class Q9 {
  public static void main(String[] args) {
	bird b1 = new bird();
	b1.Display();
	b1 = new bird("Sparrow");
	b1.Display();
	b1 = new bird("Eagle");
	b1.Display();
	b1 = new bird("Ostrich");
	b1.Display();
	b1 = new bird("Myna");
	b1.Display();
	b1=new bird("Crow");
	b1.Display();
	b1=new bird("Humming Bird");
	b1.Display();
  }
}

class bird {
  String birdName;
  
  bird() {
  }
  
  bird(String x) {
	this.birdName = x;
  }
  
  void Display() {
	System.out.println("Bird Name = " + birdName);
  }
}