class Q11 {
  public static void main(String[] args) {
	PrintNumber p = new PrintNumber();
	int intType = 234;
	float floatType = (float)12.654;
	double doubleType = 145.987;
	long longType = 987762323;
	char charType = 'r';
	char[] charArrayType = {'t', 'u', 'o', 'j'};
	int[] intArrayType = {2, 3, 4, 5, 6, 5};
	String StringType = "Hello Sky!";
	String[] StringArrayType = {"Hello!", "Hi!", "Hey!"};
	p.Printn(intType);
	p.Printn(floatType);
	p.Printn(longType);
	p.Printn(doubleType);
	p.Printn(charType);
	p.Printn(StringType);
	p.Printn(intArrayType);
	p.Printn(charArrayType);
	p.Printn(StringArrayType);
	
  }
}

class PrintNumber {
  void Printn(int x) {
	System.out.println("Integer = " + x);
  }
  
  void Printn(float x) {
	System.out.println("Float = " + x);
  }
  
  void Printn(double x) {
	System.out.println("Double = " + x);
  }
  
  void Printn(long x) {
	System.out.println("Long = " + x);
  }
  
  void Printn(char x) {
	System.out.println("Character = " + x);
  }
  
  void Printn(char[] x) {
	System.out.println("Character Array");
	for (int i = 0; i < x.length; i++) {
	  System.out.println("Character # "+(i+1)+":\t"+x[i]);
	}
  }
  
  void Printn(String x) {
	System.out.println("String = " + x);
  }
  
  void Printn(int[] x) {
	System.out.println("Integer Array");
	for (int i = 0; i < x.length; i++) {
	  System.out.println("Integer # "+(i+1)+":\t"+x[i]);
	}
  }
  
  void Printn(String[] x) {
	System.out.println("String Array");
	for (int i = 0; i < x.length; i++) {
	  System.out.println("String # "+(i+1)+":\t"+x[i]);
	}
  }
}