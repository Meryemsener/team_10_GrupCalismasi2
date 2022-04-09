package arrays;

public class Arrays14 {
    /*
        Bir sinifta bir derse ait notlar veriliyor, sinifin not ortalamsindaki
        ve daha yuksek not alan ogrenciler basarili sayiliyor, kac kisinin basarili oldgunu bulan kod yazdiriniz

        input={100,70,80,70,20,30,50,50,65,55,57}
        output
        ortalamayai bulan ve asan ogrenci sayisi:

     */
    public static void main(String[] args) {
        int[] puan = new int[]{100, 70, 80, 70, 20, 30, 50, 50, 65, 55, 57};
        int toplam = 0;
        double avarage;
        int basariliSayisi = 0;
        for (int i = 0; i < puan.length; i++) {
            toplam = toplam + puan[i];
        }
        avarage = toplam * 1.0 / puan.length;//kesirli sayi olarak almak icin 1.0 ile carp
        for (int i = 0; i < puan.length; i++) {
            if (puan[i] >= avarage) basariliSayisi++;

        }
        System.out.println(avarage);
        System.out.println("ortalamayai bulan ve asan ogrenci sayisi : " + basariliSayisi);

    }
}
