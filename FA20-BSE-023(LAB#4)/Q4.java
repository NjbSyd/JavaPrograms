import java.util.*;
class Four {
    public static void main(String[] aa) {

       Scanner x = new Scanner(System.in);
       int[] nums=new int[6];
       int pos,num1,i,temp;
       System.out.print("Enter the Elements of Array: \n");
       for(i=0;i<5;i++){
		   System.out.print((i+1)+": ");
			nums[i]=x.nextInt();
		   }
       System.out.print("Enter the number to be inserted: ");
       num1=x.nextInt();
   		 System.out.print("Enter index for insertions: ");
    	pos=x.nextInt();
    	for(i=pos;i<nums.length;i++)
    	{
			temp=nums[i];
			nums[i]=num1;
			num1=temp;
		 	}
		 	for(i=0;i<nums.length;i++){
				System.out.print("\n"+nums[i]+" ");
				}
				System.out.println();
    }
}