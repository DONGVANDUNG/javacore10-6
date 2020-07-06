package javacore.buoi05.bai52;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Apptest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so sinh vien ma ban muon quan li: ");
        int n = sc.nextInt();
        StudentManagement studentManagement = new StudentManagement(n);
        System.out.println("Tong so sinh vien do la: " + studentManagement.countstudent(true));
        System.out.println("Tong so sinh vien truot la: " + studentManagement.countstudent(false));
        System.out.println("Sinh vien co diem cao nhat la: -" + studentManagement.findbestStudent());
        System.out.println("Sinh vien co diem thap nhat la: -" + studentManagement.findworstStudent());
        System.out.println("_________________________________");
    }
}
