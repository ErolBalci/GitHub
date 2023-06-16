package SoruÇözümleri;

import java.util.Scanner;

public class StringiTerseCevirme {

    public static void main(String[] args) {
        // Verilen bir String'in Palindrome olup olmadigini yazdirin
        // Palindrome : duzden ve tersten ayni sekilde yazilan
        // madam, 12321, kabak

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");

        String metin = scan.nextLine();
        String tersMetin = stringTersineCevir(metin);

        if (metin.equals(tersMetin)) { System.out.println("Girilen metin PALINDROME");}
        else { System.out.println("Girilen metin PALINDROME degil"); }
    }

    public static String stringTersineCevir(String metin) {
        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {

            tersMetin += metin.charAt(i); }
        return tersMetin;
    }
    }
