public class hw28{
/* Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
*/
  public String helloName(String name) {
    return "Hello " + name + "!";
  }
/*Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"
*/
  public String makeAbba(String a, String b) {
    return a + b + b + a;
  }
  public static void main(String[] args){
    System.out.println(helloName("Bob"));
    System.out.println(helloName("Alice"));
    System.out.println(helloName("X"));
    System.out.println(makeabba("Hi", "Bye"));
    System.out.println(makeabba("Yo", "Alice"));
    System.out.println(makeabba("What", "Up"));
  }
}
