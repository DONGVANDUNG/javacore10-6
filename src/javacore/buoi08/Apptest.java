package javacore.buoi08;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Apptest {
    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        Scanner sc = new Scanner(System.in);
    while (studentManagement!=null) {
            System.out.println("Nhập vào command bạn muốn thực hiện (1: Thêm " +
                    "mới sinh viên, 2: Tìm kiếm sinh viên theo " +
                    "tên, 3: In ra danh sách sinh viên đỗ " +
                    "(GPA >= 1.5), 4: In ra danh sách các sinh viên)");
        System.out.print("\t\t-Nhap vao so ma ban lua chon: ");
            int n = sc.nextInt();
            if (n == 1) {
                studentManagement.addStudent();
            } else if (n == 2) {
               studentManagement.getStudentByName();
            } else if (n == 3) {
                System.out.println("Nhung sinh vien do la: ");
              studentManagement.getPassedStudentList();
            } else if (n == 4) {
               studentManagement.ShowInfor();
            }
        }
    }
}