package driver;

import java.util.Scanner;
import model.Model2;

public class Driver2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Model2 model = new Model2();

        int N = input.nextInt();
        int[] data = new int[N];

        for (int i = 0; i < N; i++) {
            data[i] = input.nextInt();
        }

        input.nextLine();
        String kategori = input.nextLine();

        int hasil = model.getStokByKategori(data, kategori);

        System.out.println("Total stok kategori " + kategori + " = " + hasil);

        input.close();
    }
}