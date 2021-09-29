public class Time{
      public static void main(String[] args){
        double hour = 18.0;
        double minute = 48.0;
        double second = 40.0;
          System.out.println(hour * 3600 + minute * 60 + second);
          System.out.println(86400 - (hour * 3600 + minute * 60 + second));
          System.out.println((hour * 3600 + minute * 60 + second)/864.0);
        double hour1 = 18.0;
        double minute1 = 54.0;
        double second1 = 30.0;
          System.out.println((hour1 * 3600 + minute1 * 60 + second1) - (hour * 3600 + minute * 60 + second) + "seconds");
      }
}
