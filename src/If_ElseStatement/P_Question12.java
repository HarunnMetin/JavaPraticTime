package If_ElseStatement;

import java.util.Scanner;

public class P_Question12 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir ucgenin uc kenar uzunlugunu alin. Bu uckenin bir ucgen olusturup olusturmadigini
        kontrol edin eger olusturuyorsa ucgenin turunu (eskenar,ikizkenar,cesitkenar) belirleyin ve
        sonucu ekrana yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 1. kenarini giriniz");
        double kenar1 = scanner.nextDouble();
        System.out.println("Lutfen ucgenin 2. kenarini giriniz");
        double kenar2 = scanner.nextDouble();
        System.out.println("Lutfen ucgenin 3. kenarini giriniz");
        double kenar3 = scanner.nextDouble();

        if (kenar1==kenar2 && kenar1==kenar3){
            System.out.println("Eskenar Ucgen");
        }
        else if (kenar1 == kenar2 || kenar2==kenar3 || kenar3==kenar1){
            System.out.println("İkizkenar Ucgen");
        }
        else {
            System.out.println("Cesitkenar Ucgen");
        }



    }
}
