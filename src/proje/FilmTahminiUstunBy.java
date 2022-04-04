package proje;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

   public class FilmTahminiUstunBy {

    /*
     TASK :
      yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının film ismini  görmeden
      filmin index nosuna göre sectiriniz
      seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
      sağlayan method create ediniz...
      Ahanda TRICK...
      kullanıcının sectiği filmin harf sayısını  console yazdırınız.
      kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
      kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
      kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);//kullanicidan deger almak icin

        System.out.print("*****FILM TAHMINI OYUNUNA HOSGELDINIZ******");

        System.out.println("\nFilm tahimi icin bir harf yaziniz : ");

        String kelime= scan.nextLine();// degisken isminde kelime ekledim scanner referansindan

        //Dongu olusturam surekli dongumuz olmasi icin int deger atiyacam
        int i, tahmin =0, anahtar=0, dogru=0;// int turunden tanim yaptim hespini bir satirda yaptim

        //Dizi olusturacam String turunden
        String bulunan[]=new String[kelime.length()];//kelime indexini bulmak icin parametre icine yazdim

        System.out.println("Kelimeyi bulmak icin 5 yanlis hakkiniz var");//kullanicin kac hakkini oldugunu gosterdim

        //googleden arastirdim BufferedReader klavye turunden bir degisken yani klavyden okunanlari icin
        BufferedReader klavye =new BufferedReader(new InputStreamReader(System.in));//kutuphanedeki siniflar gibi dusundum


    }
}







