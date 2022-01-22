import java.util.*;
class Q7{

public static void main(String[] sa)
{
Scanner x = new Scanner(System.in);
System.out.println("Enter a number: ");
int num1 = x.nextInt();
int t1,f=0;
for(t1=1;t1<=num1;t1++)
{
	if(num1%t1==0)
	{f++;}

}
if(f==1)
{System.out.println("Number is 1");}
else if(f==2)
{System.out.println("Number is Prime");}
else
{System.out.println("Number is Composite");}
















}











}