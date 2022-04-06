package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays12 {
     /*
    N elemanli bir tamsayi dizisi veriliyor, diziyi sondan basa dogru ters cevirin
    input={1,3,3,7,4,10,6}
    output={6,10,4,7,3,3,1}
    =>ikinci yolu da temp kullanarak cozun
    ipucu=>bir temp olusturup son elemani ile indekse atma ve bunu length bitene kadar devam etme
     */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman sayisi giriniz : ");


        int n = scan.nextInt();             // n ---> arrayin kac elemani olacagini belirler.
        int[] arr = new int[n];             // n elemanli bir array olusturuldu.


        for (int i = 0; i < n; i++) {
            System.out.print(i + 1 + ". elemani giriniz : ");
            int eleman = scan.nextInt();    // array´e teker teker eleman atandi.
            arr[i] = eleman;
        }
        System.out.println("Arr : " + Arrays.toString(arr));   // arr yazdirildi.


        int temp[] = new int[arr.length];   // arr uzunlugunda yeni bir array olusturuldu --> reverse icin

        for (int i = temp.length - 1; i >= 0; i--) {
            temp[i] = arr[temp.length - i - 1]; // temp array´ine arr reverse edilerek atandi.
        }
        System.out.println(Arrays.toString(temp));
    }
}
