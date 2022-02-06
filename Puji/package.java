package p4;

class samepackage{
 samepackage()
    {
       protection p1=new protection();
       System.out.println("value of nprotection in samepackage"+" "+p1.n-pro);
       System.out.println("value of npublic in samepackage"+ " " +p1.n_pub);
       System.out.println("value of n in samepackage"+ " " +p1.n);
    }
package p4;
public class protection{
 int n=4;
private int n_pri=10;
public int n_pub=90;
protected int n_pro=100;

public protection()
{
 System.out.println("value of n is"+ " " +n);
System.out.println("value of n_private is "+ " " +n_pri);
System.out.println("value of n_public is "+ " " +n_pub);
System.out.println("value of n_protected is "+ " " +n_pro);
}
}

package p4;
public class derived extends protection
{
public derived()
{
System.out.println("value of n in derived "+ " " +n);
System.out.println("value of npublic in "+ " " +n_pub);
System.out.println("value of nprotected in "+ " " +n_pro);
}
}
package p4;
public class demo1
{
public static void main(String args[])
{
protection p2=new protection();
derived d1=new derived();
samepackage s1=new sameapackage();
}
}
