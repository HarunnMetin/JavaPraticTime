package If_ElseStatement;

import java.util.Scanner;

public class P_Question6 {

    public static void main(String[] args) {

        /*
        bir ogrencinin notunu temsil eden integer degeri kullanicidan alin 90-100 araliginda ise "AA"
        80-89 araliginda ise "BA" 70-79 araliginda ise "BB" 60-69 araliginda ise "CB" 50-59 araliginda ise "CC"
        0-49 araliginda ise "FF" yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Notunuzu Giriniz");
        int ogrenciNotu =scanner.nextInt();

        if (ogrenciNotu >= 90 && ogrenciNotu <= 100) System.out.println("AA");
        if (ogrenciNotu >= 80 && ogrenciNotu <= 89) System.out.println("BA");
        if (ogrenciNotu >= 70 && ogrenciNotu <= 79) System.out.println("BB");
        if (ogrenciNotu >= 60 && ogrenciNotu <= 69) System.out.println("CB");
        if (ogrenciNotu >= 50 && ogrenciNotu <= 59) System.out.println("CC");
        if (ogrenciNotu >= 0 && ogrenciNotu <= 49) System.out.println("FF");
    }
}
