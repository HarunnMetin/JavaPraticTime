package WhileLoops;

import java.util.Scanner;

public class WhileLoops2 {

    public static void main(String[] args) {
        /*
        1'den 20'ye kadarolan cift sayilari ekrana yazdiran bir java programi yaziniz
         */

        int sayi =1;
        while (sayi<=20){
            if (sayi%2==0){
                System.out.println(sayi);
            }
            sayi++;
        }



    }
}
