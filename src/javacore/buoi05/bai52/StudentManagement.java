package javacore.buoi05.bai52;

import com.sun.corba.se.impl.presentation.rmi.StubFactoryStaticImpl;

import java.util.Scanner;

public class StudentManagement {
    private int n;
    private Student[] students;

    public StudentManagement(int n) {
        this.n = n;
        Scanner sc = new Scanner(System.in);
        students=new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("-Nhap vao thong tin cho sinh vien thu " + (i+1) + ": ");
            System.out.print("\t+Ho va ten: ");
            String name = sc.nextLine();
            System.out.print("\t+Diem gpa: ");
            float gpa = sc.nextFloat();
            students[i] = new Student(name, gpa);
            sc.nextLine();
        }
        sc.close();
    }

    public int countstudent(boolean ispass) {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (ispass == true) {
                if (students[i].check()) {
                    dem += 1;
                }
            }else if (ispass == false) {
                if (!students[i].check()) {
                    dem += 1;
                }
            }
        }
        return dem;
    }
    public Student findbestStudent(){
        Student beststudent=students[1];
        for (int i = 0; i <n ; i++) {
            if(students[i].getGpa()>beststudent.getGpa()){
                students[i]=beststudent;
            }
        }
        return beststudent;
    }
    public Student findworstStudent(){
        Student worststudent=students[1];
        for (int i = 0; i <n ; i++) {
            if(students[i].getGpa()<worststudent.getGpa()){
                students[i]=worststudent;
            }
        }
        return worststudent;
    }
}