#include<stdio.h>
int AddMinMax(int a,int b,int c)
{
	return a+b+c;
}
int main()
{
	int min,max,nextnum;
printf("Enter Min : ");
scanf("%d",&min);
printf("Enter Max : ");
scanf("%d",&max);
printf("Enter NextNum : ");
scanf("%d",&nextnum);
printf("Returned Value from function is : %d",AddMinMax(min,max,nextnum));










return 0;
}

