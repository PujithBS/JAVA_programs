import java.util.*;
class stu
{
String name;
String usn;
String dept;
int sem;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of the student:");
name=sc.nextLine();
System.out.println("Enter the usn of the student:");
usn=sc.nextLine();
System.out.println("Enter the department of the student:");
dept=sc.nextLine();
System.out.println("Enter the semester of the student:");
sem=sc.nextInt();
}
void display()
{
System.out.println("Name:"+name+"\n"+"USN:"+usn+"\n"+"Department:"+dept+"\n"+"Semester:"+sem);
}
}
class main
{
public static void main(String args[])
{
int i;
stu s[]=new stu[3];
for(i=0;i<3;i++)
{
s[i]=new stu();
System.out.println("Enter the details of the student "+(i+1));
s[i].getdata();
}
for(i=0;i<3;i++)
{
System.out.println("The details of the student:"+(i+1)+" are");
s[i].display();
}
}
}

 