package If_ElseStatement;

import java.util.Scanner;

public class P_Question5 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir yas girisi alin eger yas 18 den kucuk ise "Ehliyet alamazsiniz" yazdirin
        aksi takdirde "Ehliyet alabilirsiniz" yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Yasinizi Giriniz");
        int kullaniciYasi = scanner.nextInt();

        if (kullaniciYasi < 18){
            System.out.println("Ehliyet Alamazsiniz");
        }
        else {
            System.out.println("Ehliyet Alabilirsiniz");
        }
    }
}
