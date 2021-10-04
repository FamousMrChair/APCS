/* Zooming Xippy Zookeepers, Kevin (Mr. Swag), Nicole (Duck), Jomin (Chompsky) 
APCS
HW 09 - What are Big Sibs good for?
2021 10 01

DISCOVERIES:

Discovered you can make packages by doing package <name>;
Package stores file and you can call upon package by doing import <name>.<file>;
(Must have package <name> in the file that is doing the calling as well)
Run program by typing javac -d <file>.java
java <name>.<file>

Unresolved questions:

How to import a specific class of a java file?
How to import all of the classes of a java file?

*/


package pack;
public class BigSib {
	public static void main(String[] args){
	}
	public static void greet(String str){
		System.out.println("Why, hello there, " + str + ". How do you do?");
	}
}

