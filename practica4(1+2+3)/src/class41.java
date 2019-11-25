 //Записать введенную строку в файл info.txt
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class class41 {
    public void zapis()throws IOException {
        Scanner in = new Scanner(System.in);      
      File file = new File("info.txt");  
      file.createNewFile();                     // Создание файла
      FileWriter writer = new FileWriter(file); // Создание объекта FileWriter
      System.out.println("Введите фразу которую нужно записать в файл: ");
      String str=in.nextLine();      
      writer.write(str);   // Запись содержимого в файл
      writer.flush();
      writer.close();  // Закрытие файла   
      System.out.println("Введенный текст находится в папке " + file.getName()    );
    }
}
    
