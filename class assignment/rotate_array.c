#include <stdio.h>
int main(void) {
int t,j,i,n,k,s[20];
scanf("%d %d",&n,&k);
for(i=0;i<n;i++)
{
scanf("%d",&s[i]);	
}

for(i=0;i<k;i++)
{		t=s[0];
	for( j=0;j<n;j++)
	{
	
		s[j]=s[j+1];
	
	}	s[n-1]=t;
		

	
}
for(i=0;i<n;i++)
{
		printf("%d\t",s[i]);
}
	return 0;
}
