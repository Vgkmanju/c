#include<string.h>
int main(void) {
char s[20];

scanf("%s",s);
for(int i=0;i<strlen(s);i++)
{int c=1;
	for(int j=i+1;j<strlen(s);j++)
	{
		if(s[i]==s[j])
		{
			c++;
			if(c>1)
			{
				i++;
			}
			
			
		}
	
	}
	
		printf("%c-%d\n",s[i],c);

	
}
	return 0;
}
