#include <stdio.h>
#include<math.h>
int main(void) {
int a,b,lcm,gcd;
scanf("%d %d",&a,&b);
for(int i=2;i<=a&&i<=b;i++)
{
	if(a%i==0 && b%i==0)
	{
		gcd=i;
	}
}
lcm=(a*b)/gcd;
printf("%d",lcm);

	return 0;
}
