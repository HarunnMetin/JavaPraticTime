package SwitchCase;

import java.util.Scanner;

public class SwitchCase2 {

    public static void main(String[] args) {


        /*
        kullanicidan bir ay numarasi alin ve bu ayda hangi mevsim yasandigini yazdiran bir java progami yazin
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ay numarasını girin (1-12): ");
        int ayNO = scanner.nextInt();

        String mevsim;

        switch (ayNO) {
            case 12:
            case 1:
            case 2:
                mevsim = "Kış";
                break;
            case 3:
            case 4:
            case 5:
                mevsim = "İlkbahar";
                break;
            case 6:
            case 7:
            case 8:
                mevsim = "Yaz";
                break;
            case 9:
            case 10:
            case 11:
                mevsim = "Sonbahar";
                break;
            default:
                mevsim = "Geçersiz ay numarası!";
                break;
        }

        System.out.println("Mevsim: " + mevsim);
    }
}
