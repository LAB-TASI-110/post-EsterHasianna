package model;

public class Model2 {

    public int getStokByKategori(int[] data, String kategori) {

        if (kategori.equalsIgnoreCase("Dasi SD")) {
            return data[0];
        } 
        else if (kategori.equalsIgnoreCase("Gula")) {
            return data[1];
        } 
        else if (kategori.equalsIgnoreCase("Rok Pramuka")) {
            return data[2];
        } 
        else if (kategori.equalsIgnoreCase("Minyak")) {
            return data[3];
        }

        return 0;
    }
}