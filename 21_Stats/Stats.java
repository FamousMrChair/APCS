
/**
   Ur mom
   APCS
   HW21 --
   2021-10-21
   xtra: harmonic mean is the reciprocal of the
   arithmetic mean of the reciprocals
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
  	return Math.sqrt(a * b);
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
	return Math.cbrt(a * b * c);
  }

  public static double geoMean(double a, double b, double c) {
	double product = (a * b * c);
	return Math.cbrt(product);

  }


  //main method for testing functionality
  public static void main( String[] args ) {

  }

}//end class
