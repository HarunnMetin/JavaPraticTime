package If_ElseStatement;

import java.util.Scanner;

public class P_Question2 {

    public static void main(String[] args) {

        /*
        kullanicidan bir sayi isteyin ve bu sayinin asal olup olmadigini kontrol eden bir java programi yazin
         */



        //bu soruya bakkkkkkkkkkkkk

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        if (sayi< 2){
            System.out.println("Asal Degildir");
        }
        else if (sayi%sayi == 0){
            System.out.println("Sayi asaldir");
        }
        else if (sayi%2 == 0 && sayi%3==0){
            System.out.println("Asal Degildir");
        }

    }
}
