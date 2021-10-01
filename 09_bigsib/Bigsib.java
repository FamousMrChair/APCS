/* Kevin Xiao
APCS
HW 08 - Greet Function
2021 09 30

DISCOVERIES:

We discovered you can create separate function and call it in main. Also, its structurally better to place the void main first. Void calls for an output,
not a return

Unresolved questions:

What does (Stringp[] args) of void main do?
What does public static mean?
*/

public class Greet {
	public static void main(String[] args){
		greet("Jomin");
		greet("Anthony");
		greet("Kevin");
	}
	public static void greet(String str){
		System.out.println("Why, hello there, " + str + ". How do you do?");
	}
}

