/**/
import java.util.Scanner;

public class practica31 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Введите 10 целых чисел: ");
        for (int i = 0; i <= 9; i++) {
            arr[i] = in.nextInt();
        }
        int min = arr[0];
        int max = arr[9];
        int s = 0;
        for (int i = 0; i <= 9; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
            if (arr[i] >= max) {
                max = arr[i];      
            }
            s = s + arr[i];
        }
        s=s/10;
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("Среднее арифметическое = " + s);
    }
}
