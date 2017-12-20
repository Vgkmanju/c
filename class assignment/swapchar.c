#include <stdio.h>
int main(void) {
	// your code goes here
	char t,a[10];
	scanf("%s",&a);
	int i=0,l;
	l=strlen(a);

	while(i<l)
	{
		if(i%2==0){
	t=a[i];
	a[i]=a[i+1];
	a[i+1]=t;
		}i++;
	}
	for(i=0;i<=l;i++)
	{
		printf("%c",a[i]);
	}
	
	return 0;
}
