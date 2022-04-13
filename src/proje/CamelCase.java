package proje;

public class CamelCase {
    public static void main(String[] args) {

        String result =CamelCase("She loves use");

        System.out.println(result);


    }
     /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case
       input:
           I lIVe in uSa
      Result should be
           I Live In Usa
     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:
           I lIVe in uSa
      Result should be
           I Live In Usa
     */

    public static String CamelCase(String cumle){

        String[] cumleArray = cumle.split(" ");

        for (int i = 0; i < cumleArray.length; i++) {


            cumleArray[i] = cumleArray[i].substring(0, 1).toUpperCase() + cumleArray[i].substring(1).toLowerCase();
            // Bu satir ile once cumlenin tammani aldik ve kucuk harfe cevirdik,
            // ardindan ilk harflerini buyuk harfe cevirdik

        }
        return String.join(" ", cumleArray);
        // Burasi Array'i bize  String olarak geri veriyor ve cumle haline gatiriyor.
        // Array'in elemanlarini birlestiriyor.

    }
}

