package Constructor;

public class sayilarinToplami {

    //İki sayının toplamını bulan bir sınıf yazın.

    private int ilkSayi;
    private int ikinciSayi;
    private int toplam;



    public sayilarinToplami (int sayi1 , int sayi2){

        this.ilkSayi = sayi1;
        this.ikinciSayi = sayi2;
        toplam = sayi1 + sayi2;
    }
    public int toplaminiDondur(){

        return toplam;
    }

    public static void main(String[] args) {

        sayilarinToplami sayilarinToplami = new sayilarinToplami(10,15);
        System.out.println("Sayilsrin toplami : " + sayilarinToplami.toplaminiDondur());
    }
}
