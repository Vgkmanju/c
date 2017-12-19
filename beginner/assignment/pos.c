#include <stdio.h> 
int main()
{
long int n;
printf("Enter the number\n");
scanf("%ld",&n);
if(n>0)
{printf("positive");}
else if(n<0)
{printf("negative");}
else
{printf("zero");}
 return 0;
}
