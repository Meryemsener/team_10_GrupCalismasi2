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
        Scanner scan=new Scanner(System.in);

        System.out.println("Alışveriş listeniz kac eleman olacak ?");
        int sepet=scan.nextInt();

        ArrayList<String> alinacaklar=new ArrayList<String>();
        System.out.println("Alışveriş listesizi oluşturunuz : ");
        for(int i=0;i<sepet;i++){
            alinacaklar.add(scan.next());
        } System.out.println("Market Listesi : ");
        for(int j=0;j<sepet;j++){
            System.out.println(alinacaklar.get(j));

        }
    }
}










