package proje;

import java.util.Scanner;

public class ThreeEvenOdd {
     /*
    Given an int array as a parameter
    return true if the array contains either 3 even or 3 odd values .
    for Example:
    intArray([2, 1, 3, 5]) result should be true
    intArray([2, 1, 2, 5]) result should be  false
    intArray([2, 4, 2, 5]) result should be  true
     */


    /*
   Parametre olarak int dizisi verildiğinde
   array 3 tane çift veya 3 tane  tek değer içeriyorsa true değerini döndürür.
   Örnek:
   intArray([2, 1, 3, 5]) sonuc  true olmalı
   intArray([2, 1, 2, 5]) sonuc   false olmalı
   intArray([2, 4, 2, 5]) sonuc   true olmalı
   */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Eleman sayisini giriniz : ");
        int elemanSayisi = scan.nextInt();

        int arr[] = new int[elemanSayisi];

        int sayacCift = 0;

        int sayacTek = 0;

        boolean ücTaneMi = true;

        int elemanlar = 0;

        for (int i = 0; i < elemanSayisi; i++) {

            System.out.println(i+1+". elemani giriniz");
            elemanlar = scan.nextInt();

            System.out.println(i + 1 + ". elemani giriniz");
            elemanlar = scan.nextInt();
            arr[i]=elemanlar;

        }




        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sayacCift++;
            } else
                sayacTek++;
        }
        System.out.println("Cift sayi adedi : " + sayacCift);
        System.out.println("Tek sayi adedi : " + sayacTek);

        if (sayacCift >= 3 || sayacTek >= 3) {
            System.out.println(ücTaneMi);

        } else System.out.println(!ücTaneMi);
    }




    }

