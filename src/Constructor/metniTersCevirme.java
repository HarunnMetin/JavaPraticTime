package Constructor;

public class metniTersCevirme {

    //Verilen bir metni ters çeviren bir sınıf yazın.

    private String metin;
    private String tersCevrilmisMetin;

    public metniTersCevirme(String metin){
        this.metin = metin;


        for (int i = metin.length()-1; i >=0 ; i++) {
            tersCevrilmisMetin += i;
        }
    }
    public String getMetin(){
        return tersCevrilmisMetin;
    }

    public static void main(String[] args) {
        String metin = "harun";
        metniTersCevirme metniTersCevirme = new metniTersCevirme(metin);
        System.out.println("Ters cevrilmis metin : " + metniTersCevirme.getMetin());
    }
}
