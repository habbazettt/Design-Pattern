package builder;

public class PembangunPesananCepat implements PembangunPesanan {
    private PesananMakanan pesananMakanan;

    public PembangunPesananCepat() {
        this.pesananMakanan = new PesananMakanan();
    }

    @Override
    public void setJenisMakanan(String jenisMakanan) {
        pesananMakanan.setJenisMakanan(jenisMakanan);
    }

    @Override
    public void setMinuman(String minuman) {
        pesananMakanan.setMinuman(minuman);
    }

    @Override
    public void setCatatanKhusus(String catatanKhusus) {
        pesananMakanan.setCatatanKhusus(catatanKhusus);
    }

    @Override
    public PesananMakanan getPesananMakanan() {
        return pesananMakanan;
    }
}
