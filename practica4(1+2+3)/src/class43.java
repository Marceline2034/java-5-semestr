import java.io.*;
import java.util.Scanner;
public class class43 {

    public void DeleteA() throws IOException {
        Scanner in = new Scanner(System.in); 
        InputStreamReader ISR = new InputStreamReader(System.in); // поток чтения с консоли
        BufferedReader BR = new BufferedReader(ISR);  // соединяем InputStreamReader с BufferedReader
        
        File file = new File("file.txt");  //файл куда впишем все строки с консоли  
        file.createNewFile(); //создаем файл
        FileReader fr = new FileReader(file);
        Scanner scan = new Scanner(file);
        FileWriter FW = new FileWriter(file); // поток, который подключается к текстовому файлу
        BufferedWriter BW = new BufferedWriter(FW); // соединяем FileWriter с BufferedWriter

            File file2 = new File("file2.txt"); // файл, куда впишем все строки где нет символа "a"
            file2.createNewFile();
            FileWriter FW2 = new FileWriter(file2); // поток, который подключается к текстовому файлу

            String str;
            System.out.println("Вводите слова. В конце напишите exit: ");
                 while (!(str = BR.readLine()).equals("exit")) { // пока введенное слово не будет равно "exit", команда будет вписывать слова построчно в file.txt
                FW.write(str + "\n"); //вписываем слово в первый файл         
                if (str.contains("a")  ) { 
                   FW2.write(str + "\n"); //если слово содержит символ "а", вписываем его во второй файл
            }
            }
            while(scan.hasNextLine()) {
             str = scan.nextLine();
            if (str.contains("a")  ) { 
                   FW2.write(str + "\n"); //если слово содержит символ "а", вписываем его во второй файл
        }
            }
           
            System.out.println("Введенный текст находится в папке " + file.getName()    );
            System.out.println("Строки, содержащие символ 'a' находятся в папке " + file2.getName()    );
            System.out.println("Хотите удалить файлы?" );
            System.out.println("1, если да \n2, если нет" );
            int k = in.nextInt();  
            switch (k) {
    case 1:     file.delete();
                file2.delete();             
                break;
    case 2: break;   
    default:   System.out.println("Введено неправильное число, попробуйте снова!");     
               break;
        }
            
           FW.close();
           FW2.close();
           scan.close();
           BR.close(); // закрываем поток
           BW.close(); // закрываем поток
           fr.close();
           ISR.close();
           // file.delete();
            // file2.delete();
           if(file2.delete()) {
                    System.out.println("Фaйл file2 yдaлeн");} 
                else { System.out.println("Фaйл file2 yдaлить нe пoлyчилocь");}
                if(file.delete()) {
                    System.out.println("Фaйл file yдaлeн");} 
                else { System.out.println("Фaйл file yдaлить нe пoлyчилocь");}

    }
}

