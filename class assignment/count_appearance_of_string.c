#include <stdio.h>
#include<stdlib.h>
#include<string.h>
int main(void) {
char s[20];

scanf("%s",s);
for(int i=0;i<strlen(s);i++)
{int c=0,k=0;
	for(int j=0;j<strlen(s);j++)
	{
		if(s[i]==s[j])
		{
			c++;
		}
	
	}
	
		printf("%c-%d\n",s[i],c);

	
}
	return 0;
}
