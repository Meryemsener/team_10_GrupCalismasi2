package arrays;

import java.util.Arrays;

public class Arrays04 {
    /*
    verilen bir array in en buyuk elemanini ve bu elemanin kacinci sirada oldugunu bulunuz
    input={10,13,56,20,40,60,56,32}
    output=60, 5

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

