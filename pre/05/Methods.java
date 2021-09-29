public class Methods{

    //Exercise 2
    public static boolean isDivisible(int n, int m){
      return n % m == 0;
    }
    //Exercise 3
    public static boolean isTriangle(int n, int m, int o){
      if (n + m <= o) {
        return false;
      } else if (m + o <= n){
        return false;
      } else if (n + o <= m){
        return false;
      } else{
        return true;
      }
    }
    //Exercise 8
    public static int ack(int m,int n){
      int z = 0;
      if (m == 0){
        z = n + 1;
      } else if(m > 0 && n == 0){
        z = ack(m-1,1);
      } else if(m > 0 && n > 0){
        z = ack(m-1,ack(m,n-1));
      }
      return z;
    }

    public static void main(String[] args){
      System.out.println(isDivisible(9,4));
      System.out.println(isTriangle(9,4,12));
      System.out.println(ack(3,3));
    }

}
