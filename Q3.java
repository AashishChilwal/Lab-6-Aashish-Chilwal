public class Q3
{
	public static void main(String[] args) {
		 int card = (int) (Math.random() * 52.0);
		 int rank = card %13;
		int suite = card/13;
		 String rank_1 = "",suite_1 = "" ;
		 if (rank == 0)
		 {
		     rank_1 = "Ace";
		 }else if (rank == 11)
		 {
		     rank_1 = "Jack";
		 }else if (rank == 12)
		 {
		     rank_1 = "Queen" ;
		 } else if (rank == 13)  
		 {
		     rank_1 = "King";
		 }else 
		{
		    rank_1 = Integer.toString(rank);
		}
		 switch (suite)
		 {
		      case 0 : 
		          suite_1 = "Clubs";
		          break;
		      case 1 :
		          suite_1 = "Diamonds";
		          break;
		      case 2 :
		          suite_1 = "Hearts";
		          break;
		      case 3 :
		          suite_1 = "Spades";
		          break;
		 }
	
	    System.out.println("The card you picked is a "+rank_1+" of " + suite_1);
	}
}

