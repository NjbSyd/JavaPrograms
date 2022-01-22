#include<stdio.h>
int main()
{
	int a,hrs,min,sec;
	printf("Enter time in seconds : ");
	scanf("%d",&a);
	hrs=a/3600;
	a=a%3600;
	min=a/60;
	sec=a%60;
	printf("\t\tH : M : S\n\t\t%d : %d : %d\n\n",hrs,min,sec);











return 0;
}

