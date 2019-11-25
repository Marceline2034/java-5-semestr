//Прочитать данные из файла и вывести на экран.

import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

public class JavaApplication20 {

    public static void main(String[] args) throws IOException {
            
        InputStreamReader ISR = new InputStreamReader(System.in); // поток чтения с консоли
            BufferedReader BR = new BufferedReader(ISR);  // соединяем InputStreamReader с BufferedReader

            FileReader fr = new FileReader("file.txt");

            File file = new File("file.txt");  //файл куда впишем все строки с консоли
            Scanner scan = new Scanner(file);
            FileWriter FW = new FileWriter(file); // поток, который подключается к текстовому файлу
            BufferedWriter BW = new BufferedWriter(FW); // соединяем FileWriter с BufferedWriter

            File file2 = new File("file2.txt"); // файл, куда впишем все строки где нет символа "a"
            FileWriter FW2 = new FileWriter(file2); // поток, который подключается к текстовому файлу

            String str;
            while (!(str = BR.readLine()).equals("exit")) { // пока введенное слово не будет равно "exit", команда будет вписывать слова построчно в file.txt
                FW.write(str + "\n"); //вписываем слово в первый файл         
                if (str.contains("a")  ) { 
                   FW2.write(str + "\n"); //если слово содержит символ "а", вписываем его во второй файл
            }
            }

           FW.close();
           FW2.close();
           BR.close(); // закрываем поток
           BW.close(); // закрываем поток
           fr.close();

    }
}
