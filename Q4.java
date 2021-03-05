import java.util.Scanner;
public class Q4
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);	 
	double x1,y1,w,h,X1,Y1,w1,h1,a,b,c,d;
	double perimeter,perimeter2;
	System.out.println("Enter the co-ordinates (x,y), width and height of a rectangle: ");
	x1 = input.nextDouble();
	y1 = input.nextDouble();
	w = input.nextDouble();
	h = input.nextDouble();
	a = x1-h; // x co-ordinate of the diagonally opposite end
	b = y1+w; // y co-ordinate of the diagonally opposite end
	System.out.println("Enter the co-ordinates (x,y), width and height of another rectangle: ");
	X1 = input.nextDouble();
	Y1 = input.nextDouble();
	w1 = input.nextDouble();
	h1 = input.nextDouble();          
	c= X1-h1; // x co-ordinate of the diagonally opposite end
	d=Y1+w1;  // y co-ordinate of the diagonally opposite end
	if (x1>c || y1>d || X1>a ||Y1>b)
	{
	    System.out.println("The rectangles do not overlap");
	}else
	{
	    System.out.println("The rectangles do overlap");
	}
	}
	}

