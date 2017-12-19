#include <stdio.h>
#include<math.h>
int main(void) {
int i,n,p;
scanf("%d",&n);
for(i=1;i<=n;i++)
{
p=n*i;
printf("%d*%d=%d\n",i,n,p);
}


	return 0;
}
