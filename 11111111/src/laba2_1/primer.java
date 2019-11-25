
package laba2_1;
import java.util.InputMismatchException;
import java.util.Scanner;

/*1. Шифрование с помощью циклического сдвига
2. Шифрование с помощью операции "хоr"
При выборе пунктов 1 и 2, приложение распечатывает исходный
текст, зашифрованный текст и расшифрованный текст.
 
Числовое значение буквы исходного текста берутся по порядковому номеру в алфавите.
Буква "А" это число 1.
Регистр букв не учитывается.
------------
* */
public class primer {
 
    public static void main(String[] args) {
   
        String inputText;
        int choice=0;
        
        while (choice != 3){
            System.out.println("Выберите пункт меню:");
            System.out.println("1. Шифрование циклического сдвига");
            System.out.println("2. Шифрование с помощью операции \"XOR\"");
            System.out.println("3. Выход из программы");
            System.out.print("Ваш выбор: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            try { // обработка исключительной ситуации InputMismatchException на случай, если не выбрали 1,2,3 пунки и ввели символ.
            
            switch (choice) {
                case 1:
                { System.out.println("Шифрование циклическим сдвигом");
                    
                    Scanner in = new Scanner(System.in); // параметр ввода с клавиатуры
                    System.out.println("Коэффициент сдвига: ");
                    int s = in.nextInt();
                    if (s>26){while(s>26){
                        s=s-26;
                    }}
                    if (s==26){s=0;}
                    System.out.println("коэффициент " + s);
                   System.out.println("Введите строку для шифрования");
                   Scanner scan = new Scanner(System.in);
                   String str = scan.nextLine();
                    System.out.println("Введенный текст: " + str);
                    char[] massiv = str.toCharArray(); // создаем массив символом из строки
                    char tap; //сдвиг
                    String newStroka="";
                    for (int i=0 ; i<str.length() ; i++){
                        int number =(int)massiv[i]; // находим код символа
                        int sdv=number+s;
                        
                        if (sdv>=122){
                            while(sdv>122){
                                sdv=sdv-26;
                            }
                        }
                      
                        tap = (char)(sdv); // сдвигаем код символа на K позиций
                        
                        newStroka=newStroka+tap; 
                    }
                    
                    System.out.println("Зашифрованный текст: "+newStroka);
                    System.out.println("Расшифрованный текст: "+str);
                }
                break;
                 
                                        
                case 2:functi(); //вызывем метод functi, который описан ниже

                    System.out.println("Шифрование с помощью операции \"хоr\"");
                    inputText = inputText();
                    System.out.println(inputText);
                    
                    System.out.println("Содержимое текста после шифрования: ");
                    // вначале кодируем, потом кодируем текст вызывая метод encodeXOR и полученный результат передаем в метод decodeXOR
                    
                    break;

     
                case 3:
                   System.err.println("Введено неверное значение, выход из программы");
                    break; 
            }
            
        } catch (InputMismatchException ime) {
            System.err.println("Неверное значение выбранного пункта. Выход из программы");
            scanner.nextLine();
        }}       
    
    }
   
    // ввод текста для шифрования
    public static String inputText(){
        System.out.println("Введите текст для шифрования: ");
        Scanner scanner2 = new Scanner(System.in);
        String text = "";
 
        System.out.print("Введите строку 1: ");
        String string1 = scanner2.nextLine();
        text += string1 + "\n";
        System.out.print("Введите строку 2: ");
 
        String string2 = scanner2.nextLine();
        text += string2 + "\n";
        System.out.print("Введите строку 3: ");
 
        String string3 = scanner2.nextLine();
        text += string3 + "\n";
        return text;
    }
    // метод шифрования строки на основе операции XOR

       
     public static void functi() {
     
        String str =inputText() ;
        String encod = "secret";
        
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
            System.out.println("Зашифрованный текст: " + newStroka);
            System.out.println();
            
        }
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
                
     }
             
            
        }
    
    
   
 
    
 
 