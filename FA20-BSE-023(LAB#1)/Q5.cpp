#include<stdio.h>
int main()
{
	int deposit,i;
	float temp;
	printf("Enter deposited amount : ");
	scanf("%d",&deposit);
	printf("\n\tYEAR\t\tAmount\n\t-------------------------------\n");
	for(i=1981;i<=1990;i++)
	{
		printf("\t%d\t\t%d\n",i,deposit);
		temp=deposit*0.07;
		deposit=deposit+temp;
	}












return 0;
}

