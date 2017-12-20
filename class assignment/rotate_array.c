#include <stdio.h>
#include<stdlib.h>
#include<string.h>
int main(void) {
int t,j,i,n,k,s[20];
scanf("%d %d",&n,&k);
for(i=0;i<n;i++)
{
scanf("%d",&s[i]);	
}

for(i=0;i<k;i++)
{	t=s[0];
	for( j=1;j<=n;j++)
	{
		
		s[j-1]=s[j];
	
	}	s[j-1]=t;
		

	
}
for(i=0;i<n;i++)
{
		printf("%d\t",s[i]);
}
	return 0;
}
