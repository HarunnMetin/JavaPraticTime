package If_ElseStatement;

import java.util.Scanner;

public class P_Question10 {

    public static void main(String[] args) {

        /*
        Kullanicidan bir yil girisi alin. Bu yilin bir artik yil olup olmadigini kontrol edin ve sonucu ekrana
        yazdirin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen artik yil olupomadigini merakettiginiz bir yil giriniz");
        int yil = scanner.nextInt();

        if (yil%4==0){
            System.out.println( yil +" : Artik Yildir");
        }else {
            System.out.println(yil +" : Artik Yil Degildir");
        }
    }
}
