import java.util.Scanner;

public class Bai32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao chuoi ma ban muon: ");
        String n=sc.nextLine();
        char a[]=n.toCharArray();
        for (int i = (a.length)/2 ; i <1 ; i--) {
            for (int j = a.length; j <(a.length/2)+1 ; j--) {
                if(a[i]==a[j]){
                    System.out.println("Day la chuoi doi xung!!!!");
            }else {
                    System.out.println("Day khong phai la chuoi doi xung!!!!");
                }
        }
        }
    }
}
