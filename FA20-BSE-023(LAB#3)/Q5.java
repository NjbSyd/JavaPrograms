	import java.util.*;


	class Q5{
		public static void main(String[] a){
			rev jh =new rev();
			rev.p_check();
		}
	}

	class rev{
		static void p_check(){
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