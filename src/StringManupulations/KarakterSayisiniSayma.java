package StringManupulations;

import java.util.Scanner;

public class KarakterSayisiniSayma {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir metin alan ve bu metindeki harf sayısını,
        rakam sayısını ve diğer karakter sayısını bulan bir Java programı yazın.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        karakterSayisiSayma(metin);

    }

    public static void karakterSayisiSayma (String metin){

        int harfSayisi = 0;
        int rakamSayisi = 0;
        int digerKarakterSayisi = 0;

        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);

            if (Character.isLetter(karakter)) {
                harfSayisi++;
            } else if (Character.isDigit(karakter)) {
                rakamSayisi++;
            } else {
                digerKarakterSayisi++;
            }
        }
        System.out.println("Harf sayısı: " + harfSayisi);
        System.out.println("Rakam sayısı: " + rakamSayisi);
        System.out.println("Diğer karakter sayısı: " + digerKarakterSayisi);

    }
}
