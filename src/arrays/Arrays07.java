package arrays;

import java.util.Arrays;

public class Arrays07 {
     /*
        Bir siniftaki ogrencilerin boylari tam sayi olarak verilmistir, ayrica bu sinifin ogrencisi olan Ali'nin de
        boyu veriliyor,.Beden egitimi dersinde ogrenciler buyukten kucuge
        siralandiginda Ali kacinci sirada olur?(En uzun ogrenci 1. siradadir ve boy esitligi dikkate alinmamistir°
        input={170,180,167,165,175,190,169,172,187,178,177}
        Alinin boyu 175
        output=Ali 5.siradadir



         */

    public static void main(String[] args) {


        int boylari[] = {170, 180, 167, 165, 175, 190, 169, 172, 187, 178, 177};

        Arrays.sort(boylari);
        System.out.println("kücükten büyüge:" + Arrays.toString(boylari));

        int m = Arrays.binarySearch(boylari, 175);

        //System.out.println(m);

        System.out.println("Ali " + (boylari.length - m) + ".siradadir");


        System.out.println("*************************2. cozum yolu********************");


        Arrays.sort(boylari);


        int büyüktenKücüge[] = new int[boylari.length];

        for (int i = 0; i < büyüktenKücüge.length; i++) {
            büyüktenKücüge[i] = boylari[boylari.length - 1 - i];
        }

        System.out.println("Büyükten kücüge : " + Arrays.toString(büyüktenKücüge));


        for (int j = 0; j < büyüktenKücüge.length; j++) {
            if (büyüktenKücüge[j] == 175)
                System.out.println("Ali " + (j + 1) + ".siradadir");
        }

    }
}
