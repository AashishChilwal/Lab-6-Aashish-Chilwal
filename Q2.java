import java.util.Scanner;
public class Q2
{
	public static void main(String[] args) {
		 int coinflip = (int) (Math.random() * 2.0);
		 char coin;
		 Scanner guess = new Scanner(System.in);
		 System.out.print("Guess head or tail (H or T)? ");
		 char s = guess.next().charAt(0); ;
		 if (coinflip == 0)
		 {
		    coin = 'H';
		 } else
		 {
		     coin = 'T';
		 }
		 if (s == 'H' && coin == 'H')
		 {
		    System.out.println("Correct! You can read my mind.");
		 } else if (s == 'T' && coin == 'T')
		 {
		     System.out.println("Correct! You can read my mind.");
		 } else if (s == 'H' && coin == 'T')
		 {
		      System.out.println("Sorry, it was tails");
		 }else
		 {
		     System.out.println("Sorry, it was heads");
		 }
		 }
		 }

