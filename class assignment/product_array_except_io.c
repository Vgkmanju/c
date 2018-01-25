#include<stdio.h>
void main()
{
long int n,a[10],b[10],res=1;
scanf("%ld",&n);
int i;
for(i=0;i<n;i++)
{
scanf("%ld",&a[i]);
}
for(i=0;i<n;i++)
{
res=res*a[i];
}
for(i=0;i<n;i++)
{
b[i]=res/a[i];
printf("%ld\t",b[i]);
}
}
