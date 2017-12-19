#include <stdio.h>
#include<math.h>
int main(void) {
int i,n,a=0,b=1,t;
scanf("%d",&n);
printf("%d\n%d\n",a,b);
for(i=1;i<n-1;i++)
{
t=a+b;
a=b;
b=t;
printf("%d\t",t);
}

	return 0;
}
