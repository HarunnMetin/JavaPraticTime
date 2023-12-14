package StringManupulations;

import java.util.Scanner;

public class PalindromKelime {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir kelime alan ve bu kelimenin bir palindrom olup olmadığını
        kontrol eden bir Java programı yazın.

        Palindrom, hem sağ taraftan hem de sol taraftan okunduğunda aynı olan kelime veya kelime gruplarıdır
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scanner.next();


        if (isPalindrom(kelime)) {
            System.out.println(kelime + " bir palindromdur.");
        } else {
            System.out.println(kelime + " bir palindrom değildir.");
        }

        scanner.close();
    }

    // Bir kelimenin palindrom olup olmadığını kontrol eden metodum
    public static boolean isPalindrom(String kelime) {
        kelime = kelime.toLowerCase();

        int baslangic = 0;
        int son = kelime.length() - 1;

        while (baslangic < son) {
            if (kelime.charAt(baslangic) != kelime.charAt(son)) {
                return false;
            }
            baslangic++;
            son--;
        }

        return true;
    }
    }




