package builder;

public interface PembangunPesanan {
    void setJenisMakanan(String jenisMakanan);
    void setMinuman(String minuman);
    void setCatatanKhusus(String catatanKhusus);
    PesananMakanan getPesananMakanan();
}
