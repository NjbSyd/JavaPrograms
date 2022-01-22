import java.util.*;
class Q6
{

   public static void main(String args[])
    {
			io xz=new io();
			io.InOut();
   }
}

class io{

	static void InOut(){

		 Scanner s= new Scanner(System.in);
		 System.out.println("Enter the Costprice ");
		 int cp=s.nextInt();
		System.out.println("Enter the Selling price:");
         int sp=s.nextInt();
		check(cp,sp);

		}
	static void check(int cp,int sp){

				if(cp-sp<0)
				  		 {
						  System.out.println("Profit: " +(sp-cp));
				}
				else if(cp-sp>0)
		                {
				  System.out.println("Loss: " +(cp-sp));
				}
				else{
		  System.out.println("No Profit or Loss");}



		}

	}