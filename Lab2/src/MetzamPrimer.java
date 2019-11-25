import java.util.Scanner;
//зашифровка заранее введенного текста
public class MetzamPrimer {

    public void funct(){
    Scanner in = new Scanner(System.in);        // параметр ввода с клавиатуры
    System.out.println("Коэффициент сдвига: ");
    int k = in.nextInt(); 
    
   if (k>26){while(k>26){
               k=k-26;
                }}
   if (k==26){k=0;}
   
    System.out.println("коэффициент " + k);
    String str ="abcd"; 
    System.out.println("Введенный текст: " + str);
    char[] massiv = str.toCharArray();  // создаем массив символом из строки
    char sdvig; 
    String newStroka="";
    
    for (int i=0 ; i<str.length() ; i++){                           
        int nomer =(int)massiv[i];  // находим код символа
        int sdv=nomer+k;
        System.out.println("sdv " + sdv);
          if (sdv>=122){
            while(sdv>122){
              sdv=sdv-26;
                }
                }
          System.out.println("sdv2 " + sdv);
        sdvig = (char)(sdv);    // сдвигаем код символа на K позиций
      
              newStroka=newStroka+sdvig;
        }
    
          System.out.println();
 System.out.println("Зашифрованный текст: "+newStroka);
  System.out.println("Расшифрованный текст: "+str);
 
}
}

