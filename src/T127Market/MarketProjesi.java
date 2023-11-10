package T127Market;

import java.util.ArrayList;
import java.util.Scanner;

public class MarketProjesi {
    public static void main(String[] args) {
        ArrayList<Urun> sepet = new ArrayList<Urun>();
        double toplamFiyat = 0.0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ürün ismi girin (Çıkış için 'q' tuşuna basın): ");
            String urunIsmi = scanner.nextLine();

            if (urunIsmi.equals("q")) {
                break;
            }

            System.out.print("Fiyatı girin: ");
            double fiyat = scanner.nextDouble();
            System.out.print("Miktarı girin: ");
            int miktar = scanner.nextInt();
            scanner.nextLine(); // Boş satırı oku

            Urun urun = new Urun(urunIsmi, fiyat, miktar);
            sepet.add(urun);

            double urunToplami = fiyat * miktar;
            toplamFiyat += urunToplami;

            System.out.println(urunIsmi + " ürünü sepete eklendi. Toplam fiyat: " + urunToplami);
        }

        // Fiş yazdırma
        System.out.println("\n--- Fiş ---");
        for (Urun urun : sepet) {
            System.out.println(urun.isim + " - Fiyat: " + urun.fiyat + " TL - Miktar: " + urun.miktar);
        }
        System.out.println("Toplam Fiyat: " + toplamFiyat + " TL");

        scanner.close();
    }
}
