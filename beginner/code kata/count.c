#include<stdio.h>
int main()
{
	int a=0, i,n;
	scanf("%d",&n);
	i=n;
while(i!=0)
{


	i=i/10;
		a++;
}
printf("%d",a);
	return 0;
}
