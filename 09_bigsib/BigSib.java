/* Kevin Xiao
APCS
HW 09 - What are Big Sibs good for?
2021 10 01

DISCOVERIES:

We discovered you can create separate function and call it in main. Also, its structurally better to place the void main first. Void calls for an output,
not a return

Unresolved questions:

What does (Stringp[] args) of void main do?
What does public static mean?
*/


package BigSib;
public class BigSib {
	public static void main(String[] args){
	}
	public static void greet(String str){
		System.out.println("Why, hello there, " + str + ". How do you do?");
	}
}

