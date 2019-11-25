//Поиск полиндромов
import java.util.Scanner;
public class Lab1 {
public  static  void  main (String[] args) {
 
    Scanner in = new Scanner(System.in);        // параметр ввода с клавиатуры
    System.out.println("Количество слов: ");
    int N = in.nextInt();       //количество слов
    System.out.println("Количество букв: ");
    int L = in.nextInt();       //количество букв в слове

    String[]word = new String[N];            // массив будущих строк
    for (int i=0 ; i<N ; i++){                           
        String stroka="";                    // переменная stroka будет отображать слово
            for (int x=0 ; x<L ; x++){                       //функция введения букв с помощью рандомайзера
                int rand = (int)(Math.random()*25) +97;     //рандомное число от 97 до 122
                char bukva;
                bukva = (char)rand;                         //по таблице ASCII находим какая буква соответствует полученному рандомному числу
                stroka = stroka+bukva;
        }
        word[i]=stroka; //присваиваем строку в массив
        }
    
    
    System.out.println("Полученный текст: ");   // вывод на экран полученных слов
    for (int i=0 ; i<N ; i++){
        if (i % 100 == 0 & i!=0){
        System.out.println();
    }
        System.out.print(word[i]+ " ");   
    }
    
    System.out.println();
    System.out.println();
    System.out.println("Найденные полиндромы из исходного текста: "); // проверка слов на полиндромы
    int K=0;
    for (int i=0 ; i<N ; i++){
        String polindrom = new StringBuilder (word[i]).reverse().toString();  //Используем StingBuilder чтобы можно было воспользоваться reverse(), и сразу же меняем в String
        boolean proverka;  
        proverka = polindrom.equals(word[i]); // фукнция проверки двух строк
        if (proverka == true ){
        K++;
        int z =i +1;
        System.out.println("Номер строки: "+ z + ". "+ word[i] + " <-> " + polindrom);
       
       }  
       
} 
    // System.out.println("Найдено полиндромов: "+K);
    if (K==0){
             System.out.println("Полиндромов нет. Попробуйте снова");  // баннер при отсутствии полиндромов
        }
    else {System.out.println("Найдено полиндромов: "+K);
    }
}
}