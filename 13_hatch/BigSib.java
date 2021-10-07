/* Zooming Xippy Zookeepers, Kevin (Mr. Swag), Nicole (Duck), Jomin (Chompsky) 
APCS
HW 12 - On Elder Individuality and the Elimination of Radio Fuzz
2021 10 05
DISCO:
Using static in "public static void" will create an error message when instance variable HelloMsg is involved.

Q/C/C:
Why is static giving error?
*/

public class BigSib {
	String HelloMsg;
	public BigSib(String str){
		HelloMsg = str;
	}
	public String greet(String str){
		return HelloMsg;
	}
}
