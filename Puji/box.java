class boxdemo
{
double height,length,breadth;
double volume()
{
return height*length*breadth;
}
boxdemo(double height,double length,double breadth)
{
this.height=height;
this.length=length;
this.breadth=breadth;
}
}

class box
{
public static void main(String args[])
{
boxdemo b1=new boxdemo(10,20,25);
boxdemo b2=new boxdemo(20,30,55);
System.out.println("volume of box1 is"+ b1.volume());
System.out.println("volume of box2 is"+ b2.volume());
}
}



