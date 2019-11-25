
import java.util.Scanner;

public class practica33 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "1234567ABCDEFG";     //задаем строку
        char[] text = str.toCharArray();  //создаем массив символов из строки
        for (int i = 1; i <= 7; i++) { // строка
            for (int k = 1; k <= 7; k++) { //столбец
                while (k < i) { 
                    System.out.print(" ");
                    k++;
                }
                if (k == i) {
                    System.out.print(text[(6 + i)]);
                }
                while ((k > i) & (k <= 7)) {
                    System.out.print("%");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
