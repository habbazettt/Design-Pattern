package builder;

public class PesananMakanan {
    private String jenisMakanan;
    private String minuman;
    private String catatanKhusus;

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public void setMinuman(String minuman) {
        this.minuman = minuman;
    }

    public void setCatatanKhusus(String catatanKhusus) {
        this.catatanKhusus = catatanKhusus;
    }

    public void tampilkanPesanan() {
        System.out.println("Jenis Makanan: " + jenisMakanan);
        System.out.println("Minuman: " + minuman);
        System.out.println("Catatan Khusus: " + catatanKhusus);
    }
}
