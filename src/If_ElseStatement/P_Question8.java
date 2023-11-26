package If_ElseStatement;

import java.util.Scanner;

public class P_Question8 {


    public static void main(String[] args) {

        /*
        Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        zayif yazdiri
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Boyunuzu cm Olarak Giriniz");
        double boy = scanner.nextDouble();
        System.out.println("Lutfen kilonuzu cm Olarak Giriniz");
        double kilo = scanner.nextDouble();
        double vucutKitleEndexsi = kilo*10000 / (boy *boy);

        if (vucutKitleEndexsi>=30){
            System.out.println("Obez");
        } else if (vucutKitleEndexsi>=25 && vucutKitleEndexsi <30) {
            System.out.println("Kilolu");
        }else if (vucutKitleEndexsi>=20&&vucutKitleEndexsi<25){
            System.out.println("Normal");
        }else if (vucutKitleEndexsi<20){
            System.out.println("Zayif");
        }
    }
}
