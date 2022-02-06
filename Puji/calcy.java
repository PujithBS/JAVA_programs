import java.lang.Math;
import java.util.Scanner;
class calcy
{
 public static void main(String[] args){
 int n=0;
 while(n!=11)
 {
  System.out.println("Enter your choice:");
  System.out.println("a*b:01");
  System.out.println("a+b:02");
  System.out.println("a/b:03");
  System.out.println("a-b:04");
  System.out.println("a>b:05");
  System.out.println("a<b:06");
  System.out.println("a=b :07");
  System.out.println("(a-b)/2:09");
  System.out.println("(a+b)/2:10");
  double o1=(a+b)/2;
  double o2=(a-b)/2;
  Scanner in=new Scanner(System.in);
  n =in.nextInt();
  switch(n)
  {
   case 1: System.out.println("a*b="+a*b);
   break;
   case 2: System.out.println("a+b="+a+b);
   break;
   case 3: System.out.println("a/b="+a/b);
   break;
  case 4: System.out.println("a-b="+a-b);
   break;
  case 5: System.out.println("a>b is"+a>b);
   break;
   case 6: System.out.println("a<b is"+a<b);
  break;
  case 7: System.out.println("a=b is"+a==b);
   break;
   case 8: System.out.println("a!=b is"+a!=b);
  break;
  case 9: System.out.println("(a+b)/2="+o1);
  break;
  case 10: System.out.println("(a-b)/2="+o2);
  break;
  default: System.out.println("Please Enter valid input!");
  }
 }
}


