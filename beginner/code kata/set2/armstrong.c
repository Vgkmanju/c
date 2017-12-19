#include <stdio.h>
#include<math.h>
int main(void) {
int n,rem,sum=0,t;

scanf("%d",&n);
t=n;
while(n!=0)
{
	rem=n%10;
	sum=sum+rem*rem*rem;
	n=n/10;
}
if(t==sum)
{
	printf("Armstrong number");
}
else
printf("not an armstrong");
	return 0;
}
