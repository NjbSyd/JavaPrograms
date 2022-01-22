/*
Object oriented programming
Assignment No 2
FA20-BSE-023
Najeeb Said
*/

import java.util.*;

public class AssignmentNo2 {
  static Scanner x = new Scanner(System.in);

  public static void main(String[] args) {

	int opt;
	lines[] line = new lines[25];
	for (int i = 0; i < 25; i++) {
	  line[i] = new lines();
	}
	for (; ; ) {
	  System.out.print("""
			      Main Menu
			      `````````
			      [1]. Enter Lines of Text
			      [2]. Retrieve all Lines
			      [3]. Retrieve a particular line of Text
			      [4]. Delete a particular line of Text
			      [5]. Character and words count in a particular line of Text
			  Choice -->\s""");
	  opt = x.nextInt();
	  if (opt > 5 || opt < 0) {
		System.out.println("Program Exiting!!!!!\n\n");
		break;
	  } else if (opt == 1) {
		for (int i = 0; i < 25; i++) {
		  line[i].input(i + 1);
		}
		C();
	  } else if (opt == 2) {

		for (int i = 0; i < line.length; i++) {
		  if (line[i] == null) {
		  } else {
			line[i].output(i + 1);
		  }
		}
		C();
	  } else if (opt == 3) {
		int no = getOption();
		line[no - 1].output(no);
		C();
	  } else if (opt == 4) {
		int no = getOption();
		int i;
		for (i = no; i < line.length; i++) {
		  line[i - 1] = line[i];
		}
		line[i - 1] = null;
		C();
	  } else if (opt == 5) {
		int no = getOption();
		if (line[no] == null) {
		  System.out.println("Line is null");
		} else {
		  line[no - 1].count__words_chars(no);
		} C();
	  }
	}


  }

  static int getOption() {
	int no;
	for (; ; ) {
	  System.out.print("Enter line #: ");
	  no = x.nextInt();
	  if (no <= 25 && no > 0) {
		break;
	  } else {
		System.out.println("Please! enter within range(1-25)\n");
	  }
	}
	return no;
  }

  static void C() {
	System.out.println("Press enter to continue...");
	try {
	  System.in.read();
	} catch (Exception e) {
	  e.printStackTrace();
	}
  }
}

class lines {
  char[] l = new char[80];
  Scanner x = new Scanner(System.in);

  void input(int i) {
	System.out.println("Enter Line # " + i +
					   "\nEnter line (up to max. 80 char):");
	l = x.next().toCharArray();
  }

  void output(int i) {
	System.out.print("Line # " + i + ":\t");
	for (char c : l) {
	  System.out.print(c);
	}
	System.out.println();
  }

  void count__words_chars(int i) {
	int chs = 0, words = 0;
	for (char c : l) {
	  if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
		words++;
	  } else if (c >= 0 && c <= 9) {
	  } else {
		chs++;
	  }
	}
	System.out.println("Words = " + words +
					   "\nChars = " + chs);
	System.out.println();
  }

}

