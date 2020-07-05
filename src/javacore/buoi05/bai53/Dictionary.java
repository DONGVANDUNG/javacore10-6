package javacore.buoi05.bai53;

import java.util.Scanner;

public class Dictionary {
    private Word[] words;
    Scanner sc = new Scanner(System.in);
    public Dictionary(int n) {
        System.out.println("Nhap vao danh sach tu dien: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Tu thuoc loai tu dien nao: ");
            String type = sc.nextLine();
            if (type.equalsIgnoreCase("VA")) {
                System.out.println("Moi ban nhap thong tin cho tu dien VIET-ANH: ");
                System.out.println("Nhap vao tu: ");
                String key = sc.nextLine();
                System.out.println("Nghia cua tu: ");
                String value = sc.nextLine();
                sc.nextLine();
                words[i] = new Word(key, value, type);
            } else if (type.equalsIgnoreCase("AV")) {
                System.out.println("Moi ban nhap thong tin cho tu dien ANH-VIET: ");
                System.out.println("Nhap vao tu :");
                String key = sc.nextLine();
                System.out.println("Nghia cua tu: ");
                String value = sc.nextLine();
                sc.nextLine();
                words[i] = new Word(key, value, type);
            }
        }
        sc.close();
    }
    public Word Search(int n){
        System.out.println("Nhap vao tu ma ban muon tra cuu: ");
        String word=sc.nextLine();
        for (int i = 1; i <n ; i++) {
            if(word.equalsIgnoreCase(words[i].getType())){
                if(word.equalsIgnoreCase(words[i].getKey())){

                }
            }
        }
    }
}