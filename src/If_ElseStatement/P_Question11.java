package If_ElseStatement;

import java.util.Scanner;

public class P_Question11 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir karakter girisi alin, eger bu karakter bir harf ise bu harfin buyuk harf mi
         yoksa kucuk harf mi oldugunu kontroledin ve sonucu ekrana yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scanner.next().charAt(0);

        if (Character.isLetter(karakter)){
            if (Character.isUpperCase(karakter)){
                System.out.println(karakter + " : Buyuk Harftir");
            }
            else {
                System.out.println(karakter + " : Kucuk Harftir");
            }
        }
        else {
            System.out.println("Girdiginiz Karakter Bir Harf Degil");
        }
    }
}
