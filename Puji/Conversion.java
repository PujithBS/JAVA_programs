import java.util.*;
class typeconv
{
public static void main(String args[])
{
int a;
byte b;
short c;
double d,res;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of a:");
a=sc.nextInt();
System.out.println("Enter the value of b:");
b=sc.nextByte();
System.out.println("Enter the value of c:");
c=sc.nextShort();
System.out.println("Enter the value of d:");
d=sc.nextDouble();
res=(a*b)+(c*d);
System.out.println("The value of res is:"+" "+res);
}
}

