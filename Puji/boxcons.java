class box
{
double width,height,depth;
box()
{
width=-1;
height=-2;
depth=-4;
}
box(double len)
{
width=height=depth=len;
}
box(double w,double h,double l)
{
width=w;
height=h;
depth=l;
}
box(box ob)
{
width=ob.width;
height=ob.height;
depth=ob.depth;
}
double volume()
{
return width*height*depth;
}
}
class boxweight extends box
{
double weight;
boxweight()
{
super();
weight=10;
}
boxweight(double w,double h,double l,double wt)
{
super(w,h,l);
weight=wt;
}
 boxweight(boxweight ob)
{
super(ob);
weight=ob.weight;
}
boxweight(double len,double wt)
{
super(len);
weight=wt;
}
}

class boxcons{
public static void main(String args[])
{
boxweight b1=new boxweight();
boxweight b2=new boxweight(10.5,115);
boxweight b3=new boxweight(30,40,50,80);
boxweight b4=new boxweight(b3);
box plainbox=new box();
plainbox=b3;
System.out.println("Vol is "+" "+b1.volume());
System.out.println("Vol is "+" "+b2.volume());
System.out.println("Vol is "+" "+b3.volume());
System.out.println("Vol is "+" "+b4.volume());
System.out.println("Vol is "+" "+plainbox.volume());
System.out.println("Depth is "+" " +plainbox.depth);
}
}



