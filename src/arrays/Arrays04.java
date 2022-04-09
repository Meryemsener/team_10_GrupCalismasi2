package arrays;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
    /*
    verilen bir array in en buyuk elemanini ve bu elemanin kacinci sirada oldugunu bulunuz
    input={10,13,56,20,40,60,56,32}
    output=60, 5
    */
     int [] arr=new int[]{10,13,56,20,40,60,56,32};
     int max=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];


     int [] arr1={10,13,56,20,40,60,56,32};
     int  sira=Arrays.asList (arr).indexOf(60);
                System.out.println(sira);

            }
        }
        System.out.println("en büyük sayı:"+max);
    }
}