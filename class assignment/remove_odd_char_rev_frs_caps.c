#include<stdio.h>
#include<string.h>
void main()
{
int j=0,i;
char b[10],a[10];
scanf("%s",a);
for(i=0;i<strlen(a);i++)
{
if(i%2!=0)
{
b[j]=a[i];
printf("%c",b[j]);
j++;
}
}
b[j-1]=b[j-1]-32;
for(i=j-1;i>=0;i--)
{
printf("%c",b[i]);
}
}
