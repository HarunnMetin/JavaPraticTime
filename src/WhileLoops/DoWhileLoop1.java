package WhileLoops;

import java.util.Scanner;

public class DoWhileLoop1 {

    public static void main(String[] args) {
        /*
        kullanicidan baslangic ve bitis sayisi alip ,bu araliktaki sayilari toplayip
        ve sonucu ekrana yazdirin kullanici baslangic sayisini bitis sayisindan buyuk girene kadar bu islemi
        tekrar etsin.(do-while)
         */
        Scanner scanner = new Scanner(System.in);

        int baslangic, bitis;

        do {
            System.out.print("Başlangıç sayısını giriniz: ");
            baslangic = scanner.nextInt();

            System.out.print("Bitiş sayısını giriniz: ");
            bitis = scanner.nextInt();

            if (bitis <= baslangic) {
                System.out.println("Hatalı giriş! Bitiş sayısı başlangıç sayısından büyük olmalı.");
            }

        } while (bitis <= baslangic);


        int toplam = 0;
        int current = baslangic;

        do {
            toplam += current;
            current++;
        } while (current <= bitis);

        System.out.println("Toplam: " + toplam);
    }

}
