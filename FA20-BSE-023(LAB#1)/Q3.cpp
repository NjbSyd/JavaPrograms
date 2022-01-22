#include<stdio.h>
int main()
{
	int a,w,d,h;
	printf("Enter time in hours : ");
	scanf("%d",&a);
	w=a/168;
	a=a%168;
	d=a/24;
	h=a%24;
	printf("\t\tW : D : H\n\t\t%d : %d : %d\n\n",w,d,h);



return 0;
}

