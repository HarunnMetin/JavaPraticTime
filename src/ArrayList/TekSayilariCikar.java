package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TekSayilariCikar {

    public static void main(String[] args) {

        /*
        Kullanıcıdan alınan bir tamsayı listesindeki tek sayıları çıkaran
        ve geri kalan elemanları yeni bir listede saklayan bir Java programı
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıları aralarında boşluk bırakarak girin: ");
        String input = scanner.nextLine();


        String[] sayilarString = input.split(" ");

        ArrayList<Integer> ciftSayilar = new ArrayList<>();

        for (String sayiString : sayilarString) {
            int sayi = Integer.parseInt(sayiString);
            if (sayi % 2 == 0) {
                ciftSayilar.add(sayi);
            }
        }
        System.out.println("Girilen sayılardan çift olanlar: " + ciftSayilar);
    }
}
