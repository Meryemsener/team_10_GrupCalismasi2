package yeniSorular;

import java.util.List;
import java.util.Scanner;

public class ArrayList<S> {
    public static void main(String[] args) {
        /*
        Yazılım ile ilgili bir eğitim verilecek.
         Eğitimde almak istediklerimizi klavyeden bir diziye
          aktaracağız. Daha sonra aldığımız eğitimlerden herhangi
          birini klavyeden girdiğimizde hangi sırada olduğunu öğreneceğiz.
          Yani dizideki herhangi bir elemanın sırasını yazdıran programı
           “array” ile yazacagiz.
         */



                Scanner scan=new Scanner(System.in);
                System.out.println("Verilecek Olan Eğitimde Kaç Adet Ders Almak İstiyorsunuz  ?");
                int dersSayisi=scan.nextInt();
                List<String> dersler=new java.util.ArrayList<>();
                System.out.println("Almak İstediğiniz Dersleri Yazınız...");

                for(int i=0;i<dersSayisi;i++){
                    dersler.add(scan.next());
                }
                System.out.println("Aldığınız Dersler :");
                for(String ders :dersler){
                    System.out.println(ders);
                }
                System.out.println("Eklediğiniz Derslerden Hangisinin Sırasını Öğrenmek İstiyorsunuz?");
                String ara=scan.next();
                System.out.println();
                if(dersler.contains(ara)){

                    System.out.println("Eklediğiniz Ders :"+ ara);
                    System.out.println("Eklediğiniz Dersin Eğitimini "+(dersler.indexOf(ara)+1)+". Sırada Alacaksınız");

                }else{
                    System.out.println("Aradığınız Ders, Seçimlerinizde Gözükmemektedir.");

                }
            }
        }

