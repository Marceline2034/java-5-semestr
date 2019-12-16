
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class KontrolLab {

    public static void main(String[] args) throws IOException {
        //считывание с test.txt в text - arraylist
        BufferedReader BuffRead = null;
        BuffRead = new BufferedReader(new FileReader(new File("C:/Users/asus/Documents/NetBeansProjects/KontrolLab/src/com/company/test.doc")));
        ArrayList<String> text = new ArrayList<>();
        String stroka = null;
        do {
            stroka = BuffRead.readLine();
            if (stroka != null) {
                text.add(stroka); //проверка, чтобы не считывать последнюю нулевую строку в text
            }
        } while (stroka != null);
        BuffRead.close();

        Scanner in = new Scanner(System.in);
        System.out.println("Время для теста (мин): ");
        long TimeCounter = (in.nextInt()) * 60 * 1000; //перевод из минут в милисекунду
        int usercon = 0; //user configuration
        while (usercon != 3) { //условие выхода
            System.out.println("тест");
            System.out.println("[1] - начать тест");
            System.out.println("[2] - изменить время теста");
            System.out.println("[3] - выход из теста");
            usercon = in.nextInt();
            switch (usercon) {
                case (1):
                    String date; //дата, вывести на экран и в файл
                    String name; //имя, вывести на экран и в файл
                    String lastname; //фамилия, вывести на экран и в файл
                    int TrueAnswer = 0; //количество верных ответов, вывести на экран и в файл
                    System.out.print("Введите свое имя: ");
                    name = in.next();
                    System.out.print("Введите свою фамилию: ");
                    lastname = in.next();
                    System.out.print("Введите сегодняшнюю дату: ");
                    date = in.next();
                    System.out.println("Тест начался. Введите число от 1 до 4 чтобы выбрать ответ.");
                    System.out.println("Время, отведенное для теста: " + TimeCounter / 60000 + " минут. Пусть удача будет на вашей стороне!");
                    long timestart = System.currentTimeMillis(); //заслекли время с помощью UNIX-времени
                    long timestop = 0; //время, которое потрачено за выполнение всего теста
                    int answer; //выбор ответа
                    // for (int i = 0; i < text.size(); i = i + 6) {
                    for (int i = 0; i < 10; i = i + 6) {
                        System.out.println(text.get(i)); //выводится вопрос
                        System.out.println("[1]: " + text.get(i + 1)); //1 вариант ответа
                        System.out.println("[2]: " + text.get(i + 2)); //2 вариант ответа
                        System.out.println("[3]: " + text.get(i + 3)); //3 вариант ответа
                        System.out.println("[4]: " + text.get(i + 4)); //4 вариант ответа
                        answer = in.nextInt();
                        while ((answer < 1) || (answer > 4)) { //проверка на ввод
                            System.out.println("Incorrect entry! Enter num from 1 to 4!");
                            answer = in.nextInt();
                        }
                        if (text.get(i + 5).equals(text.get(i + answer))) { //проверка, если выбранный вариант ответа равен верному (5 пункт в текстовом файле)
                            TrueAnswer++; //+1 к верным ответам
                        }
                        if ((System.currentTimeMillis() - timestart) >= TimeCounter) { //проверка, вышло ли время?
                            timestop = TimeCounter;
                            break;
                        }
                    }
                    if (timestop != TimeCounter) {
                        timestop = System.currentTimeMillis() - timestart; //время в миллисекундах, потраченное на тест
                    }
                    timestop = timestop / 1000; //перевод затраченного времени в секунды
                    double timemin = timestop / 60; //перевод времени в минуты c дробным целым, вывести на экран и в файл
                    int grade = 0; //оценка, выводится на экран и в файл
                    //система оценивания
                    if (TrueAnswer < 5) {
                        grade = 2;
                    }
                    if ((TrueAnswer >= 5) && (TrueAnswer < 10)) {
                        grade = 3;
                    }
                    if ((TrueAnswer >= 10) && (TrueAnswer < 15)) {
                        grade = 4;
                    }
                    if ((TrueAnswer >= 15) && (TrueAnswer <= 20)) {
                        grade = 5;
                    }
                    //вывод информации на экран
                    System.out.println("Тест завершен!");
                    System.out.println("Дата: " + date);
                    System.out.println("Ф.И.О. : " + name + " " + lastname);
                    System.out.println("Затраченное время: " + timemin + " минут");
                    System.out.println("Количество верных ответов: " + TrueAnswer);
                    System.out.println("Ваша оценка: " + grade);

                    //вывод информации в файл
                    FileWriter fin = new FileWriter("C:/Users/asus/Documents/NetBeansProjects/KontrolLab/src/com/company/testpassed.doc", true);
                    fin.write("Date: " + date + "\t" + "Name: " + name + " " + lastname + "\t" + "Time: " + timemin + "\t" + "Right answer: " + TrueAnswer + "\t" + "Grade: " + grade + "\n");
                    fin.flush();
                    fin.close();               
                    break;
                case (2): //изменить время теста
                    System.out.println("задайте новое время!");
                    TimeCounter = (in.nextInt()) * 60 * 1000;
                    break;
                case (3): //выход
                    break;
                default:
                    System.out.println("Такого варианта в меню нет! Введите число от 1 до 3");
                    break;
            }
        }

    }
}
