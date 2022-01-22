import java.util.*;
class Q6{
	public static void main(String[] a){

	Scanner x= new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num = x.nextInt();
	int cpnum=num;
	int num2=0;
	while(num!=0)
	{
		num2=(num2*10)+(num%10);
		num=num/10;
		}
	if(num2==cpnum)
	{System.out.println("The number is Palindrome");}
	else
	{System.out.println("The number is not a Palindrome");}






















	}














}