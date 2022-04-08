package proje;
import java.util.*;

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
<<<<<<< HEAD
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız*/
     //Tahmin Edilecek Fimler:==>,MUCIZE,UMUT,KARAKOMIK,NEFES,OTEKI,AYLA,ESKIYA,MUTLULUK,KELEBEKLER

    public static void main(String[] args) throws IOException {

       // Tahmin Edilecek Fimler:==>,MUCIZE,UMUT,KARAKOMIK,NEFES,OTEKI,AYLA,ESKIYA,MUTLULUK,KELEBEKLER
=======
      kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.
     */

    static List<String> film = new ArrayList<>(Arrays.asList("KELEBEK", "MUCIZE", "AYLA", "DUNKIRK" ,
            "MEMENTO", "GORA", "ESKIYA", "FIGHTCLUB","KARAKOMIK","KILLBILL","AMELIE","XMEN","OLDBOY",
            "BATMAN","KELOGLAN","TOYSTORY","MUTLULUK","SEVEN"));

<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("*********FILM TAHMIN OYUNUNA HOSGELDINIZ*********");
            System.out.print("1-" + (film.size()) + " arasinda bir sayi giriniz(Cikmak icin sayi disinda bir karakter giriniz):");
            Collections.shuffle(film);
            int secim = scan.nextInt();
            while (secim < 1 || secim > film.size()) {
                System.out.println("Hatali giris yaptiniz");
                secim = scan.nextInt();
            }
            secim--;
            String secilenfilm = film.get(secim);
            String gizlifilm = secilenfilm.replaceAll("\\w", "_");
            int haksayisi = secilenfilm.length() * 2;
            String[] arrfilm = secilenfilm.split("");
            String[] gizlifilmarr = gizlifilm.split("");
            System.out.println("Sectiginiz filmin harf sayisi: " + arrfilm.length);
            String tahmin = scan.nextLine().replaceAll("\\W", "").toUpperCase();
            while (haksayisi >= 0) {
                if (tahmin.equals(secilenfilm) || !Arrays.toString(gizlifilmarr).contains("_")) {
                    System.out.println("Tebrikler, filmi dogru tahmin ettiniz :) \nFilmin adi: " + secilenfilm);
                    break;
                } else if (haksayisi == 0) {
                    System.out.println("Filmi tahmin edemediniz...\nFilmin adi: " + secilenfilm);
                    break;
                } else {
                    System.out.println("Kalan tahmin sayiniz: " + haksayisi + "\n" + Arrays.toString(gizlifilmarr)
                            + "\nLütfen filmin adini tahmin ediniz ya da bir adet harf giriniz:");
                    tahmin = scan.nextLine().replaceAll("\\W", "").toUpperCase();
                    if (tahmin.length() != 1) haksayisi--;
                    else if (!secilenfilm.contains(tahmin)) haksayisi--;
                    else {
                        for (int i = 0; i < arrfilm.length; i++) {
                            if (!arrfilm[i].equals(tahmin)) {
                                arrfilm[i] = "_";
                            }
                        }
                        for (int i = 0; i < arrfilm.length; i++) {
                            if (!arrfilm[i].equals("_")) {
                                gizlifilmarr[i] = arrfilm[i];
                            }
                        }
                        haksayisi--;
                        arrfilm = secilenfilm.split("");
=======
        while (true){
        boolean devam=false;
>>>>>>> 618ce591a7bf5dba29b3efe4ff12c094958b822e

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

                if (kelime.charAt(i) == harf.charAt(0)) {// burda kelimenin uyup uymadigini bakiyorum harf olarak
                    bulunan[i] = harf + " ";// dizi oldugu icin ayni zaman degiskendir

                    anahtar =1;//true veya false dondurmesi icin anahtarimiz artik sifir degil bir
                    dogru++;// dogruyu artirdim

<<<<<<< HEAD
                    //Devami gelecek....

                }
            }}}}
=======
                    if (dogru==kelime.length()){// artik dogru ise bildin programdan cik diye yaptim

                        System.out.println("kelime \n" +kelime+ "*********************\n");
>>>>>>> 69ce44142291269def6d06b54dc43f815024c661
                    }
                }
            }
        }
<<<<<<< HEAD

        System.out.println("***********DEVAM ETMEK ISTERMISINIZ?    ('EVET')/' 'HAYIR' ");

        String cevap= scan.nextLine();

        if (cevap.equals("EVET")){
            devam=true;

        } else if (cevap=="HAYIR"){
            System.out.println("Tekrar Bekleriz");
            devam=false;

            break;//programdan cikmak icin
        }else {

            System.out.println("Tanimsiz kelime giris yaptiniz!");/////
            break;
        }

=======
>>>>>>> ustun
    }
}





>>>>>>> 618ce591a7bf5dba29b3efe4ff12c094958b822e
