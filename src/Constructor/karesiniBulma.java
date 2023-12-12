package Constructor;

public class karesiniBulma {

    //Verilen bir sayının karesini bulan bir sınıf yazın.

    private int sayi;
    private int kare;

    public karesiniBulma(int s1){

        this.sayi = s1;
        kare = s1*s1;
    }
    public int getKare(){
        return kare;

    }

    public static void main(String[] args) {

        karesiniBulma karesiniBulma = new karesiniBulma(2);
        System.out.println("Sayinin karesi : " + karesiniBulma.getKare());
    }
}
