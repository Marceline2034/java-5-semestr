//В методе enterArray заполняется символьный массив, что может привести к исключению 
//(выходу за границы массива), которое обра-батывается в методе main.

// Задаем размер массива. Если он меньше 6, то проиисходит ошибка - выход за границы массива, 
// потому что мы уже вручную задали информацию 6 элементам перед обьявлением размера. 


import java.util.Scanner;

public class Lab32 {

    public void enterArray() {                      //метод заполнения массива
        Scanner in = new Scanner(System.in);
        System.out.println("Количество элементов массива: ");
        int N = in.nextInt();              //количество элементов
        String[] word = new String[N];     // массив будущих символов

        word[0] = "b";
        word[1] = "a";
        word[2] = "r";
        word[3] = "s";
        word[4] = "i";
        word[5] = "k";
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);        // параметр ввода с клавиатуры
        Lab32 barsik = new Lab32();
        boolean Q=true;  //счетчик. Пока будет находиться исключение, код будет выполняться
        while (Q){
        try {
            barsik.enterArray();
            System.out.println("Массив успешно создан!");
            Q=false;
        } catch (ArrayIndexOutOfBoundsException bound) {
            System.out.println("Выход за границы массива! Попробуйте снова!");
            Q=true;

        }
        }
    }
}
