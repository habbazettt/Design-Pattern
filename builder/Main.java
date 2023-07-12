package builder;

public class Main {
    public static void main(String[] args) {
        PembangunPesanan pembangunPesanan = new PembangunPesananCepat();
        DirekturPesananMakanan direkturPesanan = new DirekturPesananMakanan(pembangunPesanan);

        direkturPesanan.bangunPesanan();
        PesananMakanan pesananMakanan = pembangunPesanan.getPesananMakanan();
        pesananMakanan.tampilkanPesanan();
    }
}
