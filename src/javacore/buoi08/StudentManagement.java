package javacore.buoi08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagement {
    private List<Student> students;
    Scanner sc = new Scanner(System.in);
    public StudentManagement() {
        System.out.print("-Nhap vao so sinh vien ma ban muon quan li: ");
        int n = sc.nextInt();
        students=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("\t-Moi ban nhap thong tin cho sinh vien thu "+(i+1)+": ");
            System.out.print("\t\t+Nhap vao ten sinh vien : ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("\t\t+Gpa cua sinh vien thu:  ");
            float gpa = sc.nextFloat();
            Student student1 = new Student(name, gpa);
            students.add(student1);
        }
    }

    public StudentManagement(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getPassedStudentList() {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).CheckisPass()) {
                System.out.println(students.get(i).toString());
            }
        }
        return students;
    }

    public List<Student> getStudentByName() {
        sc.nextLine();
        System.out.print("\t+Nhap vao ten sinh vien ban muon tim kiem: ");
        String name=sc.nextLine();
        Student s=null;
        for (int i = 0; i <students.size(); i++) {
            if (name.equalsIgnoreCase(students.get(i).getName())) {
                System.out.println(students.get(i).toString());
                s=students.get(i);
            }
        }
        if(s==null){
            System.out.println("Khong tim thay sinh vien nao!!!");
        }
        return students;
    }

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t-Moi ban them moi sinh vien vao trong danh sach ");
        System.out.print("\t\t+Ten sinh vien la: ");
        String name = sc.nextLine();
        System.out.print("\t\t+Diem gpa cua sinh vien: ");
        float gpa = sc.nextFloat();
        Student n = new Student(name, gpa);
        students.add(n);
    }
    public void ShowInfor(){
        for (int i = 0; i <students.size() ; i++) {
            System.out.println("Sinh vien thu "+(i+1)+":"+students.get(i).toString());
        }
    }
}