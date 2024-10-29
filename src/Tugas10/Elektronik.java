package Tugas10;

class Elektronik implements Pembayaran {

    @Override

    public double hitungPajak(double harga) {

        return 0.10 * harga; // Pajak 10% untuk elektronik

    }

}
