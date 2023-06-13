package SoruÇözümleri;

public class StringBuilder {

    public static void main(String[] args) {

        java.lang.StringBuilder sb1 = new java.lang.StringBuilder("Java");
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Java");
        String str = "Java";

        // System.out.println(sb1 == str); Java'da farkli data turune sahip non-primitive objeler == ile KARSILASTIRILAMAZ

        System.out.println(sb1 == sb2); // false
        System.out.println(sb1 == sb1); // true

        System.out.println(sb1.equals(sb2)); // false
        /* StringBuilder'da icerik ayni olsa bile equals method'u false doner. Cunku StringBuilder Class'inda equals method'u yoktur
        equals method'unu parent class'i olan Object Class'indan kullanir ve bundan dolayi iceriklere bakmadan false verir */

        System.out.println(sb1.equals(str)); // false
        System.out.println(sb1.equals(sb1)); // true

        // iki StringBuilder'in iceriklerinin ayni oldugunu kontrol etmek icin compareTo() kullanilir

        System.out.println(sb1.compareTo(sb2)); // 0
        // System.out.println(sb1.compareTo(str)); CTE

        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Hava");
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Hara");

        System.out.println(sb1.compareTo(sb3)); // 2
        System.out.println(sb1.compareTo(sb4)); // 2
        System.out.println(sb3.compareTo(sb4)); // 4
        System.out.println(sb4.compareTo(sb3)); // -4


        /*
            CompareTo() karsilastirilan StringBuilder'lar ayni metne sahipse 0 doner Ayni degilse, bastan itibaren kontrole baslar
            farkli olan ilk harfin karsilastirilan kelimedeki ayni index'deki harften kac harf ilerde oldugunu dondurur   */


    }
}