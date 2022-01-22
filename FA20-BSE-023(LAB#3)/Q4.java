import java.util.*;


class Q4{
	public static void main(String[] a){
		rev jh =new rev();
		rev.reverse();
	}
}

class rev{
	static void reverse(){
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
