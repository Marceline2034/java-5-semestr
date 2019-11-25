//создать слово из 20 букв, удалить символы а
package practica2.pkg1;
import java.util.Scanner;

public class Practica23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stroka = "";
        
         System.out.print("Введите символ который необходимо удалить из слова: ");  // задаем букву, которую будем удалять
        String str = in.nextLine();
        char let = str.charAt(0);
        //System.out.println(let);
        
        
        for (int i = 0; i < 20; i++) {                      //Создаем слово из 20 букв с помощью рандомайзера
            int rand = (int) (Math.random() * 25) + 97;     //рандомное число от 97 до 122
            char bukva;
            bukva = (char) rand;                            //по таблице ASCII находим какая буква соответствует полученному рандомному числу
            stroka = stroka + bukva; }
        
        
        System.out.println("Полученное слово: "+stroka);
        char[] word = stroka.toCharArray();              // создаем из строки массив из букв
        String newWord = "";                    //в эту переменную поместим все элементы массива без букв "a"
        int k=0;
         

        for (int i = 0; i < 20; i++) {
            if (word[i]==let)   {               //если элемент массива равен "a", то ничего не делаемa
                k++;            
            }
            else                     {
            newWord= newWord+word[i];}     //прибавляем элементы в строку
        }
        System.out.println("  Изменное слово: "+newWord);
        System.out.println("Было удалено "+k+ " символов "+let);
    }
}
    
