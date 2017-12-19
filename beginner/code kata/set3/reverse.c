#include <stdio.h>
#include<math.h>
int main(void) {
	// your code goes here
	int n,rem,t,sum=0;
	scanf("%d",&n);
	t=n;
while(n!=0)
{
	rem=n%10;
	sum=sum*10+rem;
	n=n/10;
}
printf("%d",sum);
	return 0;
}
