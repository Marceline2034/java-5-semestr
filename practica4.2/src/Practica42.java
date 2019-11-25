//Прочитать данные из файла и вывести на экран.
import java.io.File;
import java.io.FileReader;
//import java.io.Exception;
import java.util.Scanner;
public class Practica42 {

    public static void main(String[] args)throws Exception {
      FileReader fr = new FileReader("gataullina.txt"); // Создание объекта FileReader
      Scanner in = new Scanner(fr); //создаем сканер с параметром файлридера
      //int i = 1;
        
        while (in.hasNextLine()) {
            System.out.println( in.nextLine());
            //i++;
        }
      fr.close();  // Закрытие файлв
    }
    
}