
import java.util.Scanner;
// расшифровка рандомного текста

public class Metzam {

    public void func() {
        Scanner in = new Scanner(System.in);        // параметр ввода с клавиатуры
        System.out.println("Количество слов: ");
        int N = in.nextInt();       //количество слов
        System.out.println("Количество букв в слове: ");
        int L = in.nextInt();       //количество букв в слове
        System.out.println("Коэффициент сдвига: ");
        int k = in.nextInt();
       
        if (k > 26) {
            while (k > 26) {
                k = k - 26;
            }
        }
        if (k == 26) {
            k = 0;
        }
        
        String stroka = "";                    // переменная stroka будет отображать слово
        String newStroka = "";
        String[] newWord = new String[N];
        String[] word = new String[N];            // массив будущих строк

       // System.out.println("К: " + k);
        for (int i = 0; i < N; i++) {
            for (int x = 0; x < L; x++) {                       //функция введения букв с помощью рандомайзера
                int rand = (int) (Math.random() * 26) + 97;     //рандомное число от 97 до 122
                char bukva;
                char sdvig;
                bukva = (char) rand;                         //по таблице ASCII находим какая буква соответствует полученному рандомному числу
                int sdv = rand + k;
               // System.out.println("sdv " + sdv);
                if (sdv >= 122) {
                    while (sdv > 122) {
                        sdv = sdv - 26;
                    }
                }
                //System.out.println("sdv2 " + sdv);
                sdvig = (char) (sdv);    // сдвигаем код символа на K позиций
                stroka = stroka + bukva;
                newStroka = newStroka + sdvig;
            }
            stroka = stroka + " ";
            newStroka = newStroka + " ";
        }
        System.out.println("Изначальный текст: " + stroka);   // вывод на экран полученных слов
        System.out.println("Зашифрованный текст: " + newStroka);   // вывод на экран полученных слов
    }
}
