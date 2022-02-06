import java.util.*;
class prim
{
public static void main(String args[])
{
int n,m,i,flag=0;
System.out.println("Enter the number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
m=n/2;
for(i=2;i<=m;i++)
{
if(n%i==0)
flag=1;
else
flag=0;
}
if(flag==0)
{System.out.println("It is a prime number");
}
else
System.out.println("It is not a prime number");
}
}