
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class class42 {

    public void chtenie() throws IOException {
        File file = new File("gataullina.txt");  
        file.createNewFile(); 
        FileReader fr = new FileReader(file); // Создание объекта FileReader
        Scanner in = new Scanner(fr); //создаем сканер с параметром файлридера
        while (in.hasNextLine()) { 
            System.out.println(in.nextLine());
        }
        fr.close();  // Закрытие файлв
    }
}
