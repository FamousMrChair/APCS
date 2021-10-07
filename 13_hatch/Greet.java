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

    BigSib richard = new BigSib();

    greeting = richard.greet("Word up freshman");
    System.out.println(greeting);

    greeting = richard.greet("Salutations Dr. Spaceman");
    System.out.println(greeting);
	  
    greeting = richard.greet("Hey ya Kong Fooey");
    System.out.println(greeting);
	  
    greeting = richard.greet("Sup mom");
    System.out.println(greeting);

  } //end main()
} //end Greet


