package If_ElseStatement;

import java.util.Scanner;

public class P_Question4 {

    public static void main(String[] args) {

        /*
        kullanicidan iki sayi girisi alin. Bu sayilar arasinda buyuk olani ekrana yazdirin,
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Birinci Sayiyi Giriniz");
        int ilkSayi =scanner.nextInt();
        System.out.println("Lutfen İkinci Sayiyi Giriniz");
        int ikinciSayi = scanner.nextInt();

        if (ilkSayi>ikinciSayi) System.out.println("İlk Sayi İkinci Sayidan Daha Buyuktur");
        if (ikinciSayi>ilkSayi) System.out.println("İkinci Sayi İlk Sayidan Daha Buyktur");
    }

}
