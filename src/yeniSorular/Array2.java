package yeniSorular;


import java.util.Scanner;


public class Array2 {
    public static void main(String[] args) {
        /*
        Verilen bir sayının, bir dizide kaç defa tekrarlandığını
        bulan Java programını oluşturun.


         */



        int sayac = 0;
        int[] dizi = {10, 5, 7, 8, 45, 9, 10, 45, 78, 32};

        Scanner klavye = new Scanner(System.in);
        System.out.println("Dizide Aratmak İstediğiniz Sayıyı Giriniz");

        int ara = klavye.nextInt();

        for (int i = 0; i < dizi.length; i++) {
            if (ara == dizi[i]) {
                sayac = sayac + 1;
            }
        }
        System.out.println("Dizide Aradığınız Sayı    : " + ara);
        System.out.println("Dizide Tekrar Edilme Sayısı : " + sayac);



    }
}
