import java.util.*;
class Q5{
	public static void main(String[] a){

	Scanner x= new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = x.nextInt();
	int num2=0;
	while(num!=0)
	{
		num2=(num2*10)+(num%10);
		num=num/10;
		}
	System.out.println(num2);






















	}














}