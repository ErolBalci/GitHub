package SoruÇözümleri;

import java.util.Scanner;

public class C03 {

    static String kelimeson = "";

    public static void main(String[] args) {
        /*Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
   	 baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
    	 bir method olusturun.
        - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
            mesaji verin
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin.*/

        String kelime = "Java çalışmak çok heyecanlı";
        yazdır(kelime);
        System.out.println(kelimeson);
    }

    private static void yazdır(String kelime) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen başlangıç indexini giriniz");
        int başlangıç = scanner.nextInt();
        System.out.println("Lütfen bitiş indexini giriniz");
        int bitiş = scanner.nextInt();
        if (başlangıç > bitiş) {
            System.out.println("Başlangıç indexi bitiş indexinden büyük olmamalı");
        } else if (kelime.length() - 1 < başlangıç || bitiş > kelime.length() - 1) {
            System.out.println("Girilen index kelimenin sınırları içinde olmalı");

        } else {
            for (int i = başlangıç; i < bitiş; i++) {
                kelimeson += kelime.charAt(i);

            }

        }

    }
}
