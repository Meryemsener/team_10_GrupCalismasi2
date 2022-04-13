package arrays;

import java.util.Arrays;

public class Arrays09 {
    /*
           bir sinifa ait notlar veriliyor(1-100°,dersin hocasi en yuksek notu alan
           ogrencinin notunu 100'e tamamliyor ve bu ogrenciye ekledigi puan kadar
           tum ogrencilere puan ekliyor. Ogrencilerin ekleme sonrasi notlarini listeleyiniz

            notlar dizisi={70,80,90,65,75,90,69,72,87,90,75}
            output={80,90,100,75,85,100,79,82,97,100,85}

         */
    public static void main(String[] args) {

        int arr[] = {70, 80, 90, 65, 75, 90, 69, 72, 87, 90, 75};
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("En yüksek not : " + max);
        int eklenenPuan = 0;
        if (max < 100) {
            eklenenPuan = 100 - max;
        }
        System.out.println("Eklenen puan : " + eklenenPuan);
        for (int i = 0; i < arr.length; i++) {
            arr[i] += eklenenPuan;
        }
        System.out.println("Puan eklenmis hali : " + Arrays.toString(arr));
    }
}
