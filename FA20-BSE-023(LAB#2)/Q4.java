import java.util.*;
class Q4{
	public static void main(String[] a){

	Scanner x= new Scanner(System.in);
System.out.println("Enter a number");
int num= x.nextInt();
System.out.println("Enter the power");
int pow= x.nextInt();
int result=1;
for(int i=1;i<=pow;i++)
{
	result=result*num;
	}
System.out.println(num+" ^ "+pow+" = "+result);
















	}














}