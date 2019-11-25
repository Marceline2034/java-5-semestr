//Записать в файл info.txt. строку «Java virtual machine».
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Practica41 {

    public static void main(String[] args)throws IOException {
      File file = new File("info.txt");  
      file.createNewFile();                     // Создание файла
      FileWriter writer = new FileWriter(file); // Создание объекта FileWriter
      
      String word = "Java virtual machine";  
      
      writer.write(word);   // Запись содержимого в файл
      writer.flush();
      writer.close();  // Закрытие файлв
    }
    
}
