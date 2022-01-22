import javax.sound.midi.Soundbank;
import java.util.Scanner;

class Q5 {
  public static void main(String[] args) {
	Animal A1 = new Animal();
	A1.Display();
  }
}

class Animal {
  Scanner x = new Scanner(System.in);
  public String Name;
  public int Feedingtime;
  
  //constructor
  Animal() {
	System.out.print("Enter name of animal:");
	Name = x.nextLine();
	for (; ; ) {
	  System.out.print("Enter feeding time(Input Example 0800 Means 08:00 Am):\t");
	  Feedingtime = x.nextInt();
	  if (Feedingtime > 0 || Feedingtime < 2400) {
		break;
	  } else {
		System.out.println("Enter time from 0000 hrs to 2400 hrs!!!");
	  }
	}
  }
  
  void Display() {
	if (Feedingtime < 999) {
	  System.out.print("Animal Name: " + Name + "\nFeeding Time: 0" + Feedingtime + " hrs");
	} else {
	  System.out.print("Animal Name: " + Name + "\nFeeding Time: " + Feedingtime + " hrs");
	}
	
  }
}
