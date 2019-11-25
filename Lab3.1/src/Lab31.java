
import java.util.Scanner;

public class Lab31 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);        // параметр ввода с клавиатуры
        System.out.print("Введите X: ");
        int x;
        int y;
        try {
            x = in.nextInt();
            int s = 78; // 
            y = s / x;
            System.out.println("это не выполнится при прерывании!");
        } catch (ArithmeticException e) {
            System.out.println("ERROR!!!  X не может быть равен нулю!");
            x = 0;
            while (x == 0) {
                System.out.println("Введите новый параметр: ");
                x = in.nextInt();
            }
        }
        y = 78 / x;
        System.out.println("Y = 78 / X = " + y);

    }

}
