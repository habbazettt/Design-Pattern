package builder;

public class DirekturPesananMakanan {
    private PembangunPesanan pembangunPesanan;

    public DirekturPesananMakanan(PembangunPesanan pembangunPesanan) {
        this.pembangunPesanan = pembangunPesanan;
    }

    public void bangunPesanan() {
        pembangunPesanan.setJenisMakanan("Nasi Goreng");
        pembangunPesanan.setMinuman("Jus");
        pembangunPesanan.setCatatanKhusus("Tidak Pakai Acar");
    }
}
