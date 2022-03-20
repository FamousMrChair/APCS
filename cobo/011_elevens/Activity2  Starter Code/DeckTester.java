/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = new String[3];
		ranks[1] = 'one';
		ranks[2] = 'two';
		ranks[3] = 'three';
		Deck Kevin1 = new Deck(ranks, ['spade','diamond'], [1,2,3]);
		System.out.println(Kevin1.size());
		

		
	}
}
