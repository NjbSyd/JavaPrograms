import java.util.*;
class Q2{
public static void main(String[] a)
{
	Scanner x = new Scanner(System.in);
	System.out.println("n is Value of limit\nEnter your Limit <1/n>: ");
	int limit = x.nextInt();
	int temp1;
	double temp2=0;
	for(temp1=1;temp1<=limit;		)
	{

		temp2=temp2+(1.0/temp1);

		if(temp1==1)
		{
			temp1++;
		}

		else
		{
			temp1=temp1+2;
		}

	}
	System.out.println("Sum is "+temp2);



















	}
}