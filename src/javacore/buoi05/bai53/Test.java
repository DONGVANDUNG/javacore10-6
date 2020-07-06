package javacore.buoi05.bai53;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong tu: ");
        int n=sc.nextInt();
        sc.nextLine();
        Word[] words = new Word[n];
        for (int i = 0; i <n ; i++) {
            System.out.println("Nhap ANH-VIET/VIET-ANH");
            String type=sc.nextLine();
            System.out.println("Nhap thong tin cho tu thu "+(i+1));
            System.out.println("Tu do la: ");
            String key=sc.nextLine();
            System.out.println("Nghia cua tu: ");
            String value=sc.nextLine();
            words[i]=new Word(type,key,value);
        }
        System.out.println("Nhap vao tu ban muon tra cuu: ");
        String key=sc.nextLine();
        System.out.println("Tu"+key+"thuoc loai tu dien nao: ");
        String type=sc.nextLine();
        Dictionary dictionary = new Dictionary();
        dictionary.Search(key,type);
        System.out.println("So tu thuoc tu dien ANH VIET la: "+dictionary.countAV());
        System.out.println("So tu thuoc tu dien VIET ANH la: "+dictionary.countVA());
    }
    }