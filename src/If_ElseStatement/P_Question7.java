package If_ElseStatement;

import java.util.Scanner;

public class P_Question7 {

    public static void main(String[] args) {

        /*
        kullanicidan bir tam sayi isgteyin
        - sayi 3'e boluyorsa 3'un kati
        - sayi 5'e bolunuyorsa 5'in kati
        - ikisine birden bolunuyorsa "Super Sayi" yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi%5==0&&sayi%3==0){
            System.out.println("Super Sayi");
        } else if (sayi%3==0) {
            System.out.println("Sayi 3'un Kati");
        } else if (sayi%5==0) {
            System.out.println("Sayi 5'in Kati");
        }else {
            System.out.println("Sayi Hiçbir sayinin kati degil");
        }
    }
}
