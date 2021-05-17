import java.util.*;
import java.lang.Math;
public class Length
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
	    double length =((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	    System.out.println(Math.sqrt(length));
	}
 
}