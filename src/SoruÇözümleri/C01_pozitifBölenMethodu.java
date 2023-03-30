package SoruÇözümleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_pozitifBölenMethodu {

            static int sayaç=0;

    public static void main(String[] args) {

        /*Kullanicidan main method icinde bir tamsayi alin.Girilen sayinin pozitif tam bolenlerinin sayisini ve tam bolenleri iceren
        listeyi bize donduren bir method olusturun.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Pozitif bölenleri bulunacak bir sayı giriniz");
        int girilenSayı = scan.nextInt();
        pozitifBölenleriniBul(girilenSayı);
        System.out.println(pozitifTamBölenlerininListesi);
        System.out.println("Girilen sayının pozitif tam bölenleri sayısı:" +sayaç);
    }
    public static List<Integer> pozitifTamBölenlerininListesi = new ArrayList<>();
    private static List<Integer> pozitifBölenleriniBul(int girilensayı) {
        for (int i = 1; i <= girilensayı; i++) {
            if (girilensayı % i == 0) {
                pozitifTamBölenlerininListesi.add(i);
                sayaç++;
            }
        }
        return pozitifTamBölenlerininListesi;
    }
}



