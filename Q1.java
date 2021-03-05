import java.util.Scanner; 
public class Q1
{
	public static void main(String[] args) {
	    int max,min,mid;
		Scanner checker = new Scanner(System.in);
		System.out.println("Enter three integers: ");
		int a = checker.nextInt();
		int b = checker.nextInt();
		int c = checker.nextInt();
		 if ((a > b && a > c))
        {
            if(b > c)
            {
                System.out.print("The sorted numbers: " +c +" "+ b +" "+ a);
            }
            else
                System.out.print("The sorted numbers: " + b +" "+ c +" "+ a);
        }
        else if ((b > a && b > c))
        {
            if(a > c)
            {
                System.out.print("The sorted numbers: " + c +" "+ a +" "+ b);
            }
            else
                {
                System.out.print(" The sorted numbers:" + a +" "+ c +" "+ b);
                }
        }
        else if ((c > a && c > b))
        {
            if(a > b)
            {
                System.out.print("The sorted numbers: " + b +" "+ a +" "+ c);
            }
            else
                System.out.print("The sorted numbers: " + a +" "+ b+" " + c);
        }
		
	}
}


