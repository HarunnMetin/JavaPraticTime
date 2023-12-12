package Constructor;

public class dizidekiBuyukKucukSayi {

    //Verilen bir dizideki en büyük ve en küçük sayıları bulan bir sınıf yazın.

    private int[] array;
    private int enBuyuk;
    private int enKucuk;

    public dizidekiBuyukKucukSayi(int[] arr){

        this.array = arr;

        if (array.length>0){

            enBuyuk = array[0];
            enKucuk = array[0];

            for (int sayi : array){
                if (sayi > enBuyuk){
                    enBuyuk = sayi;
                }
                else if (sayi < enKucuk){
                    enKucuk = sayi;
                }
            }
        }
        else {
            System.out.println("dizi bos");
        }

    }
    public int getEnBuyuk(){
        return enBuyuk;
    }
    public int getEnKucuk(){
        return enKucuk;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,56,7};
        dizidekiBuyukKucukSayi islem = new dizidekiBuyukKucukSayi(arr);
        System.out.println("En buyuk sayi : " + islem.getEnBuyuk());
        System.out.println("En kucuk sayi : " + islem.getEnKucuk());
    }
}
