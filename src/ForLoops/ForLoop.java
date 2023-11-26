package ForLoops;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir pozitif tam sayı girmesini isteyen bir Java programı yazın.
        Ardından, bu sayının rakamları toplamını hesaplayan bir for döngüsü kullanarak
        bu programı oluşturun.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir pozitif tam sayi giriniz");
        int sayi = scanner.nextInt();

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int basamakSayisi = (sayi+"").length();

        for (int i = 0; i <=sayi ; i++) {
            birlerBasamagi = sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;

        }
        System.out.println(rakamlarToplami);


    }
}
