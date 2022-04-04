package proje;

import java.util.Scanner;

public class UcusSorusu_Berk {
    /*
    A şehrinden uçmak isteyen bir yolcu
    B şehrine 500km
    C şehrine  700km
    D şehrine  900 km mesafededir.

    Bilet tarifesi:
    km birim fiyati : 0.10$

    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

 */
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println(" ***** Firmamiza hos geldiniz. *****");
        System.out.print("Lütfen B-C-D sehirlerinden gitmek istediginiz sehri seciniz : ");
        char sehir = scan.next().toUpperCase().charAt(0);

        System.out.print("Tek yön bilet almak icin T´ye \nCift yön bilet almak icin C´ye basiniz.");
        char biletYön = scan.next().toUpperCase().charAt(0);

        System.out.print("Lütfen yasinizi giriniz : ");
        int yas = scan.nextInt();

        double ücretB = 500 * 0.10;
        double ücretC = 700 * 0.10;
        double ücretD = 900 * 0.10;

        if (sehir == 'B' || sehir == 'C' || sehir == 'D') {

            if (yas > 65) {
                if (sehir == 'B') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretB * 0.7 + " $");
                    } else if (biletYön == 'C') {  //4.if
                        System.out.println("Ödemeniz gereken miktar : " + (ücretB * 2 * 0.7) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }                       //3.if

                if (sehir == 'C') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretC * 0.7 + " $");
                    } else if (biletYön == 'C') {  //4.if
                        System.out.println("Ödemeniz gereken miktar : " + (ücretC * 2 * 0.7) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (sehir == 'D') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretD * 0.7 + " $");
                    } else if (biletYön == 'C') {  //4.if
                        System.out.println("Ödemeniz gereken miktar : " + (ücretD * 2 * 0.7) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }                       //3.if





            } else if (yas >= 12 && yas < 24) {
                if (sehir == 'B') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretB * 0.9 + " $");
                    } else if (biletYön == 'C') {
                        System.out.println("Ödemeniz gereken miktar : " + (ücretB * 2 * 0.7) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (sehir == 'C') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretC * 0.9 + " $");
                    } else if (biletYön == 'C') {
                        System.out.println("Ödemeniz gereken miktar : " + (ücretC * 2 * 0.9) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (sehir == 'D') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretD * 0.9 + " $");
                    } else if (biletYön == 'C') {
                        System.out.println("Ödemeniz gereken miktar : " + (ücretD * 2 * 0.9) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }





            } else if (yas < 12) {
                if (sehir == 'B') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretB * 0.5 + " $");
                    } else if (biletYön == 'C') {  //4.if
                        System.out.println("Ödemeniz gereken miktar : " + (ücretB * 2 * 0.5) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }                       //3.if

                if (sehir == 'C') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretC * 0.5 + " $");
                    } else if (biletYön == 'C') {  //4.if
                        System.out.println("Ödemeniz gereken miktar : " + (ücretC * 2 * 0.5) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (sehir == 'D') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretB * 0.5 + " $");
                    } else if (biletYön == 'C') {  //4.if
                        System.out.println("Ödemeniz gereken miktar : " + (ücretB * 2 * 0.5) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }                       //3.if





            } else if (yas >= 24 && yas <= 65) {
                if (sehir == 'B') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretB + " $");
                    } else if (biletYön == 'C') {  //4.if
                        System.out.println("Ödemeniz gereken miktar : " + (ücretB * 2) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }                       //3.if

                if (sehir == 'C') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretC + " $");
                    } else if (biletYön == 'C') {  //4.if
                        System.out.println("Ödemeniz gereken miktar : " + (ücretC * 2) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }

                if (sehir == 'D') {
                    if (biletYön == 'T') {
                        System.out.println("Ödemeniz gereken miktar : " + ücretB + " $");
                    } else if (biletYön == 'C') {  //4.if
                        System.out.println("Ödemeniz gereken miktar : " + (ücretB * 2) * 0.80 + " $");
                    } else System.out.println("Hatali giris yaptiniz");
                }
            }



        } else System.out.println("Girdiginiz sehire seferimiz bulunmamaktadir."); // 1.if


    } //main
}


