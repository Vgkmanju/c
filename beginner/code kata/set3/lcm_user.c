#include <stdio.h>
#include<math.h>
int main(void) {
int a,b,lcm,gcd;
scanf("%d %d",&a,&b);
int i=2;
while(i<=a&&i<=b)
{
	if(a%i==0 && b%i==0)
	{
		gcd=i;
	}i++;
}
lcm=(a*b)/gcd;
printf("%d",lcm);

	return 0;
}
