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


package pack;
import pack.BigSib;
public class Greet{
	public static void main(String[] args){
		System.out.println( BigSib.greet("Kevin") );
        	System.out.println( BigSib.greet("Nicole") );
        	System.out.println( BigSib.greet("Jomin") );
	}
}
    
