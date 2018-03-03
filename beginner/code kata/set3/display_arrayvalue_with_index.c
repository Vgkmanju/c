#include <stdio.h>

int main(void) {
	// your code goes here
	int i,n,a[10];
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		printf("%d %d\n",a[i],i);
	}
	return 0;
}
