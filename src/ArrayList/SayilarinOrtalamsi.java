package ArrayList;

import java.util.ArrayList;

public class SayilarinOrtalamsi {

    public static void main(String[] args) {

        /*
        Bir ArrayList içinde şu sayılar bulunmaktadır: [3, 7, 11, 15, 19].
        Bu ArrayList'teki sayıların ortalamasını bulunuz.
         */

        ArrayList<Integer> sayilar =new ArrayList<>();
        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(11);
        sayilar.add(15);
        sayilar.add(19);
        sayilar.add(19);

        int toplam = 0;

        for (int sayi : sayilar){

            toplam += sayi;
        }
        System.out.println(toplam);

        double ortalama = toplam/sayilar.size();
        System.out.println(ortalama);
    }
}
