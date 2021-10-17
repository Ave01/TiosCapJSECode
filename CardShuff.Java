public class CardShuff {

	public static void main(String[] args) {
		
		//Array to use as a deck of cards
		int deck[] = {0, 1, 2, 3, 4, 5, 6, 7, 8,
                9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22,
                23, 24, 25, 26, 27, 28, 29,
                30, 31, 32, 33, 34, 35, 36,
                37, 38, 39, 40, 41, 42, 43,
                44, 45, 46, 47, 48, 49, 50, 
                51};
		
		 for(int j = 0; j < 7; j++) {
			 //Find the halfway point of my deck and make a temp array to hold my values
			 int mid = deck.length / 2;
			 int[] temp = new int[deck.length];
			 int x = 0;
			 int y = 0;
			 //Iterate through the deck and add first half off the deck in every other spot, iterating by 2
			 for( ; x < mid; x ++) {
				 temp[y] = deck[x];
				 y += 2;   
			 }
			 //Iterate through the deck and add the second half where it should be
			 y = 1;
			 for( ; x < deck.length; x++) {
				 temp[y] = deck[x];
				 y += 2;
			 }
			 //Shift the temp deck values over to the actual deck
			 for( x = 0; x < deck.length; x++) {
				 deck[x] = temp[x];
			 }
			 //Print out the deck with their shuffle number
			 for(int i = 0; i < deck.length; i++) {
				 System.out.print(deck[i] + " ");
			 }
			 System.out.println("This is Shuffle number" + j);
		 }


	}
}
