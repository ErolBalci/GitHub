package SoruÇözümleri;

import java.util.Arrays;
import java.util.Scanner;

public class C04_GitHubDeneme {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Kullanicidan iki farkli data turunde array olusturmasini isteyin.Sectigi data turune gore olusturulacak arrayin
        //uzunlugunu ve elementlerini  kullanicidan alip, Arrayi ve kac element girdigini yazdiran bir method olusturunuz.

        arraySeç();

    }

    public static void arraySeç() {
        int seçimSayısı = 0;
        while (seçimSayısı != 2) {
            System.out.println("Lütfen oluşturmak istediğiniz arrayin data türünü seçiniz :" +
                    "\n1- int \n2- String");
            int seçim = scanner.nextInt();
            switch (seçim) {
                case 1:
                    intArrayOluştur();
                    break;
                case 2:
                    StringArrayOluştur();
                    break;
                default:
                    System.out.println("Hatalı giris yaptınız");
            }
            seçimSayısı++;
        }
    }

    public static void StringArrayOluştur() {
        System.out.print("Ouşturacağınız String Arrayin uzunluğunu giriniz.");
        int uzunluk = scanner.nextInt();
        int sayaç = 0;
        if (uzunluk <= 0 || uzunluk >= 10) {
            System.out.print("Arrayin uzunluğu 0-10 arası olmalıdır.");
        } else {
            String[] kelimeler = new String[uzunluk];
            for (int i = 0; i < kelimeler.length; i++) {
                System.out.print((i + 1) + ". elemanı giriniz: ");
                String input = scanner.next();
                kelimeler[i] = input;
                sayaç++;
            }
            System.out.println();
            System.out.println("Girilen " + sayaç + " adet eleman ile oluşturulan array: " + Arrays.toString(kelimeler));

        }
    }

    public static void intArrayOluştur() {
        System.out.print("Ouşturacağınız İnt Arrayin uzunluğunu giriniz.");
        int uzunluk = scanner.nextInt();
        int sayaç = 0;
        if (uzunluk <= 0 || uzunluk >= 10) {
            System.out.print("Arrayin uzunluğu 0-10 arası olmalıdır.");
        } else {
            int[] arr = new int[uzunluk];
            for (int i = 0; i < arr.length; i++) {
                System.out.print((i + 1) + ". elemanı giriniz: ");
                int girilenElement = scanner.nextInt();
                arr[i] = girilenElement;
                sayaç++;
            }
            System.out.println();
            System.out.println("Girilen " + sayaç + " adet eleman ile oluşturulan array: " + Arrays.toString(arr));

        }

    }
}
