/* "Trio config for one day": Kevin Xiao + Mr. Swag, Corina Chen + Binktop, Anthony Sun + Corn
 * APCS
 * HW14 -- Overloading constructors
 * 2021-10-07
 *
DISCOVERIES:
 * The constructor can be overloaded to perform different tasks if given different argument inputs.
 * Each other's ducky names
 * You can stack multiple constructors together in the same file (overloading)
QCC:
 * What happens if a constructor is private?
 * Why doesn't a constructor have "static"?
 */

public class Greet{
    public static void main ( String[] args ) {
        String greeting;
        BigSib richard = new BigSib("Word up");
                BigSib grizz = new BigSib("Hey ya");
                BigSib dotCom = new BigSib("Sup");
                BigSib tracy = new BigSib("Salutations");
        greeting = richard.greet("freshman");
        System.out.println(greeting);
                greeting = tracy.greet("Dr. Spaceman");
                System.out.println(greeting);
                greeting = grizz.greet("Kong Fooey");
                System.out.println(greeting);
                greeting = dotCom.greet("mom");
                System.out.println(greeting);
    }
}
