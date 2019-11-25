import java.util.Scanner;
public class Lab33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива:  ");
        int size = in.nextInt();
        boolean Q=true;  //счетчик. Пока будет находиться исключение, код будет выполняться
        while (Q){
        try {
            Massiv(size);
            Q=false; //если исключения не будет, выходим из цикла
        } catch (MyExeption h) {
            System.out.print("два одинаковых числа в массиве! ");
            System.out.println("Введите данные снова!");
            Q=true;
        }
        
    }
    }
    
    static class MyExeption extends Exception {
        MyExeption() {
            System.out.println("Ошибка!");
        }
    }
    
     public static void Massiv(int size) throws MyExeption {
        Scanner in = new Scanner(System.in);
        int[] arr;
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива:  ");
            arr[i] = in.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    throw new MyExeption();
                }
            }
        }
     }

}
