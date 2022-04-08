package proje;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class  GetPopulation {
     /*
        Method name is populationOfCountry
        This method will get 1 String array(countryNames) 1 int array (countryPopulations) and 1 String (str)
        countryNames is Country names
        countryPopulations is Country population
        if str is contained in the countryNames return the population
        For example:
        countryNames = {"USA" ,"Mexico" ,"Canada"}
        countryPopulations = {100000 , 120000 , 130000}
        str = "Mexico"
        return should be 120000
        NOTE : if str is not in the countryNames array return -1
     */


    /*
    Method adı populationOfCountry
    Bu method  String array(countryNames) ,  int array (countryPopulations) ve   String (str) alacak
     countryNames : Ülke isimleri
     countryPopulations: Ülke nüfusları
      Eğer str Ülke isimleri içeriyorsa  Ülke nüfusunu return et
      Ornegin;
        countryNames = {"USA" ,"Mexico" ,"Canada"}
        countryPopulations = {100000 , 120000 , 130000}
        str = "Mexico"
        return 120000 olmali
        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali
     */

    public static void main(String[] args) {

<<<<<<< HEAD

    }
}


=======
        Scanner scan=new Scanner(System.in);
        System.out.println("ulke adini giriniz");
        String str=scan.nextLine();

        String[] countryNames = {"USA", "Mexico", "Canada"};
        int[] countryPopulations = {100000, 120000, 130000};


        int sonuc=populationOfCountry(countryNames,countryPopulations,str);
        System.out.println(sonuc);


    }

    private static int populationOfCountry(String [] countryNames, int[] countryPopulations, String str) {


        int population = 0;

        for (int i = 0; i < countryNames.length; i++) {

            if (str.equalsIgnoreCase(countryNames[i])) {

                population = countryPopulations[i];
                break;

            } else {
                population = -1;
            }

        }
        return population;
    }
}



>>>>>>> Ebru
