package model;

import java.util.HashMap;

public class Model1 {

    private HashMap<String, Integer> ongkir;

    public Model1() {
        ongkir = new HashMap<>();

        // Data ongkir per kg (bisa kamu sesuaikan dengan gambar soal)
        ongkir.put("MDN", 10000);
        ongkir.put("JKT", 15000);
        ongkir.put("BLG", 12000);
    }

    // Ambil ongkir per kg berdasarkan kota
    public int getOngkir(String kota) {
        return ongkir.getOrDefault(kota, 0);
    }

    // Hitung total berat
    public int hitungTotalBerat(int beratButet, int beratUcok) {
        return beratButet + beratUcok;
    }

    // Hitung total ongkir
    public int hitungTotalOngkir(String kota, int totalBerat) {
        return getOngkir(kota) * totalBerat;
    }

    // Tentukan promo
    public String getPromo(int totalBerat) {
        if (totalBerat >= 8) {
            return "Diskon 10%";
        } else if (totalBerat >= 5) {
            return "Diskon 5%";
        } else {
            return "Tidak ada promo";
        }
    }

    // Hitung diskon
    public double hitungDiskon(String promo, int totalOngkir) {
        if (promo.equals("Diskon 10%")) {
            return totalOngkir * 0.10;
        } else if (promo.equals("Diskon 5%")) {
            return totalOngkir * 0.05;
        }
        return 0;
    }
}