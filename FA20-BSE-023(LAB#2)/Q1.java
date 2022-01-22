import java.util.*;

class Helloworld{
	public static void main (String[] n){
		Scanner x= new Scanner(System.in);
		int a=500,b=300;
		System.out.println("Enter Your Status: ");
		char ch= x.next().charAt(0);

		if(ch=='S'|| ch=='s')
		{
			System.out.println("\nSenior\n Pay is "+a*4);
			}

		else if(ch=='J'|| ch=='j')
		{
					System.out.println("\nJunior\n Pay is "+b*4);
			}

		else
		{
			System.out.println("ERROR!!");}











	}
}