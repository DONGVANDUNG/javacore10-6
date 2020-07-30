package javacore.buoi08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        List<String> student = new ArrayList<>();
        HashSet<String> student2 = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("Nhap hoc sinh thu " + i + ":");
            String name = sc.nextLine();
            student.add(name);
            student2.add(name);
        }
        System.out.println(student);
        System.out.println(student2);
    }
}