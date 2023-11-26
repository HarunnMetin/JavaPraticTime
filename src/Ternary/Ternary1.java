package Ternary;

import java.util.Scanner;

public class Ternary1 {

    public static void main(String[] args) {

        /*
        kullanicidan bir sayi girisi alin. Bu sayi pozitif mi yoksa negatif mi? Ternary ifadesini
        kullanarak sonucu ekran yazdirin.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir sayigiriniz");
        int sayi = scanner.nextInt();

        String sonuc = sayi > 0 ? "SAYİ POZİTİF" : "SAYİ NEGATİF";
        System.out.println(sonuc);

    }
}
