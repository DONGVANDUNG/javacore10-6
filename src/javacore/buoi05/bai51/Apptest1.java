package javacore.buoi05.bai51;

import java.util.Scanner;

public class Apptest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the width of Rectangle: ");
        float width = sc.nextFloat();
        System.out.print("Input the height of Rectangle: ");
        float height = sc.nextFloat();
        Rectangle rectangle = new Rectangle(width, height);
        rectangle.toString();
        System.out.println("Chu vi hinh chu nhat la: " + rectangle.getchuvi());
        System.out.println("Dien tich hinh chu nhat la: " + rectangle.getdientich());
        System.out.println(rectangle.check() ? "Day la hinh vuong!!!" : "Day khong phai la hinh vuong nhe!!!");
    }
}
