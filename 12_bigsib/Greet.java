/* Zooming Xippy Zookeepers, Kevin (Mr. Swag), Nicole (Duck), Jomin (Chompsky) 
APCS
HW 10 - Refactor Big Sib One
2021 10 04

DISCOVERIES:

(Must have package <name> in the file that is doing the calling as well)
Run program by typing javac -d <file>.java
java <name>.<file>

Unresolved questions:

How to import a specific class of a java file?
How to import all of the classes of a java file?

*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");
    greeting = richard.greet("freshman");
    System.out.println(greeting);
	  
    richard.setHelloMsg("Salutations");
    greeting = richard.greet("Dr. Spaceman");
    System.out.println(greeting);
	  
    richard.setHelloMsg("Hey ya");
    greeting = richard.greet("Kong Fooey");
    System.out.println(greeting);
	  
    richard.setHelloMsg("Sup");
    greeting = richard.greet("mom");
    System.out.println(greeting);

  } //end main()
} //end Greet


