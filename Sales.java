public class Sales extends Pegawai{
    private double komisi;
    private int penjualan;

    public Sales(String nama, String noKTP, double komisi, int penjualan) {
        super(nama, noKTP);
        this.komisi = komisi;
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public double gaji() {
        return komisi * penjualan;
    }
}
