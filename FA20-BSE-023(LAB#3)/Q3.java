import java.util.*;
class Q3{
	public static void main(String[] s){
	test xy=new test();
	test.year();
	}
}

class test{

	static void year()
	{
		int A=50000000;
		int B=70000000;
		System.out.println("Population of Country A is "+A+"\nPopulation of Country B is "+B);
		int i;
		for(i=0;;i++)
		{
			if(A>=B){break;}
			A=A+((A*3)/100);
			B=B+((B*2)/100);
			}
		System.out.println("\nThe Population of Country A will surpass Population of Country B after "+i+" years\n");

	}


	}