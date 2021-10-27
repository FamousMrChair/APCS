/**
   NIWWD: Kevin Xiao + Mr. Swag, Jeffery Tang + Mathias, Kaitlin Ho + Apple 
   APCS
   HW26 -- GCD Three Ways
   2021-10-27
   time spent: 0.5 hours
**/

/**
   DISCO:
   QCC:
**/


public class Stats {
 
  public static int gcd(int a, int b) {
    int counter = 1;
    int g = 1;
    if (a > b) {
      while (counter <= b) {
        if (a % counter == 0 && b % counter == 0) {
          g = counter;
        }
        counter += 1;
      }
    }
    else {
      while (counter <= a) {
        if (a % counter == 0 && b % counter == 0) {
          g = counter;
        }
        counter += 1;
      }
    }
    return g;
  }
  public static int gcdER(int a, int b) {
     if (a > b && b != 0){
        return gcdER(b, (a % b));
     }else if(b == 0){
        return a;
     }else if (a < b && a != 0){
        return gcdER(a, (b % a));
     }else{
        return b;
     }
  }
  
  public static int gcdEW(int a, int b) {
     while (a != 0 && b != 0){
        if (a < b){
           b = b % a;
        }
        if (a > b){
           a = a % b;
        }
     }
     if (a == 0){
        return b;
     } else {
        return a;
     } 
  }
  public static void main(String[] args) {
    System.out.println("gcd test:");
    System.out.println(gcd(3, 3));
    System.out.println(gcd(3, 6));
    System.out.println(gcd(6, 10));
    System.out.println(gcd(1000, 870));
    System.out.println("gcdER test:");
    System.out.println(gcdER(3, 3));
    System.out.println(gcdER(3, 6));
    System.out.println(gcdER(6, 10));
    System.out.println(gcdER(1000, 870));
    System.out.println("gcdEW test:");
    System.out.println(gcdEW(3, 3));
    System.out.println(gcdEW(3, 6));
    System.out.println(gcdEW(6, 10));
    System.out.println(gcdEW(1000,870));
  }
}
