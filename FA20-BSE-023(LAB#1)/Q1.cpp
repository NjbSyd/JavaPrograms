#include<stdio.h>
int main()
{
	int num,rev,temp=0,ld;
	printf("Enter a integer : ");
	scanf("%d",&num);
	int num_cp=num;
	while(num>0)
	{
		ld=num%10;
		temp=(temp*10)+ld;
		num=num/10;
	}
	printf("\n\tOriginal Number : %d\n\tReversed Number : %d\n",num_cp,temp);










return 0;
}

