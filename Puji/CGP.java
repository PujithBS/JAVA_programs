import java.util.*;
class Student
{
string usn,name;
int n,credits[],totalcredits=0;
double sgpa=0,marks[];
Scanner sc=new Scanner(System.in);
void accept()
{
System.out.println("Enter the name of Student:");
name=sc.nextLine();
System.out.println("Enter USN of the student:");
usn=sc.nextLine();
System.out.println("Enter Number of subjects:");
n=sc.nextInt();
credits=newInt[n];
marks=newDouble[n];
System.out.println("Enter the details of subject:");
for(int i=0;i<n;i++)
{
System.out.println("Enter the credits for the subject"+(i+1));
credits[i]=sc.nextInt();
System.out.println("Enter the marks for subject"+(i+1));
marks[i]=sc.nextDouble();
Calculate(credits[i],marks[i],i);
}
}
void calculate(int credit,double marks,int j)
{
totalcredits=totalcredits+credit;
if(marks>=90&&marks<=100)
{
sgpa=sgpa+(10*credit);
}
else if(marks>=80&&marks<=90)
{




