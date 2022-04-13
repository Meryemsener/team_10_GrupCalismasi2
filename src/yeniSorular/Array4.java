package yeniSorular;

import java.util.ArrayList;
import java.util.Scanner;

public class Array4 {
    /*
        Bir alışveriş listesi hazırlıyoruz.
        Ve listede bir elemanı yanlış yazdığımızı fark ettik,
         düzeltip yerine başka bir eleman eklemek istiyoruz.
         Yani dizide bir elemanı silip yerine başka bir eleman
         ekleyeceğiz.
        Peki bunu Java’da nasıl oluşturacağız ?
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//listenin boyutunu Scanner komutu ile scanden giriyorum

        System.out.println("Alışveriş listeniz kac eleman olacak ?");
        int sepet = scan.nextInt();

        //Alinacak listemizi String dizisini oluşturuyorum
        ArrayList<String> alinacaklar = new ArrayList<String>();
        System.out.println("Alışveriş listesizi oluşturunuz : ");

        //For döngüsü ile listemize sepet tane eleman ekliyoruz.
        for (int i = 0; i < sepet; i++) {
            alinacaklar.add(scan.next());
        }

        //market listemizi for dongusu ile her seferde artirmasi icin
        System.out.println("Market Listesi : ");
        for (int j = 0; j < sepet; j++) {
            System.out.println(alinacaklar.get(j));

        }
        //Değiştirmek istediğimiz elemanın indeks değerini scan.nextInt girerek
        // değerinin değişmesi icin.
        System.out.println("Degistirilecek elemanlar hangileri?");
        int degis = scan.nextInt();

       //Listeye eklemek istegimiz yeni elemanlari String turunden scan.next ile yeterli olur
        System.out.println("Listeye eklemek istediginiz elemanlari yaziniz");
        String ekleme = scan.next();

        //sonra elemanı silip, yerine ekleyeceğimiz değerin gelmesini sağlayan metodu yazıyorum
        alinacaklar.add(degis - 1, ekleme);//

        System.out.println("Listenin son hali :");

        //Sonra dizimizin son halini gormek icin for dongusu ile yazdiracagiz
        for (int k = 0; k < alinacaklar.size(); k++) {
            System.out.println(alinacaklar.get(k));
        }
    }

}








