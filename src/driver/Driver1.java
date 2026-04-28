package driver;

import java.util.Scanner;
import model.Model1;

public class Driver1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Model1 model = new Model1();

        // Input sesuai soal
        String kotaButet = input.nextLine();
        int beratButet = input.nextInt();
        input.nextLine();

        String kotaUcok = input.nextLine();
        int beratUcok = input.nextInt();
        input.nextLine();

        String kotaTambahan = input.nextLine(); // BLG (tidak dipakai)
        String end = input.nextLine(); // END

        // Proses
        int totalBerat = model.hitungTotalBerat(beratButet, beratUcok);
        int ongkirPerKg = model.getOngkir(kotaButet);
        int totalOngkir = model.hitungTotalOngkir(kotaButet, totalBerat);

        String promo = model.getPromo(totalBerat);
        double diskon = model.hitungDiskon(promo, totalOngkir);
        double totalBayar = totalOngkir - diskon;

        // Output
        System.out.println("===== STRUK PEMBAYARAN =====");
        System.out.println("Kota Tujuan     : " + kotaButet);
        System.out.println("Berat Butet     : " + beratButet + " kg");
        System.out.println("Berat Ucok      : " + beratUcok + " kg");
        System.out.println("Total Berat     : " + totalBerat + " kg");
        System.out.println("Total Ongkir    : " + totalOngkir);
        System.out.println("Promo           : " + promo);
        System.out.println("Total Bayar     : " + totalBayar);
    }
}