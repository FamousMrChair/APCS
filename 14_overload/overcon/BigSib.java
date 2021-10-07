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

public class BigSib {
	String HelloMsg;
	public BigSib(String str){
		HelloMsg = str;
	}
	public String greet(String str){
		return HelloMsg + " " + str;
	}
}
