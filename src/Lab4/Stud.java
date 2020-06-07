package Lab4;

import java.util.ArrayList;
import java.util.Scanner;

class Stud 
{
    private ArrayList<Offset> o = new ArrayList<Offset>();
    private ArrayList<StudentExam> Se = new ArrayList<StudentExam>();
    private ArrayList<Certificate> Ce = new ArrayList<Certificate>();
    private int i = 0;
    private Scanner scan = new Scanner(System.in);

    public void add(int clas) {
        if (clas == 1) {
            Se.add(new StudentExam());
        }
        if (clas == 2) {
            Ce.add(new Certificate());
        }
        if (clas == 3) {
            o.add(new Offset());
        }
    }

    public void clear(int clas) {
        if (clas == 1) {
            Se.clear();
            System.out.println("������!");
        }
        if (clas == 2) {
            Ce.clear();
            System.out.println("������!");
        }
        if (clas == 3) {
            o.clear();
            System.out.println("������!");
        }
    }

    public void info(int clas) {
        if (clas == 1) {
            int m = StudentExam.i;
            System.out.println("���������� ��������� :" + m);
            System.out.println("�������� � ��������");
            for (StudentExam stex : Se) {
                stex.Info();
            }
        }
        if (clas == 2) {
            int k = Certificate.i;
            System.out.println("���������� ���������� " + k);
            System.out.println("����������");
            for (Certificate ce : Ce) {
                ce.Info();
            }
        }
        if (clas == 3) {
            int f = Offset.i;
            System.out.println("���������� ������� " + f);
            System.out.println("������");
            for (Offset off : o) {
                off.Info();
            }
        }
    }
}

