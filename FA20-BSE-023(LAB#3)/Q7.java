import java.util.*;


class Q7{
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
			int numcp=num;
			while(num!=0)
			{
				System.out.println(num%10);
				num2=num2+(num%10);
				num=num/10;
				}
				System.out.println();
			while(numcp!=0)
						{
							if(numcp<=10){System.out.print(numcp%10+" ");}
							else{System.out.print(numcp%10+" + ");}
							numcp=numcp/10;
						}
	System.out.print("= "+num2+"\n\n");
		}


}
