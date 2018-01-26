#include<stdio.h>
int main(void)
{
int a[]={10,20,30,40,50,60,70,80,90};
int i,j,count,k,s=2;
for(i=0;i<9;i++)
{
count=0;
for(j=i;j<9;j+=s)
{
a[j]=0;
}
for(k=0;k<9;k++)
{
printf("%d ",a[k]);
if(a[k]!=0)
count++;
}
printf("\n");
s=s*2;
if(count==1)
break;
}
for(i=0;i<9;i++)
{
if(a[i]!=0)
printf("%d",a[i]);
}
}
