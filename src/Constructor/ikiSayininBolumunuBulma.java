package Constructor;

public class ikiSayininBolumunuBulma {

    //Verilen iki sayının çarpımını ve bölümünü hesaplayan bir sınıf yazın.

    private int sayi1;
    private int sayi2;
    private double carpim;
    private double bolum;

    public ikiSayininBolumunuBulma(int s1,int s2){

        this.sayi1 = s1;
        this.sayi2 = s2;
        carpim = s1 * s2;

        if (s2 != 0){
            bolum = s1 / s2;
        }
        else {
            System.out.println("sifira bolme hatasi");
        }
    }
    public double getBolum(){

        return bolum;
    }
    public double getCarpim(){
        return carpim;
    }

    public static void main(String[] args) {

        ikiSayininBolumunuBulma ikiSayininBolumunuBulma = new ikiSayininBolumunuBulma(56,2);
        System.out.println(ikiSayininBolumunuBulma.getBolum());
        System.out.println(ikiSayininBolumunuBulma.getCarpim());

    }
}
