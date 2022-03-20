/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Deck Kevin1 = new Deck(['one', 'two', 'three'], ['spade','diamond'], [1,2,3]);
		Deck Kevin2 = new Deck(['four', 'five', 'six'], ['heart','clover'], [4,5,6]);
		Deck Kevin3 = new Deck(['seven', 'eight', 'nine'], ['spade','heart'], [7,8,9]);
	}
}
