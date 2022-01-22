import java.util.*;
class Q2{
	public static void main(String[] s){
	test xy=new test();
	test.year();
	}
}

class test{

	static void year()
	{
		Scanner x= new Scanner(System.in);
		System.out.println("Enter a number");
		int tf=x.nextInt();
		int c_tf=tf;
		int i;
		for(i=0;;i++)
		{
			if(c_tf>=2*tf){break;}
			c_tf=c_tf+((c_tf*10)/100);
			}
		System.out.println(i);

	}


	}