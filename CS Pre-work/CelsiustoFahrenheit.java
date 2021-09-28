import java.util.Scanner;
public class CelsiustoFahrenheit{
      public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double Celsius;
          System.out.println("Input?");
          Celsius = in.nextDouble();
          System.out.println(Celsius * 9 / 5 + 32);


      }
}
