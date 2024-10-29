package Praktikum10;

public class Main {

    public static void main(String[] args) {

        // Membuat objek Penjumlahan

        OperasiHitung penjumlahan = new Penjumlahan();

        // Melakukan operasi penjumlahan dan mencetak hasilnya

        System.out.println("Penjumlahan: " + penjumlahan.hitung(10, 5)); // Output: 15


        // Membuat objek Pengurangan

        OperasiHitung pengurangan = new Pengurangan();

        // Melakukan operasi pengurangan dan mencetak hasilnya

        System.out.println("Pengurangan: " + pengurangan.hitung(10, 5)); // Output: 5

    }

}