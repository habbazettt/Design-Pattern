public class Pesanan {
    private int PesananId;
    private String namaPelanggan;
    private double jumlahTotal;

    public Pesanan(int PesananId, String namaPelanggan, double jumlahTotal) {
        this.PesananId = PesananId;
        this.namaPelanggan = namaPelanggan;
        this.jumlahTotal = jumlahTotal;
    }

    public int getPesananId() {
        return PesananId;
    }

    public void setPesananId(int PesananId) {
        this.PesananId = PesananId;
    }

    public String getnamaPelanggan() {
        return namaPelanggan;
    }

    public void setnamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public double getjumlahTotal() {
        return jumlahTotal;
    }

    public void setjumlahTotal(double jumlahTotal) {
        this.jumlahTotal = jumlahTotal;
    }
}
