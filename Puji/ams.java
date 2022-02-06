
import java.util.*;
class operations
{
 public void add(int a, int b)
 {
  int sum=a+b;
  System.out.println("sum is:"+sum);
  }
 public void subtract(int a, int b )
 {
  int diff=a-b;
  System.out.println("Difference is:"+diff);
  }
 public void multiply(int a, int b)
 {
   int product=a*b;
   System.out.println("product is:"+product);

   }
 }
 class ams
 {
 public static void main(String args[])
 {
  operations se=new operations();
   Scanner obj=new Scanner(System.in);
   System.out.println("enter two numbers");
   int a=obj.nextInt();
   int b=obj.nextInt();
  
  se.add(a,b);
  se.subtract(a,b);
  se.multiply(a,b);
  }
}
