package Ternary;

import java.util.Scanner;

public class Ternary4 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir karakter girisi alin. Bkarakter bir harf mi yoksa rakam mı? Ternary ifadesi kullanarak
        sonucu ekrana yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter girin");
        char karakter = scanner.next().charAt(0);

        String sonuc = Character.isDigit(karakter) ? "RAKAM": Character.isLetter(karakter) ? "HARF" : "TANIMLI DEGIL";
        System.out.println(sonuc);
    }
}
