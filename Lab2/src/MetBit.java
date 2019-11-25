
import java.util.Scanner;

public class MetBit {

    public void functi() {
        Scanner in = new Scanner(System.in);        // параметр ввода с клавиатуры     
        String str = "12345 / , . adc";
        String encod = "secret";
        System.out.println("Введенный текст: " + str);
        System.out.println("Кодовое слово: " + encod);
       
        char[] cod = encod.toCharArray();
        char[] text = str.toCharArray();
        char[] result = str.toCharArray();

        int[] result2 = new int[str.length()];
        String newStroka = "";
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (j == encod.length()) {    //сбиваем счетчик кодового слова к нулю
                j = 0;
            }
            int codnom = (int) cod[j];  // находим код буквы ключевого слова
            j++;
            int textnom = (int) text[i];        // находим код буквы из текста
            int d = (int) (textnom ^ codnom);
            result2[i] = d;
            while (d > 26) {
                d = d - 26;
            }
            d = 97 + d;
            result[i] = (char) d;
            newStroka = newStroka + result[i];

        }
        System.out.println("Зашифрованный текст: " + newStroka);
        System.out.println();
        System.out.println("Введите 1, если хотите расшифровать текст");
        System.out.println("Введите 2, если хотите закончить программу");
        int k = in.nextInt();
        switch (k) {
            case 1:
                System.out.println("...РАСШИФРОВКА...РАСШИФРОВКА...РАСШИФРОВКА...РАСШИФРОВКА...");
                String thisStroka = "";
                j = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (j == encod.length()) {
                        j = 0;
                    }
                    int codnom = (int) cod[j];
                    j++;
                    int shifrnom = result2[i];
                    int d = (int) (shifrnom ^ codnom);
                    char e = (char) d;
                    thisStroka = thisStroka + e;
                }
                System.out.println();
                System.out.println("Расшифрованный текст: " + thisStroka);
                System.out.println();
                System.out.println();
                break;
            case 2:
                System.out.println();
                System.out.println("Спасибо, приходите еще!");
                System.out.println();
                break;
        }
    }
}
