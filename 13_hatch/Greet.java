/* Zooming Xippy Zookeepers, Kevin (Mr. Swag), Nicole (Duck), Jomin (Chompsky) 
APCS
HW 13 - Where do BigSibs Come From?
2021 10 06
DISCO:
Using static in "public static void" will create an error message when instance variable HelloMsg is involved.

Q/C/C:
Why is static giving error?
*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;
    BigSib richard = new BigSib("Word up");
    greeting = richard.greet("freshman");
    System.out.println(greeting);
	  BigSib richard = new BigSib("Salutations");
    greeting = richard.greet("Dr. Spaceman");
    System.out.println(greeting);
	  BigSib richard = new BigSib("Hey ya");
    greeting = richard.greet("Kong Fooey");
    System.out.println(greeting);
	  BigSib richard = new BigSib("Sup");
    greeting = richard.greet("mom");
    System.out.println(greeting);

  } //end main()
} //end Greet


