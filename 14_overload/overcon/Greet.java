/* Mr. Staley forgot us, Kevin (Mr. Swag) and Corina
APCS
HW 13 - Where do BigSibs Come From?
2021 10 06
DISCO:
Constructors variables can't be changed to other strings once set.

Q/C/C:

Why do constructors have to be public?
Why do constructors not have a void element?
Why do constructors exist?
Can't we do everything constructors and instance variables do with regular methods?
Why are we doing this at all?
What is Corina's ducky's name and will she ever tell me?
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
                greeting = richard.greet("Dr. Spaceman");
                System.out.println(greeting);
                greeting = richard.greet("Kong Fooey");
                System.out.println(greeting);
                greeting = richard.greet("mom");
                System.out.println(greeting);
    }
}
