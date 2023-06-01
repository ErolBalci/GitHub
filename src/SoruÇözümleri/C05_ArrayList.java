package SoruÇözümleri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C05_ArrayList {
    public static void main(String[] args) {
        //Soru 1- Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan kismini
        // list olarak bize donduren bir method olusturunuz.

        List<String> liste = kullaniciyaListOlusturtma();
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kullanilmasini istemediginiz bir harf girin");
        String istenmeyenHarf = scan.next().substring(0,1);


        List<String> ayiklanmisList =istenmeyenHarfIcerenleriSil(liste,istenmeyenHarf);

        System.out.println(ayiklanmisList);
    }

    public static List<String> istenmeyenHarfIcerenleriSil(List<String> liste, String istenmeyenHarf) {

        // mesela listemiz ali, veli, ayse, fatma ve istenmeyen harf a
        // for loop ile elementleri ele alirken remove yaparsak
        // list'in uzunlugu degisecegi icin sorun yasariz
        // farkli bir list olusturup, silinmeyecekleri yeni listeye kaydedelim

        List<String> kalanlarListesi = new ArrayList<>();

        for (int i = 0; i < liste.size() ; i++) {

            if (!liste.get(i).contains(istenmeyenHarf)){
                kalanlarListesi.add(liste.get(i));
            }
        }

        return kalanlarListesi;
    }
    public static List<String> kullaniciyaListOlusturtma(){

        List<String> isimler = new ArrayList<>();
        String girilenisim="";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Listeye eklenmek icin bir isim girin" +
                    "\nBitirmek icin Q'ya basin");
            girilenisim = scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")){
                isimler.add(girilenisim);
            }

        }while(!girilenisim.equalsIgnoreCase("Q"));

        return isimler;

    }}
