package SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yemek seciminizi yapin \n 1-Pizza\n 2-Burger \n 3-Makarna \n 4-Salata \n 5-Tavuk");
        String siparis = scanner.next();

        int fiyat;

        switch (siparis){

            case "Pizza":
                fiyat = 25;
                break;
            case "Burger":
                fiyat = 20;
                break;
            case "Makarna":
                fiyat = 15;
                break;
            case "Salata":
                fiyat = 10;
            case "Tavuk":
                fiyat = 30;
                break;
            default:
                System.out.println("MENUDE OLMYAYN BİR SİPARİS VERDİNİZ");
                return;
        }
        System.out.println(siparis + "siparisinizin icin fiyat "+fiyat+" TL'dir ");

    }
}
