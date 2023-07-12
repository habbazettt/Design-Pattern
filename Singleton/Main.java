public class Main {
    public static void main(String[] args) {
        ManajerPesanan manajerPesanan = ManajerPesanan.getInstance();

        // Menambah Pesanan
        Pesanan P1 = new Pesanan(1, "Rizky", 100.0);
        Pesanan P2 = new Pesanan(2, "Budi", 150.0);
        Pesanan P3 = new Pesanan(3, "Cecep", 200.0);

        manajerPesanan.tambahPesanan(P1);
        manajerPesanan.tambahPesanan(P2);
        manajerPesanan.tambahPesanan(P3);

        // Display Pesanans
        manajerPesanan.tampilanPesanans();

        // Remove an Pesanan
        manajerPesanan.hapusPesanan(2);

        // Display Pesanans after removal
        manajerPesanan.tampilanPesanans();
    }
}
