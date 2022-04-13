package yeniSorular;

import java.util.Scanner;

public class ifElse {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Bir arıtma tesisinde arıtılan su miktarı günde 5000 metreküptür.
        Arıtılan her 1 metreküp suyun birim arıtma bedeli
        arıtılan su hacmine göre değişmektedir.

        Tarife aşağıdaki gibidir:

    2.5 TL (0 – 30.000 metreküp arası)
    3.0 TL (30.000 – 50.000 metreküp arası)
    3,5 TL ( >50.000 metreküp )

Buna göre, 1 yıl boyunca gün gün arıtma masraflarını toplam olarak bulan
ve aşağıdaki ekran görüntüsüne sahip olacak bir program hazırlayınız.
         Arıtma Tesisi Günlük Arıtma Masrafı Listesi
……………………………………………….
1.Gün Sonunda Masraf = …….. TL
2.Gün Sonunda Masraf = ………TL
3.Gün Sonunda Masraf = ………TL

XX. Gün Sonunda Masraf = ……..TL

         */
        System.out.println("************************");
        System.out.println("Tesisimize Hos Geldiniz");

        System.out.println("Aritma Tarifemizi görmek icin 1´e basiniz");
        int input = scan.nextInt();

        if (input == 1) {
            System.out.println("2.5 TL (0 – 30.000 metreküp arası)\n" +
                    "3.0 TL (30.000 – 50.000 metreküp arası)\n" +
                    "3,5 TL ( >50.000 metreküp )");
        } else System.out.println("Hatali giris yaptiniz.");


        System.out.print("Günlük aritilacak su miktarini giriniz : ");
        int günlükAritilanSuMiktariMetreküp = scan.nextInt();

        double ücret1 = 2.5;
        double ücret2 = 3.0;
        double ücret3 = 3.5;

        long tutar = 0l;


        if (günlükAritilanSuMiktariMetreküp > 0 && günlükAritilanSuMiktariMetreküp <= 30000) {
            System.out.println("Metreküp basina ödemeniz gereken tutar " + ücret1 + " TL´dir.");
            //tutar = günlükAritilanSuMiktariMetreküp * ücret1;
            //System.out.println("Toplam ödemeniz gereken günlük tutar " + tutar + " TL´dir.");

            for (int i = 1; i <= 365; i++) {
                tutar += günlükAritilanSuMiktariMetreküp * ücret1;
                System.out.println(i + ". gün sonunda masraf : " + tutar + " TL´dir");
            }

        } else if (günlükAritilanSuMiktariMetreküp > 30000 && günlükAritilanSuMiktariMetreküp <= 50000) {
            System.out.println("Metreküp basina ödemeniz gereken tutar " + ücret2 + " TL´dir.");
            //tutar = günlükAritilanSuMiktariMetreküp * ücret2;
            //System.out.println("Toplam ödemeniz gereken günlük tutar " + tutar + " TL´dir.");

            for (int i = 1; i <= 365; i++) {
                tutar += günlükAritilanSuMiktariMetreküp * ücret2;
                System.out.println(i + ". gün sonunda masraf : " + tutar + " TL´dir");
            }

        } else if (günlükAritilanSuMiktariMetreküp > 50000) {
            System.out.println("Metreküp basina ödemeniz gereken tutar " + ücret3 + " TL´dir.");
            //tutar = günlükAritilanSuMiktariMetreküp * ücret3;
            //System.out.println("Toplam ödemeniz gereken günlük tutar " + tutar + " TL´dir.");

            for (int i = 1; i <= 365; i++) {
                tutar += günlükAritilanSuMiktariMetreküp * ücret3;
                System.out.println(i + ". gün sonunda masraf : " + tutar + " TL´dir");
            }

        } else System.out.println("Hatali bir giris yaptiniz.");

        System.out.println("************************");


        System.out.println("1 sene sonunda ödemeniz gereken toplam tutar " + tutar + " TL´dir.");

    }
}
