import java.util.*;
abstract class Shape
{
int length,breadth,radius;
Scanner input=new Scanner(System.in);
abstract void printArea();
}

class Rectangle extends Shape
{
void printArea()
{
System.out.println("Finding the area of the Rectangle");
System.out.println("Enter the length and breadth:");
length=input.nextInt();
breadth=input.nextInt();
System.out.println("The area of the Rectangle is:"+ length*breadth);
}
}
class Triangle extends Shape
{
void printArea()
{
System.out.println("Finding the area of Triangle");
System.out.println("Enter the base and height:");
length=input.nextInt();
breadth=input.nextInt();
System.out.println("The area of the traingle is:"+(length*breadth)/2);
}
}

class Circle extends Shape
{
void printArea()
{
System.out.println("Finding the area of the Circle");
System.out.println("Enter the Radius:");
radius=input.nextInt();
System.out.println("The area of the Circle is:"+3.14f*radius*radius);
}
}

public class AbstractClassExample
{
public static void main(String args[])
{
Rectangle rec=new Rectangle();
rec.printArea();

Triangle tri=new Triangle();
tri.printArea();

Circle cir=new Circle();
cir.printArea();
}
}

