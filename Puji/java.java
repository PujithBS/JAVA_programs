class area{
int a,b;
Area1(int x,int y)
{
a=x;
b=y;
}
double area()
{
System.out.println("Area is not defined");
return0;
}
}

class rectangle extends area
{
rectangle(int x,int y);
{
super(x,y);
}
double C1;
}
}
class triangle extends area
{
Triangle(int x,int y)
{
super(x,y);
}
double area()
{
double C2;
C2=0.5*a*b;
return C2;
}
}
Class dispatch_area
{
public static void main(string args[])
{
area a1=new area1(0,0);
rectangle r1=new rectangle (15,30);
triangle t=new triangle(20,30);
area r;
r=a1;
system.out.print("area of area1 "+""+r.area());
r=r1;
system.out.print("area of recangle "+r.area());
r=t;
system.out.print("area of trinagle"+r.area());
}
}