package If_ElseStatement;

import java.util.Scanner;

public class P_Question {

    public static void main(String[] args) {

        /*
        kullanicinin girdigi sayinin pozitif negatif veya sıfır oldugnu belirleyen bir programi
        düşünün ve budurumu kontrol etmek için if else kullanın.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz");
        int sayi = scanner.nextInt();

        if (sayi>0) System.out.println("Girdiginiz Sayi Pozitiftir");
        if (sayi==0) System.out.println("Girdiginiz sayi sıfırdır");
        if (sayi<0) System.out.println("Girdiginiz Sayi Negatiftir");

    }
}
