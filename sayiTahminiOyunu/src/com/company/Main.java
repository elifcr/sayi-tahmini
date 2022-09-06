package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner giris = new Scanner(System.in);
    int tahmin, can = 5, i=0;
    Random rand = new Random();
    int sayi = rand.nextInt(100);
    boolean oyunDurum = false, hata = false;
    int [] tahminler = new int[5];

    System.out.println(sayi);
    System.out.println("Sayı tahmin etme oyununa hoşgeldiniz! ");
    System.out.println("0-99 arasında bir sayı tutun. ");

    while (can > 0) {
        System.out.print("Tahmininiz: ");
        tahmin = giris.nextInt();

        if (tahmin < 0 || tahmin > 99) {
            if (hata) {
                System.out.println("Çok fazla hatalı giriş yaptınız. Bir can kaybettiniz.");
                System.out.println("Kalan Can: " + --can);
            } else {
                hata = true;
                System.out.println("Lütfen 0-99 arasıda bir sayı giriniz!");
                continue;
            }
        }
        tahminler[i++] = tahmin;
        if (tahmin == sayi) {
            oyunDurum = true;
            break;
        } else {
            System.out.println("Yanlış, tekrar deneyiniz! Kalan can: " + --can);
        }
    }
    if(oyunDurum){
        System.out.println("Tebrikler Doğru Tahmin!");
        System.out.println("Sayınız: " + sayi);
        System.out.println("Kalan can: "+ can);
    }else{
        System.out.println("Başaramadınız! ");
    }
    System.out.print("Tahminleriniz: ");
    for (int value : tahminler) {
        if (value != 0)
            System.out.print(value + ",");

    }

    }
}
