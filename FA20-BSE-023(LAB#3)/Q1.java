import java.util.*;

class Q1{

public static void main(String[] a){

B ob=new B();
B.Tr();

}
}


class B{

static void Tr()  {

Scanner x=new Scanner(System.in);
System.out.println("Enter Your Data In MB");
int data=x.nextInt();
int c_data=data;
data=data*1048576;
int xy=0;
while(data>0)
{
data=data-960;
xy++;
}
System.out.print("\n\nThe Time Requrid to Transmint "+c_data+"MB data is "+xy+" Second\n\n");


}

}