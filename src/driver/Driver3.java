package driver;

import java.util.Scanner;
import model.Model3;

public class Driver3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Model3 model = new Model3();

        // Input nama
        System.out.print("Nama Pemesan: ");
        String nama = input.nextLine();

        // Jumlah menu
        System.out.print("Jumlah jenis pesanan: ");
        int n = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[n];
        int[] jumlah = new int[n];

        // Input pesanan
        for (int i = 0; i < n; i++) {
            System.out.print("Menu ke-" + (i+1) + ": ");
            pesanan[i] = input.nextLine();

            System.out.print("Jumlah: ");
            jumlah[i] = input.nextInt();
            input.nextLine();
        }

        // Input catatan
        System.out.print("Catatan: ");
        String catatan = input.nextLine();

        // Proses total
        int total = model.hitungTotal(pesanan, jumlah);

        // Output
        System.out.println("\n===== STRUK CAFE IT DEL =====");
        System.out.println("Nama       : " + nama);
        System.out.println("Pesanan    :");

        for (int i = 0; i < n; i++) {
            System.out.println("- " + pesanan[i] + " x" + jumlah[i]);
        }

        System.out.println("Catatan    : " + catatan);
        System.out.println("Total Harga: " + total);

        input.close();
    }
}