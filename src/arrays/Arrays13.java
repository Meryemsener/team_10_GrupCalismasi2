package arrays;

import java.util.Scanner;

public class Arrays13 {
    /*
            ilk iki elemani sira ile 0 ve 1 olan, N elemanli bir tamsayi dizisinin
            elemanlari kendilerinden onceki elemanin toplamidir.Bu diziyi ekrana yazdiriniz
            input=
             N
            numbers []=0
            numbers[1]=1;

             output
             numbers={0,1,1,2,3,5,8,13}

            */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int sayilar[]=new int[N];
         sayilar[0]=0;
         sayilar[1]=1;

        for (int i = 2; i <sayilar.length ; i++) {
            sayilar[i]=sayilar[i-1]+sayilar[i-2];
        }

        for (int i = 0; i <sayilar.length ; i++) {
            System.out.print(sayilar[i]+" ");

        }
    }
}
