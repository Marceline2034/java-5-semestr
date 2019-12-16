
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class KontrolLab {

    public static void main(String[] args) throws IOException {
        //���������� � test.txt � text - arraylist
        BufferedReader BuffRead = null;
        BuffRead = new BufferedReader(new FileReader(new File("C:/Users/asus/Documents/NetBeansProjects/KontrolLab/src/com/company/test.doc")));
        ArrayList<String> text = new ArrayList<>();
        String stroka = null;
        do {
            stroka = BuffRead.readLine();
            if (stroka != null) {
                text.add(stroka); //��������, ����� �� ��������� ��������� ������� ������ � text
            }
        } while (stroka != null);
        BuffRead.close();

        Scanner in = new Scanner(System.in);
        System.out.println("����� ��� ����� (���): ");
        long TimeCounter = (in.nextInt()) * 60 * 1000; //������� �� ����� � �����������
        int usercon = 0; //user configuration
        while (usercon != 3) { //������� ������
            System.out.println("����");
            System.out.println("[1] - ������ ����");
            System.out.println("[2] - �������� ����� �����");
            System.out.println("[3] - ����� �� �����");
            usercon = in.nextInt();
            switch (usercon) {
                case (1):
                    String date; //����, ������� �� ����� � � ����
                    String name; //���, ������� �� ����� � � ����
                    String lastname; //�������, ������� �� ����� � � ����
                    int TrueAnswer = 0; //���������� ������ �������, ������� �� ����� � � ����
                    System.out.print("������� ���� ���: ");
                    name = in.next();
                    System.out.print("������� ���� �������: ");
                    lastname = in.next();
                    System.out.print("������� ����������� ����: ");
                    date = in.next();
                    System.out.println("���� �������. ������� ����� �� 1 �� 4 ����� ������� �����.");
                    System.out.println("�����, ���������� ��� �����: " + TimeCounter / 60000 + " �����. ����� ����� ����� �� ����� �������!");
                    long timestart = System.currentTimeMillis(); //�������� ����� � ������� UNIX-�������
                    long timestop = 0; //�����, ������� ��������� �� ���������� ����� �����
                    int answer; //����� ������
                    // for (int i = 0; i < text.size(); i = i + 6) {
                    for (int i = 0; i < 10; i = i + 6) {
                        System.out.println(text.get(i)); //��������� ������
                        System.out.println("[1]: " + text.get(i + 1)); //1 ������� ������
                        System.out.println("[2]: " + text.get(i + 2)); //2 ������� ������
                        System.out.println("[3]: " + text.get(i + 3)); //3 ������� ������
                        System.out.println("[4]: " + text.get(i + 4)); //4 ������� ������
                        answer = in.nextInt();
                        while ((answer < 1) || (answer > 4)) { //�������� �� ����
                            System.out.println("Incorrect entry! Enter num from 1 to 4!");
                            answer = in.nextInt();
                        }
                        if (text.get(i + 5).equals(text.get(i + answer))) { //��������, ���� ��������� ������� ������ ����� ������� (5 ����� � ��������� �����)
                            TrueAnswer++; //+1 � ������ �������
                        }
                        if ((System.currentTimeMillis() - timestart) >= TimeCounter) { //��������, ����� �� �����?
                            timestop = TimeCounter;
                            break;
                        }
                    }
                    if (timestop != TimeCounter) {
                        timestop = System.currentTimeMillis() - timestart; //����� � �������������, ����������� �� ����
                    }
                    timestop = timestop / 1000; //������� ������������ ������� � �������
                    double timemin = timestop / 60; //������� ������� � ������ c ������� �����, ������� �� ����� � � ����
                    int grade = 0; //������, ��������� �� ����� � � ����
                    //������� ����������
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
                    //����� ���������� �� �����
                    System.out.println("���� ��������!");
                    System.out.println("����: " + date);
                    System.out.println("�.�.�. : " + name + " " + lastname);
                    System.out.println("����������� �����: " + timemin + " �����");
                    System.out.println("���������� ������ �������: " + TrueAnswer);
                    System.out.println("���� ������: " + grade);

                    //����� ���������� � ����
                    FileWriter fin = new FileWriter("C:/Users/asus/Documents/NetBeansProjects/KontrolLab/src/com/company/testpassed.doc", true);
                    fin.write("Date: " + date + "\t" + "Name: " + name + " " + lastname + "\t" + "Time: " + timemin + "\t" + "Right answer: " + TrueAnswer + "\t" + "Grade: " + grade + "\n");
                    fin.flush();
                    fin.close();               
                    break;
                case (2): //�������� ����� �����
                    System.out.println("������� ����� �����!");
                    TimeCounter = (in.nextInt()) * 60 * 1000;
                    break;
                case (3): //�����
                    break;
                default:
                    System.out.println("������ �������� � ���� ���! ������� ����� �� 1 �� 3");
                    break;
            }
        }

    }
}
