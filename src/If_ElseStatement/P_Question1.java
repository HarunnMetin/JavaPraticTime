package If_ElseStatement;

import java.util.Scanner;

public class P_Question1 {

    public static void main(String[] args) {

        /*
        Kullanicidan iki sayi isteyin ve bu sayılardan hangisi buyuk ya da kucuk ise bunu yazdırın
        eger esitse de sayilar esittir diye yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen İlk Sayiyi Giriniz");
        int sayi1 = scanner.nextInt();
        System.out.println("Lütfen İkinci Sayiyi Giriniz");
        int sayi2 = scanner.nextInt();

        if (sayi1>sayi2) System.out.println("İlk Sayi İkinci Sayidan Buyuk");
        if (sayi1<sayi2) System.out.println("İkinci Sayi İlk Sayidan Buyuk");
        if (sayi1==sayi2) System.out.println("İlk Sayi İkinci Sayiya Esit");
    }
}
