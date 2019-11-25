
import java.io.IOException;
import java.util.Scanner;

public class Practica4123 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in); 
        System.out.println("Привет!");
        System.out.println("Введите 1, если хотите записать строку в файл");
        System.out.println("Введите 2, если хотите прочитать данные из файла");
        System.out.println("Введите 3, если хотите заполнить файл словами, и считав затем с него данные, вписать в другой файл строки, содержащие символ 'a' "); 
        System.out.println("Введите 4, если хотите выйти");
        int k = in.nextInt();  
           
    switch (k) {
    case 1:   class41 ZapisVFail = new class41();
                        ZapisVFail.zapis(); 
                         break;
    case 2:  class42 ChtenieIsFaila = new class42();
             ChtenieIsFaila.chtenie(); 
             break;   
    case 3: class43 deletea = new class43();
             deletea.DeleteA(); 
             break;  
    case 4: System.out.println("Пока!");  break; 
    default: System.out.println("Введено неправильное число, попробуйте снова!");     
             break;
        }
            
}
}