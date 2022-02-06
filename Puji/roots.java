import java.util.*;
import java.lang.*;
class roots{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int D=(int)Math.sqrt((b*b)-(4*a*c));
				
			switch(D)
			{
				case 1:if (D>0)
					{
						D=(int)Math.pow(D,0.5);		
						float x1=(-b+D)/2*a;
						float x2=(-b-D)/2*a;
						System.out.println("\n The roots are distinct and are:"+x1+x2);
						break;
					}
				case 2:if(D==0)
					{
						float x=(-b)/(2*a);
						System.out.println("\n The roots are equal and are:"+x);
						break;}
				case 3:if(D<0)
					{
						System.out.println("\nImaginary Roots");
					}						 
			}

		}
	}			