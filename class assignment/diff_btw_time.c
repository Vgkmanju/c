#include <stdio.h>
#include<stdlib.h>
#include<string.h>
int main(void) {
int h,m,h1,h2,m1,m2;
scanf("%d %d %d %d",&h1,&m1,&h2,&m2);
printf("%d:%d\n%d:%d\n",h1,m1,h2,m2);
if(h1>h2)
{
	h=h1-h2;
}
else
h=h2-h1;
if(m1>m2)
m=m2-m1;
else
m=m1-m2;
printf("%d minutes",(h*60)+m);
	return 0;
}
