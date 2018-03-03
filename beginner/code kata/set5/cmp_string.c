#include <stdio.h>
#include<string.h>
int main(void) {
	// your code goes here
	char a[20],b[20];
	int sum1=0,sum2=0;
	scanf("%s%s",a,b);
	for(int i=0;i<strlen(a);i++)
	{
		sum1=sum1+a[i];
	}
	for(int j=0;j<strlen(b);j++)
	{
		sum2=sum2+b[j];
	}
	if(sum1==sum2)
	{
		printf("%s",a);
	}
	else if(sum1>sum2){
		printf("%s",a);
	}
	else
	printf("%s",b);
return 0;
}
