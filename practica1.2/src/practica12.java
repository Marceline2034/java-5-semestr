// вычислить значение функции y = 12x  + b;
import java.io.PrintStream;
import java.util.Scanner;
public class practica12 {
     public  static  void  main (String[] args) {
         try (Scanner in = new Scanner(System.in)) {
             float x = in.nextFloat();
             float b = in.nextFloat();
             float y = 12*x+b;
             
             PrintStream printf = System.out.printf("y=");
             System.out.println(4*x+b);   
         }
}   
}
