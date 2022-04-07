package arrays;

import java.util.Scanner;

public class Arrays10 {
    /*
        Ogretmen ogrencilerin defter ihtiyacini karsilamak icin sinifa X adet
        defter getirmistir. Ogrencilerin defter ihtiyaci azdan coga dogru sirali bir tamsayi
        dizisi olarak verilmisitr. Ogretmen en fazla kac ogrencinin defter ihtiyacini karsilayabilir
        (need[i]>0)
        input
        need [] ={1,3,3,5,6,10,20,50,100}

        output
        Defter ihtiyaci karsilanan ogrenci sayisi    kisidir

                 */

    public static void main(String[] args) {
        int defterAdedi = 30;
        int defterIhtiyaci[] = {1, 3, 3, 5, 6, 10, 20, 50, 100};
        int ögrenciSayisi = 0;
        int toplam = 0;
        for (int i = 0; i < defterIhtiyaci.length; i++) {

                if (toplam + defterIhtiyaci[i] > defterAdedi) {
                    break;
                } else {
                    toplam += defterIhtiyaci[i];
                    ögrenciSayisi++;
                }
            }

        System.out.println("Karsilanabilcek ogrenci sayisi  : " + ögrenciSayisi);
        System.out.println(toplam);

    }
}