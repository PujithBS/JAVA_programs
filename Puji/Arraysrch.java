import java.util.*;
class array
{
public static void main(String args[])
{
int i,n,found=0;
int arr[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter the ten array elements:");
for(i=0;i<10;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("Enter the element to be searched:");
n=sc.nextInt();
for(i=0;i<10;i++)
{
if(arr[i]==n)
{
found=1;
}
else
{
found=0;
}
}
if(found==1)
{
System.out.println("The element is found in:"+" "+i);
}
else 
{
System.out.println("The element is not found");
}
}
}
