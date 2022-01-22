import java.util.*;
class Q3{
	public static void main(String[] aa){

	Scanner x= new Scanner(System.in);
	int num,a=0,b=1,c,i=2;
		System.out.println("Enter nth term");
	num=x.nextInt();

	System.out.println(a);
	System.out.println(b);
	while(i<=num){
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
i++;



		}




	}




}