package arrays;

public class Arrays08 {
    public static void main(String[] args) {


    /*
    Bir dersten ogrencilerin aldigi notlar,tamsayi dizisi olarak veriliyor

    En yuksek notu kac ogrenci almisitr
    input={95,70,80,90,65,75,95,47,73,56,72,95}
    output=3
      */

    int arr[] = new int[]{95, 70, 80, 90, 65, 75, 95, 47, 73, 56, 72, 95};
    int max = arr[0];
    // max = en yuksek not

        for (int i = 0; i < arr.length ; i++) {
        if (arr[i]>max){
            max=arr[i];
        }
    }

    int count=0;
    // count= kac ogrencinin yuksek aldigi

            for (int j = 0; j < arr.length ; j++) {
        if (arr[j]==max){
            count++;
        }
    }

        System.out.println("En yuksek notu: " + count + "  ogrenci " + max + " ile almistir.");

}
}

