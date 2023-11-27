package WhileLoops;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        /*
        kullanicidan bir pozitif sayi alip bu sayiya kadar olan cift sayilari ekrana yazdiran bir java
        programini do-whilw dongusu kullanarak yaziniz.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen pozitif bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int sayi = 1;

        do {

            if (sayi%2==0){
                System.out.println(sayi);

            }
            sayi++;
        }while (sayi<=girilenSayi);
    }
}
