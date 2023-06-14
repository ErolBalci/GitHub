package SoruÇözümleri;

import java.util.Scanner;

public class C06_meslekTanitim{
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı Soyadınız: ");
        String name = scanner.nextLine();

        System.out.print("Yaşınız: ");
        int age = scanner.nextInt();

        // satırsonu arabellekte kalan karakteri kullanalım. Alttaki satırı yoruma alarak çalıştırın sorunu görün
        scanner.nextLine();

        System.out.printf("Mesleğiniz nedir?");
        String job = scanner.nextLine();

        System.out.printf("Güzel bir meslek: " + job);

        scanner.close();


    }
}