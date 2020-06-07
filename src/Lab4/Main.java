package Lab4;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Stud s = new Stud();
        int i = 0;
        Scanner scan = new Scanner(System.in);
        while (i != 10) {
            try {
                System.out.println();
                System.out.println("============MENU============");
                System.out.println("Выберите действие");
                System.out.println("1 - Принять студента и назначить ему экзамен");
                System.out.println("2 - Показать всех студентов и экзамены");
                System.out.println("3 - Отчислить всех студентов");
                System.out.println("4 - Добавить аттестацию");
                System.out.println("5 - Показать все аттестации");
                System.out.println("6 - Удалить все аттестации");
                System.out.println("7 - Добавить зачёт");
                System.out.println("8 - Показать все зачёты");
                System.out.println("9 - Удалить все зачёты");
                System.out.println("10 - Выход из программы");
                System.out.println("============MENU============");
                System.out.println();
                i = scan.nextInt();
                switch (i) {
                    case 1:
                        s.add(1);
                        break;
                    case 2:
                        s.info(1);
                        break;
                    case 3:
                        s.clear(1);
                        break;
                    case 4:
                        s.add(2);
                        break;
                    case 5:
                        s.info(2);
                        break;
                    case 6:
                        s.clear(2);
                        break;
                    case 7:
                        s.add(3);
                        break;
                    case 8:
                        s.info(3);
                        break;
                    case 9:
                        s.clear(3);
                        break;
                    case 10:
                        System.out.println("Программа завершена");
                        break;
                    default:
                        System.out.println("Данного пункта не существует!!!");
                        break;
                }
            } catch (Exception ex) {
                System.out.println("Данного пункта не существует!!!");
                scan.next();
            }
        }

    }
}
