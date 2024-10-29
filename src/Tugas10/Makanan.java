package Tugas10;

class Makanan implements Pembayaran {

    @Override

    public double hitungPajak(double harga) {

        return 0.05 * harga; // Pajak 5% untuk makanan

    }

}
