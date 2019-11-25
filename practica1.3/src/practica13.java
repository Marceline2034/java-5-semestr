// поиск минимального из трех целых чисел
import java.io.PrintStream;
import java.util.Scanner;
public class practica13 {
     public  static  void  main (String[] args) {
         try (Scanner in = new Scanner(System.in)) {
             int a = in.nextInt();
             int b = in.nextInt();
             int c = in.nextInt();
             int min=a;
             if (b<=min & b<=c){
                 min=b;
             } 
             else if (c<=min & c<=b){
                 min=c;
             }
             PrintStream printf = System.out.printf("Min is = ");
             System.out.println(min);   
}
}   
}
