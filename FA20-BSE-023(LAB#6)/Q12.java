class Q12{
  public static void main(String[] args) {
	print p=new print();
    p.Display('y',87);
    p.Display(765,'o');
  }
}

class print{
  void Display(char x,int y){
    System.out.println("Character =\t" + x);
    System.out.println("Integer =\t" + y);
  }
  void Display(int x,char y){
    System.out.println("Integer =\t" + x);
    System.out.println("Character =\t" + y);
  }
}