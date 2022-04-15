package marketSorusu;

import java.util.Scanner;

import static marketSorusu.Sepet.ürünlersepet;
import static marketSorusu.ÜrünlerList.*;

public class Panel {
    public static void panel() {
        Scanner scanner = new Scanner(System.in);
        double toptutar = 0;
        boolean devammi = false;
        while (!devammi) {
            System.out.println("noya göre ürün seciniz:\n0-domates\n1-patates\n2-biber\n3-sogan\n4-havuc");
            int secim;
            secim = scanner.nextInt();
            while (secim != 0 && secim != 1 && secim != 2 && secim != 3 && secim != 4) {
                System.out.println("seciminiz yanlis lütfen tekrar deneyiniz");
                secim = scanner.nextInt();
            }
            switch (secim) {

                case 0:
                    ürünListesi.add(domates);
                    System.out.println(domates + " sectiniz ve bu ürünün fiyati " + domates.fiyat + " birim");
                    System.out.println("kac kg istersiniz");
                    int domatesKilo = scanner.nextInt();
                    Sepet ekle = new Sepet(ürünListesi, "domates");
                    double tutardomates = domatesKilo * (domates.fiyat);
                    toptutar += tutardomates;
                    System.out.println("simdiye kadar ki alisveris tutariniz :" + toptutar);
                    System.out.println("alisverise devam etmek istiyorsaniz 1 e basiniz bitirmek icin ise 0 a basiniz");

                    int devam;

                    devam = scanner.nextInt();

                    if (devam == 1) {
                        devammi = false;

                    } else if (devam == 0) {
                        System.out.println("alisverisiniz tamamlandi sepetinizdeki ürünler" + ürünlersepet + "\n toplam tutar: " + toptutar);
                        devammi = true;
                        break;


                    } else {
                        System.out.println("yanlis giris");
                        devammi = true;
                        System.out.println("yeni secim yapiniz 1 ya da 0");
                        secim = scanner.nextInt();
                    }
                    break;



            // new Sepet(ürünler, ürünNo);


            case 1:
                ürünListesi.add(patates);
                System.out.println(patates + " sectiniz ve bu ürünün fiyati " + patates.fiyat + " birim");
                System.out.println("kac kg istersiniz");
                int patatesKilo = scanner.nextInt();
                ekle = new Sepet(ürünListesi, "patates");
                double tutarpatates = patatesKilo * (patates.fiyat);
                toptutar += tutarpatates;
                System.out.println("simdiye kadar ki alisveris tutariniz :" + toptutar);
                System.out.println("alisverise devam etmek istiyorsaniz 1 e basiniz bitirmek icin ise 0 a basiniz");
                devam = scanner.nextInt();
                if (devam == 1) {
                    devammi = false;
                } else if (devam == 0) {
                    System.out.println("alisverisiniz tamamlandi sepetinizdeki ürünler" + ürünlersepet + "\n toplam tutar: " + toptutar);
                    devammi = true;
                    // break;


                } else System.out.println("yanlis giris");
                break;
            case 2:
                ürünListesi.add(biber);
                System.out.println(biber + " sectiniz ve bu ürünün fiyati " + biber.fiyat + " birim");
                System.out.println("kac kg istersiniz");
                int biberKilo = scanner.nextInt();
                ekle = new Sepet(ürünListesi, "biber");
                double tutarbiber = biberKilo * (domates.fiyat);
                toptutar += tutarbiber;
                System.out.println("simdiye kadar ki alisveris tutariniz :" + toptutar);
                System.out.println("alisverise devam etmek istiyorsaniz 1 e basiniz bitirmek icin ise 0 a basiniz");
                devam = scanner.nextInt();
                if (devam == 1) {
                    devammi = false;

                } else if (devam == 0) {
                    System.out.println("alisverisiniz tamamlandi sepetinizdeki ürünler" + ürünlersepet + "\n toplam tutar: " + toptutar);
                    devammi = true;


                } else System.out.println("yanlis giris");
                break;
            case 3:
                ürünListesi.add(sogan);
                System.out.println(sogan + " sectiniz ve bu ürünün fiyati " + sogan.fiyat + " birim");
                System.out.println("kac kg istersiniz");
                int soganKilo = scanner.nextInt();
                ekle = new Sepet(ürünListesi, "sogan");
                double tutarsogan = soganKilo * (domates.fiyat);
                toptutar += tutarsogan;
                System.out.println("simdiye kadar ki alisveris tutariniz :" + toptutar);
                System.out.println("alisverise devam etmek istiyorsaniz 1 e basiniz bitirmek icin ise 0 a basiniz");
                devam = scanner.nextInt();
                if (devam == 1) {
                    devammi = false;

                } else if (devam == 0) {
                    System.out.println("alisverisiniz tamamlandi sepetinizdeki ürünler" + ürünlersepet + "\n toplam tutar: " + toptutar);
                    devammi = true;


                } else System.out.println("yanlis giris");
                break;
            case 4:
                ürünListesi.add(havuc);
                System.out.println(havuc + " sectiniz ve bu ürünün fiyati " + havuc.fiyat + " birim");
                System.out.println("kac kg istersiniz");
                int havucKilo = scanner.nextInt();
                ekle = new Sepet(ürünListesi, "havuc");
                double tutarhavuc = havucKilo * (havuc.fiyat);
                toptutar += tutarhavuc;
                System.out.println("simdiye kadar ki alisveris tutariniz :" + toptutar);
                System.out.println("alisverise devam etmek istiyorsaniz 1 e basiniz bitirmek icin ise 0 a basiniz");
                devam = scanner.nextInt();
                if (devam == 1) {
                    devammi = false;

                } else if (devam == 0) {
                    System.out.println("alisverisiniz tamamlandi sepetinizdeki ürünler" + ürünlersepet + "\n toplam tutar: " + toptutar);
                    devammi = true;


                } else System.out.println("yanlis giris");
                break;


            default:
                System.out.println("alisveristen ciktiniz iyi günler dileriz sepetinizdeki ürünler " + ürünlersepet + " ve toplam borcunuz " + toptutar);
                break;


        }


    }

}
}
