#include <stdio.h>
#include<stdlib.h>
#include<string.h>
int main(void) {
char b[10],a[10]={'I','V','X','L'};
int i,j,y=0,c[5]={1,5,10,50};
scanf("%s",b);
int l=strlen(b);
for( i=0;i<strlen(b);i++)
{
	for(j=0;j<4;j++)
	{
	if(b[i]==a[j])
	{
		b[i]=c[j];
		printf("%d\n",b[i]);
	}
	
	}
	
}

int k=b[l];
for(i=l;i>0;i--)
{    

	if(b[i]>b[i-1])
	{
		k-=b[i-1];
		
	}
	else
	{
		k+=b[i-1];
	}

	
}

	printf("%d",k);

	return 0;
}
