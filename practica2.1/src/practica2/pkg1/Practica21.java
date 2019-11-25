//Задать в программе  целое и дробное число. Если целое больше 
//дробного, то целое сдвинуть на один двоичный разряд вправо, 
//если нет –на два двоич-ных разряда влево.
package practica2.pkg1;
import java.util.Scanner;
public class Practica21 {

     public  static  void  main (String[] args) {
        Scanner in = new Scanner(System.in);
             int x = in.nextInt();
             double b = in.nextDouble();
             //System.out.println("Двоичная форма числа " + x + ": " + Integer.toString(x, 2));
             //System.out.println("Двоичная форма числа " + b + ": " + Long.toBinaryString(Double.doubleToRawLongBits(b)));
             // System.out.println(Double.toString(b));
             if (x>=b) {
                 System.out.println("т.к. " + x + " >= " + b + " , сдвигаем " + x + " на один двоичный разряд вправо");
                 int a= x>>1;
                 System.out.println("Двоичная форма числа " + x + ": " + Integer.toString(x, 2));
                 System.out.println("Двоичная форма числа " + a + ": " + Integer.toString(a, 2));
                 System.out.println("Результат:" + a);
             }
             else {
                 System.out.println("т.к. " + x + " < " + b + " , сдвигаем " + x + " на два двоичных разрядов влево");
                 int a= x<<2;
                 System.out.println("Двоичная форма числа " + x + ": " + Integer.toString(x, 2));
                 System.out.println("Двоичная форма числа " + a + ": " + Integer.toString(a, 2));
                 System.out.println("Результат:" + a);
                 
             }   
         }


}
