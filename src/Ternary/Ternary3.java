package Ternary;

import java.util.Scanner;

public class Ternary3 {

    public static void main(String[] args) {

        /*
        Kullanicidam iki sayi girisi alin bu iki sayidan kucuk olani, buyuk olani veya esit olduklarini
        bir ternary ifadesi ile kontrol edin vesonucu yazdirin
         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("LUTFEN İKİ SAYİ GİRİNİZ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        String sonuc = sayi1 == sayi2 ? "Sayilar esittir" : sayi1 > sayi2 ? "1.Girilen sayi buyuktur" : "2.Girilen sayi Buyuktur";
        System.out.println(sonuc);
    }
}
