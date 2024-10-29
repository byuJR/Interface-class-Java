package Tugas10;

public class Main {

    public static void main(String[] args) {

        Elektronik elektronik = new Elektronik();

        Makanan makanan = new Makanan();


        double hargaElektronik = 5000000; // Misalnya harga elektronik 1.000.000

        double hargaMakanan = 25000; // Misalnya harga makanan 50.000


        System.out.println("Pajak Elektronik: Rp " + elektronik.hitungPajak(hargaElektronik));

        System.out.println("Pajak Makanan: Rp " + makanan.hitungPajak(hargaMakanan));

    }

}
