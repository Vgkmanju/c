#include<stdio.h>
int main()
{
	char a[5]={'a','e','i','o','u'};
	char b;
	int count=0;
	scanf("%c",&b);
	for(int i=0;i<5;i++)
	{
		if(b==a[i])
		{
		count++;
		}
	}
	if(count>0)
	printf("vowel");
	else
	printf("Consonant");
	return 0;
}
