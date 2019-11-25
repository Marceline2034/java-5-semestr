
import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("Привет!");
        System.out.println("Введите 1, если хотите зашифровать текст методом сдвига коэффициента");
        System.out.println("Введите 2, если хотите зашифровать текст побитовым шифрованием");
        System.out.println("Введите 3, если хотите завершить программу");      
        int k = in.nextInt();  
           
    switch (k) {
    case 1:   System.out.println("Введите 1, если хотите создать рандомный текст");
              System.out.println("Введите 2, если хотите зашифровать свой текст");;
              int i = in.nextInt();  
              switch (i){
                 case 1: Metzam metrandom = new Metzam();
                         metrandom.func(); break;
                 case 2: MetzamPrimer met = new MetzamPrimer();
                         met.funct(); break;
                 default:  System.out.println("Введено неправильное число, попробуйте снова!");
                 }  
             break;
    case 2:  MetBit metbit = new MetBit();
             metbit.functi(); 
             break;   
    case 3: System.out.println("До свидания!");     
             break;
    default: System.out.println("Введено неправильное число, попробуйте снова!");     
             break;
        }
            
}
}// разработать 1 пункт там не работает после 10 