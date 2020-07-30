package javacore.buoi08;

import java.util.Scanner;

public class Ailatrieuphu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-Moi ban den voi gameshow ai thong minh hon hoc sinh lop 5!!!");
        System.out.println("-Ban se phai trai qua cac cau hoi rat kho!!!");
        System.out.println("\t+Cau hoi thu nhat: 1 + 1 = ?");
        System.out.print("-Moi ban nhap cau tra loi: ");
        int n = sc.nextInt();
        if (n == 2) {
            System.out.println("\t\tChinh xac!!!");
            System.out.println("\t\tChuc mung ban da vuot qua cau hoi thu nhat!!!");
            System.out.println("-Moi ban den voi cau hoi thu hai");
        } else {
            System.out.println("\t\tThat tiec ban da tra loi sai!!!");
            System.out.println("\t\t\tBan qua ngu!!!");
        }
        System.out.println("\t+1 cau vong co 7 mau hoi 7 cau vong co bao nhieu mau?");
        System.out.print("-Moi ban nhap cau tra loi: ");
        int a = sc.nextInt();
        if (a == 7) {
            System.out.println("\t\t+Chuc mung ban da tra loi dung!!Ban qua thong minh!!!");

            System.out.println("\t\t+Chuc ban binh tinh vuot qua cau hoi!!!");
        } else {
            System.out.println("\t\tBan tra loi sai roi!!Ban qua ngu!!");
            System.out.println("\t\tCuoc choi cua ban ket thuc o day!!");
        }
        System.out.println("-Moi ban den voi cau hoi cuoi cung!!!");
        sc.nextLine();
        System.out.println("\t+Benh gi ma bac si bo tay?");
        System.out.print("-Moi ban nhap cau tra loi: ");
        String answer = sc.nextLine();
        if (answer.equalsIgnoreCase("gay tay")) {
            System.out.println("\t\t+Xin chuc mung ban!!!");
            System.out.println("\t\t+Ban da chien thang gameshow!!!");
            System.out.println("\t\t+Moi ban nhan 2 nghin dong tien thuong!!!");
        } else {
            System.out.println("\t\t\t+O tiec qua ban tra loi sai roi!!");
            System.out.println("\t\t\t+Moi ban cut ve ngay");
        }
    }
}
