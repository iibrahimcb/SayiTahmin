import java.util.Random;
import java.util.Scanner;

public class AnaClass {
    public static void main(String[] args) {
        int tahmin, can = 3, i = 0;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int sayi = rand.nextInt(100);
        boolean oyunDurum = false, hata = false;
        int[] tahminler = new int[3];

        System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz..!!!");
        System.out.println("0-100 arasında bir sayı tuttum.");

        while (can > 0) {
            System.out.print("Tahmininiz : ");
            try {
                tahmin = scan.nextInt();
                if (tahmin < 0 || tahmin > 100) {
                    if (hata) {
                        System.out.println("Yanlış Tahmin 1 can kaybettiniz.");
                        System.out.println("Kalan Can : " + --can);
                    } else {
                        hata = true;
                        System.out.println("Lütfen 0-100 arası bir sayı giriniz.");
                    }
                    continue;
                }
                if (tahmin == sayi) {
                    oyunDurum = true;
                    break;
                } else {
                    System.out.println("Yanlış, tekrar deneyiniz! Kalan Can : " + --can);
                }
            } catch (Exception e) {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                scan.next();
                continue;
            }
        }
        if (oyunDurum) {
            System.out.println("Tebrikler! Doğru Tahmin !");
            System.out.println("Sayı : " + sayi);
            System.out.println("Kalan Can : " + can);
        } else {
            System.out.println("Hakkınız kalmadı! Sayı : " + sayi);
        }
        scan.close();
    }
}
