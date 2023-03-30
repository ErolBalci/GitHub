package SoruÇözümleri;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C02_ArraydeElemanlarArasıFarkBulma {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en
       büyük öğeler arasındaki farkı yazdiran bir metod olusturunuz

         */


        farkıBul();

    }

    private static void farkıBul() {
        System.out.println("Kaç adet sayı gireceksiniz ");
        int adet = scanner.nextInt();
        int[] sayılar = new int[adet];

        for (int i = 1; i <= sayılar.length; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayılar[i - 1] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(sayılar));
        Arrays.sort(sayılar);
        System.out.println(Arrays.toString(sayılar));
        System.out.println(sayılar[sayılar.length-1]- sayılar[0]);

    }
}
