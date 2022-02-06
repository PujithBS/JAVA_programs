import java.util.*;
class calculate{
       public static void main(String args[])
       { int a,b;
        int add,sub,mul;
        float div;
        System.out.println("Enter two numbers");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        add=a+b;
        sub=a-b;
        mul=a*b;
        div=a/b;
        System.out.println("The addition is"+add);
        System.out.println("The subtraction is"+sub);
        System.out.println("The multiplication is"+mul);
        System.out.println("The division is"+div);
     }
   }