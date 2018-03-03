#include <stdio.h>

int main(void) {
	// your code goes here
	int t,i=0,n,a[10];
	scanf("%d",&n);
	while(n!=0)
	{
		t=n%10;
		a[i]=t;
		i++;
		n=n/10;
	}
	
	for(int j=i-1;j>=0;j--)
	{
	printf("%d ",a[j]);

	}
	return 0;
}
