import java.util.*;
import java.lang.Math;
public class LengthEquality
{
	public static void main(String arg[])
	
	{
	    Scanner t=new Scanner(System.in);
	    System.out.println("Enter the value of x1");
	    int x1=t.nextInt();
	    System.out.println("Enter the value of y1");
	    int y1=t.nextInt();
	    System.out.println("Enter the value of x2");
	    int x2=t.nextInt();
	    System.out.println("Enter the value of y2");
	    int y2=t.nextInt();
	    double length1 =((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	    System.out.println("Enter the value of X1");
	    int X1=t.nextInt();
	    System.out.println("Enter the value of Y1");
	    int Y1=t.nextInt();
	    System.out.println("Enter the value of X2");
	    int X2=t.nextInt();
	    System.out.println("Enter the value of Y2");
	    int Y2=t.nextInt();
	    double length2 =((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1));
	    double s1=Math.sqrt(length1);
	    double s2=Math.sqrt(length2);
	    System.out.println(s1==s2);
	}
 
}