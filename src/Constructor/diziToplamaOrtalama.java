package Constructor;

public class diziToplamaOrtalama {

    //Verilen bir dizideki sayıların toplamını ve ortalamasını bulan bir sınıf yazın.

    private int[] sayilar;
    private double toplam;
    private double ortalama;

    public diziToplamaOrtalama(int[]s1){

        sayilar = s1;
        toplam = 0;

        for (int sayi : s1){
            toplam += sayi;
        }
        if (sayilar.length > 0){
            ortalama = toplam / sayilar.length;
        }
        else {
            System.out.println("sayilar dizisi bos");
        }

    }
    public double getToplam(){
        return toplam;
    }
    public double getOrtalama(){
        return ortalama;
    }

    public static void main(String[] args) {
        int [] sayilar = {4, 7, 1, 9, 3};
        diziToplamaOrtalama islem = new diziToplamaOrtalama(sayilar);
        System.out.println("ortalama : " + islem.getOrtalama());
        System.out.println("toplam : " + islem.getToplam());
    }
}
