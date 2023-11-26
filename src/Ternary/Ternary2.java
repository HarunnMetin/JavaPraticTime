package Ternary;

import java.util.Scanner;

public class Ternary2 {

    public static void main(String[] args) {

        /*
        kullanicidan uc sayi girisi alin ve bu uc sayinin en buyugunu ternary ifadesi kullanarak bulup ekrana
        yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 Sayi Giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = scanner.nextInt();

        int enBuyuk = sayi1 > sayi2 ? sayi1 > sayi3 ? sayi1 : sayi3 : sayi2 > sayi3 ?  sayi2 :sayi3;
        System.out.println("En buyuk sayi : " +enBuyuk);
    }
}