package model;

import java.util.HashMap;

public class Model3 {

    private HashMap<String, Integer> menu;

    public Model3() {
        menu = new HashMap<>();

        // Daftar menu & harga
        menu.put("GORENGAN", 1000);
        menu.put("MIE", 8000);
        menu.put("NASI", 10000);
        menu.put("JUS", 5000);
        menu.put("COFFEE", 7000);
        menu.put("TEH", 3000);
    }

    // Ambil harga menu
    public int getHarga(String namaMenu) {
        return menu.getOrDefault(namaMenu.toUpperCase(), 0);
    }

    // Hitung total harga
    public int hitungTotal(String[] pesanan, int[] jumlah) {
        int total = 0;

        for (int i = 0; i < pesanan.length; i++) {
            int harga = getHarga(pesanan[i]);
            total += harga * jumlah[i];
        }

        return total;
    }
}