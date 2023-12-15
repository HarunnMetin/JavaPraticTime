package ArrayList;

import java.util.ArrayList;

public class ElemanlarinToplami {

    public static void main(String[] args) {

        /*
    Bir ArrayList içinde şu sayılar bulunmaktadır: [2, 4, 6, 8, 10].
    Bu ArrayList'teki elemanların toplamını bulunuz.
     */

        ArrayList<Integer> sayilar = new ArrayList<>();

        sayilar.add(2);
        sayilar.add(4);
        sayilar.add(6);
        sayilar.add(8);
        sayilar.add(10);

        int toplam = 0;

        for (int sayi : sayilar){

            toplam+=sayi;
        }
        System.out.println(sayilar.size());

        System.out.println(toplam);

    }
}
