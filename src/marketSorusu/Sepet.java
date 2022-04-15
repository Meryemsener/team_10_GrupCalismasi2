package marketSorusu;

import java.util.ArrayList;
import java.util.List;

public class Sepet extends Market {
    static List<String> ürünlersepet=new ArrayList<>();



    public Sepet(List<ÜrünlerList>ürünListesi, String ürün) {
        ürünlersepet.add(ürün);
        System.out.println("sepetinizde "+ürünlersepet+" var");







    }
}
