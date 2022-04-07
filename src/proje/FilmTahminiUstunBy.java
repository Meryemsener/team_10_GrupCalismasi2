package proje;

import java.io.BufferedReader;
import java.io.IOException;
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
    // Tahmin Edilecek Fimler:==>,MUCIZE,UMUT,KARAKOMIK,NEFES,OTEKI,AYLA,ESKIYA,MUTLULUK,KELEBEKLER
     private static boolean devam=false;
    public static void main(String[] args) throws IOException {


        while (true){
        boolean devam=false;

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


        //For dongumu aciyorum asagida

        for (i =0; i<kelime.length(); i++){// kelimenin uzunlugunu bulmak icin bide i++ artitani kullandim
            bulunan [i]="_ ";// i sirasiyla artiracgi icin buda "_ " kelimemin uzunluguna kadar alt tire girecek

        }

        //Bir while olusturacam

        while (tahmin<=5){ //tahmin sayisini bulmak icin

            System.out.println("Bir harf giriniz (Kalan hakkiniz " + (5- tahmin)+ ") :");
            tahmin++;
            String harf= klavye.readLine();//yazilan harfleri daha kolay getirmek icin

            for ( i= 0; i <kelime.length(); i++) {//olur veya olmaz dongusune soktum

                if (kelime.charAt(i)==harf.charAt(0)){// burda kelimenin uyup uymadigini bakiyorum harf olarak
                    bulunan[i]= harf + " ";// dizi oldugu icin ayni zaman degiskendir

                    anahtar =1;//true veya false dondurmesi icin anahtarimiz artik sifir degil bir
                    dogru++;// dogruyu artirdim

                    if (dogru==kelime.length()){// artik dogru ise bildin programdan cik diye yaptim

                        System.out.println("kelime \n" +kelime+ "*********************\n");
                    }
                }

            }

           if (anahtar==1){
               anahtar=0;
               tahmin--;//tahmimizin dusmemesi icin

           }
            for (i = 0; 1<kelime.length(); i++) {
                System.out.print(bulunan[i]);

            }
            System.out.println();
        } if (dogru != kelime.length()){
            System.out.println("Uzgunum.... dogru yanit"+kelime);

        }

        System.out.println("***********DEVAM ETMEK ISTERMISINIZ?    ('EVET')/' 'HAYIR' ");

        String cevap= scan.nextLine();

        if (cevap.equals("EVET")){
            devam=true;

        } else if (cevap=="HAYIR"){
            System.out.println("Tekrar Bekleriz");
            devam=false;

            break;//programdan cikmak icin
        }else {

            System.out.println("Tanimsiz kelime giris yaptiniz!");
            break;
        }

    }
}
}







