package marketSorusu;

import java.util.ArrayList;
import java.util.List;

public class ÜrünlerList {
    public int no;
    public double fiyat;
    public String ürün;
    static List<ÜrünlerList> ürünListesi = new ArrayList<ÜrünlerList>();
    static ÜrünlerList domates = new ÜrünlerList(0, 2.10, "domates");
    static ÜrünlerList patates = new ÜrünlerList(1, 3.20, "patates");
    static ÜrünlerList biber = new ÜrünlerList(2, 1.50, "biber");
    static ÜrünlerList sogan = new ÜrünlerList(3, 2.30, "sogan");
    static ÜrünlerList havuc = new ÜrünlerList(4, 3.10, "havuc");




    public ÜrünlerList() {
    }

    public ÜrünlerList(int no, double fiyat, String ürün) {
        this.no = no;
        this.fiyat = fiyat;
        this.ürün = ürün;
    }




    @Override
    public String toString() {
        return "ÜrünlerList{" +
                "no=" + no +
                ", fiyat=" + fiyat +
                ", ürün='" + ürün + '\'' +
                '}';
    }
}
