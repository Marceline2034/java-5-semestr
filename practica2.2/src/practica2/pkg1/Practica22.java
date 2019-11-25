
// создать слово из 10 букв, поменять местами 1 и 10 элементы, 2 на место 5, 7 на место 2.
package practica2.pkg1;
import java.util.Arrays;
import java.util.Scanner;

public class Practica22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stroka = "";
        for (int x = 0; x < 10; x++) { //Создаем слово из 10 букв с помощью рандомайзера
            int rand = (int) (Math.random() * 25) + 97;     //рандомное число от 97 до 122
            char bukva;
            bukva = (char) rand;                         //по таблице ASCII находим какая буква соответствует полученному рандомному числу
            stroka = stroka + bukva;
        }
        System.out.println("Полученное слово: "+stroka);
         System.out.println();

        char[] word = stroka.toCharArray();  // создаем из строки массив из букв

        System.out.println("Полученный массив: "+Arrays.toString(word));
        System.out.println();
        int q = word[9];
        word[9] = word[0];
        word[0] = (char) q;   // меняем местами 1 и 10 элемент
        //System.out.println(word[0]);
        //System.out.println(word[9]);
        word[4]=word[1];  // ставим 2 элемент на 5 место
        word[1]=word[6];  // ставим 7 элемент на 2 место
        String b = new String(word); // снова создаем строку из массива букв
        System.out.println("Измененное слово: "+b);
               System.out.println();
    }
}
