package T127Market;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Wise_T127_MARKET {
    static Scanner scan = new Scanner(System.in);
    static String urunAdi = "";
    static int urunKodu;
    static double urunFiyati;
    static int urunMiktari;
    static double toplam;
    static String sepet = "";
    static boolean ekUrun = false;


    public static void main(String[] args) {
        Urun urun = new Urun(urunAdi, urunFiyati, urunMiktari);
        double urunToplami = urunFiyati * urunMiktari;
        toplam += urunToplami;

           /*
   *
  ==================== WISE T127 MARKET ===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV ÜRÜNLERİ
  3 MARKET ÜRÜNLERİ
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin
  6-sonunda fis yazdırsın
    */
        girisEkrani();

    }

    private static void girisEkrani() {
        System.out.println("==================== WISE T127 MARKET ===================================");
        System.out.println("================== H O Ş G E L D İ N İ Z  =================================");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz!");
        System.out.println("1_Manav Ürünleri için \n2_Şarküteri Ürünleri için \n3_Market Ürünleri için \n4_Fiş Yazdırmak için \n5_Çıkış yapmak için ");
        int secim = scan.nextInt();
        if (!(secim >= 1 && secim <= 5)) {
            System.out.println("Yanlış bir giriş yaptınız. Tekrar deneyiniz!");
            girisEkrani();
        } else {
            switch (secim) {
                case 1:
                    manav();
                    break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();
                    break;
                default:
            }
        }
    }



    private static void cikis() {

        System.out.println("------- Çıkış Yapılıyor -------");
        System.out.println("Bizi Tercih ettiginiz icin Tesekkür ederiz");
    }


    private static void fisYazdir() {


        System.out.println("------- Fiş Yazdırılıyor -------");
        System.out.println("Alisverisinizde bizi tercih ettiginiz icin Tesekkürler");
        System.out.println(sepet);
        System.out.println(" ");
        System.out.println("Toplam alisveris tutari: " + toplam);
        int odeme = scan.nextInt();
        if (odeme < toplam) {
            System.out.println("ödeme yetersiz");
        } else {
            System.out.println("ödenen Tutar:" + odeme +
                    "\nPara üstü:" + (toplam - odeme));
        }
        LocalDateTime saat = LocalDateTime.now();
        System.out.println(saat);
        System.out.println("iyi günler dileriz");
        cikis();


    }

    private static void market() {
        System.out.println("------- Market Reyonuna Hoşgeldiniz -------");
        System.out.println("Lütfen almak istediginiz ürün kodunu(UK) girin");
        System.out.println("\n 31_Nutella Fiyati:109₺ \n32_ Pirinc Fiyati:40₺ \n33_Makarna Fiyati:12₺ \n34_sampuan Fiyati:60₺ \n35_Mercimek Fiyati:45₺ ");
        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 31 && urunKodu <= 35) {
                System.out.println("ne kadar alacaksiniz?");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 31:
                        urunAdi = "Nutella";
                        urunFiyati = 109;
                        System.out.println(urunMiktari + "adet" + urunAdi + ":" + (urunMiktari * urunFiyati) + "Tl dir");
                        break;
                    case 32:
                        urunAdi = "Pirinc";
                        urunFiyati = 40;
                        System.out.println(urunMiktari + "adet" + urunAdi + ":" + (urunMiktari * urunFiyati) + "Tl dir");
                        break;
                    case 33:
                        urunAdi = "makarna";
                        urunFiyati = 12;
                        System.out.println(urunMiktari + "adet" + urunAdi + ":" + (urunMiktari * urunFiyati) + "Tl dir");
                        break;
                    case 34:
                        urunAdi = "sampuan";
                        urunFiyati = 60;
                        System.out.println(urunMiktari + "adet" + urunAdi + ":" + (urunMiktari * urunFiyati) + "Tl dir");
                        break;
                    case 35:
                        urunAdi = "mercimek";
                        urunFiyati = 45;
                        System.out.println(urunMiktari + "adet" + urunAdi + ":" + (urunMiktari * urunFiyati) + "Tl dir");
                        break;

                }
                urunFiyati = urunFiyati * urunMiktari;
                toplam += urunFiyati;
                System.out.println("sepet tutari"+ toplam);
                sepet += urunAdi + " :" + urunFiyati + "Tl";
                System.out.println("baska urun almak isterseniz urun Kodunu giriniz.\nAna menuye dönmek icin 0 tusuna basin");
            } else if ((urunKodu == 0)) {
                girisEkrani();

            }
        }
    }

    private static void sarkuteri() {
        System.out.println("------- Şarküteri Reyonuna Hoşgeldiniz -------");

        System.out.println("Lütfen almak istediğiniz ürünün ürün ürün kodunu giriniz!");
        System.out.println("21_Kiyma Fiyatı: 250₺ : \n22_Peynir Fiyatı: 400₺  \n23_süt Fiyatı:120₺  \n24_Yumurta Fiyatı: 90₺ \n25_yogurt Fiyatı: 150₺ ");

        while (!ekUrun) {
            urunKodu = scan.nextInt();
            if (urunKodu >= 21 && urunKodu <= 25) {
                System.out.println("Kaç kg alacaksınız: ");
                urunMiktari = scan.nextInt();

                switch (urunKodu) {
                    case 21:
                        urunAdi = "Kiyma";
                        urunFiyati = 250.0;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;

                    case 22:
                        urunAdi = "Peynir";
                        urunFiyati = 400.0;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;

                    case 23:
                        urunAdi = "sut";
                        urunFiyati = 120.0;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;

                    case 24:
                        urunAdi = "Yumurta";
                        urunFiyati = 90;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;

                    case 25:
                        urunAdi = "Yogurt";
                        urunFiyati = 150;
                        System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                        break;

                }
                urunFiyati = urunMiktari * urunFiyati;
                toplam += urunFiyati;
                System.out.println(toplam);
                sepet += urunAdi + "Fiyati:" + urunFiyati + "₺";
                System.out.println("baska bir urun almak isterseniz lütfen kodunu giriniz.\n ana menuye dönmek icin 0 tusuna basin");

            } else if ((urunKodu == 0)) {
                girisEkrani();

            }
        }
    }

        private static void manav(){

            System.out.println("------- Manav Reyonuna Hoşgeldiniz -------");
            System.out.println("Lütfen almak istediğiniz ürünün ürün ürün kodunu giriniz!");
            System.out.println("11_Elma Fiyatı: 25₺ : \n12_Yerli Muz Fiyatı: 40₺  \n13_Domates Fiyatı: 20₺  \n14_Çilek Fiyatı: 100₺ \n15_Karnabahar Fiyatı: 60₺ ");

            while (!ekUrun) {
                urunKodu = scan.nextInt();
                if (urunKodu >= 11 && urunKodu <= 15) {
                    System.out.print("Kaç kg alacaksınız: ");
                    urunMiktari = scan.nextInt();
                    switch (urunKodu) {
                        case 11:
                            urunAdi = "Elma";
                            urunFiyati = 25;
                            System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                            break;

                        case 12:
                            urunAdi = "yerli muz";
                            urunFiyati = 40;
                            System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                            break;

                        case 13:
                            urunAdi = "domates";
                            urunFiyati = 20;
                            System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                            break;

                        case 14:
                            urunAdi = "cilek";
                            urunFiyati = 100;
                            System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                            break;

                        case 15:
                            urunAdi = "Karnabahar";
                            urunFiyati = 60;
                            System.out.println(urunMiktari + "kg " + urunAdi + " fiyatı: " + urunFiyati * urunMiktari + " Tl'dir");
                            break;
                    }
                        urunFiyati = urunFiyati * urunMiktari;
                        toplam += urunFiyati;
                        System.out.println("sepet tutari :" + toplam);
                        sepet += urunAdi + ":" + urunFiyati + "Tl";
                        System.out.println("baska urun almak isterseniz urun Kodunu giriniz.\nAna menuye dönmek icin 0 tusuna basin");
                    } else if ((urunKodu == 0)) {
                    girisEkrani();
                }
                }

            }

        }


