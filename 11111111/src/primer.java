import java.util.Scanner;
public class primer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr;
        System.out.println("Введите размер массива");
        int size = in.nextInt(); // размер массива
        arr = new int[size]; // выделяем память массиву

        try {
            for (int i = 0; i < size; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива: ");
            arr[i] = in.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    throw new MyExeption();
                }
            }
        }
        }
            catch (MyExeption h) {
            System.out.println("найдено исключение!");
        }
    }
 static class MyExeption extends Exception {  //добавила везде статики, потому что иначе не работает
        MyExeption() {
           System.out.println("2 одинаковых числа ");
        }
    }
}
