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
  public static int mean(int a, int b) {
  	return (a + b)/2;
  }

  public static double mean(double a, double b) {
  	return (a + b)/2.0;

  }

  public static int max(int a, int b) {
  	if (a > b){
  		return a;
  	} else {
  		return b;
  	}
  }

  public static double max(double a, double b) {
   	if (a > b){
  		return a;
  	} else {
  		return b;
  	}

  }

  public static int geoMean(int a, int b) {
	int hello = Math.toIntExact(Math.round(Math.sqrt(a * b)));
 	return hello;
  }

  public static double geoMean(double a, double b) {
	double product = (a * b);
  	return Math.sqrt(product);
  }

  public static int max(int a, int b, int c) {
	if (a > b && a > c){
  		return a;
  	} else if(b > c){
  		return b;
  	} else {
  		return c;
	}
  }

  public static double max(double a, double b, double c) {
	if (a > b && a > c){
  		return a;
  	} else if(b > c){
  		return b;
  	} else {
  		return c;
  	}

  }

  public static int geoMean(int a, int b, int c) {
	int hello = Math.toIntExact(Math.round(Math.cbrt(a * b * c)));
 	return hello;
  }

  public static double geoMean(double a, double b, double c) {
	double product = (a * b * c);
	return Math.cbrt(product);

  }
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
     if (a > b){
        return gcdEr(b, (b % a));
     }else{
        return gcdEr(a, (a & b));
  }
  /*
  public static int gcdEW(int a, int b) {
  }*/
  public static void main( String[] args ) {
    System.out.println("gcd test:");
    System.out.println(gcd(3, 3));
    System.out.println(gcd(3, 6));
    System.out.println(gcd(6, 10));
    /*System.out.println("gcdER test:");
    System.out.println(gcdER(3, 3));
    System.out.println(gcdER(3, 6));
    System.out.println(gcdER(6, 10));
    System.out.println("gcdEW test:");
    System.out.println(gcdEW(3, 3));
    System.out.println(gcdEW(3, 6));
    System.out.println(gcdEW(6, 10));*/
  }
}
