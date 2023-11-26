package If_ElseStatement;

import java.util.Scanner;

public class P_Question9 {

    public static void main(String[] args) {

        /*
        Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Cinsiyetinizi Giriniz");
        char cinsiyet = scanner.next().charAt(0);
        System.out.println("Lutfen Yasinizi Giriniz");
        int yas = scanner .nextInt();

        if (cinsiyet =='k'&& yas>=60){
            System.out.println("Kadin emekli olabilir");
        }
        else if (cinsiyet =='k'&& yas<60){
            System.out.println("Kadin emekli olamaz " + (60-yas) +" yil daha calismasi gerek");
        }
        if (cinsiyet == 'e' && yas >= 65){
            System.out.println("Erkek emekli olabilir");
        }
        else if (cinsiyet == 'e' && yas < 65){
            System.out.println("Erkek emekli olamaz "+ (65-yas) +" yil daha calismasi gerek");
        }
    }
}
