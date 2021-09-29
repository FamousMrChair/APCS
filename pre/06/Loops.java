import java.lang.Math;
public class Loops{

    //Exercise 3
    public static double power(double x, int n){
      int z = 0;
      double y = x;
      while (z < n){
        y = y * x;
        z += 1;
      }
      return y;
    }

    //Exercise 4
    public static int factorial(int x){
      int z = x;
      while (x > 1){
        z = z * (x-1);
        x -= 1;
      }
      return z;
    }

    //Exercise 5
    public static int myexp(int x,int n){
      int z = 1;
      int y = 1;
      int v = 1;
      for (int i = 1; i <= n; i = i + 1){
        y = y * x;
        v = v * i;
        z = z + y/v;
      }
      return z;
    }

    public static int check(int x){
      return x + myexp(x,90) + Math.exp(x);
    }

    public static void main(String[] args){
        System.out.println(power(4.0,3));
        System.out.println(factorial(8));
        System.out.println(myexp(5,4));
        System.out.println(check(4));
    }

}
