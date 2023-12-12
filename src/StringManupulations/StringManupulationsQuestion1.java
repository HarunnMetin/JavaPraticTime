package StringManupulations;

import java.util.Arrays;
import java.util.Scanner;

public class StringManupulationsQuestion1 {

    public static void main(String[] args) {

        /*
        Kullanıcıdan alınan bir cümledeki kelimelerin sırasını ters çeviren bir Java programı yazın.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scanner.nextLine();

        metniTerseCevirme(cumle);
    }
    public static void metniTerseCevirme(String metin){

        String[] metin2 = metin.split(" ");
        for (int i = metin2.length-1; i >= 0 ; i--) {

            System.out.print(metin2[i] + " ");
        }

    }
}
