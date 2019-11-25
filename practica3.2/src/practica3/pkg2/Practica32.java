//Заполнить с клавиатуры массив из восьми символьных строк, при-чем так, чтобы некоторые слова совпадали.
//1) Определить, какие слова и сколько раз повторяются.
//2) Сформировать второй массив, в котором порядок букв в словах изменен на противоположный.
package practica3.pkg2;

import java.util.Scanner;

public class Practica32 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        // параметр ввода с клавиатуры
        int a = 8;
        String[] word = new String[a];
        String stroka = ""; // сюда впишем в виде строки весь массив
        StringBuilder[] reWord = new StringBuilder[a];

        for (int k = 0; k < a; k++) {   //заполняем массив словами
            System.out.print("Введите " + (k + 1) + " слово: ");
            String str;
            str = in.nextLine();
            word[k] = str;
            stroka += str + " "; // заполняем строку словами чтобы потом вывести на экран
            reWord[k] = new StringBuilder(word[k]).reverse(); // сразу заполняем массив со словами в обратном порядке           
        }
        // StringBuilder b = reWord[2];
        //System.out.println(stroka);
        String str = "";
        int count = 1;
        int countAll = 0;
        int k, i;
        for (k = 0; k < word.length; k++) {
            count = 1;
            for (i = 0; i < word.length; i++) {
                if (k == i) {
                } else if ((word[k].equals(word[i]) == true) & (!word[k].equals(str))) {
                    count++;
                    word[i] = str;
                }
                countAll += count - 1;
            }
            if (count > 1) {
                System.out.println("Слово " + word[k] + " повторяется " + count + " раз");
            }

        }
        if (countAll == 0) {
            System.out.println("совпадений нет!" );
        }
    }
}
