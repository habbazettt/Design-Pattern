import java.util.ArrayList;
import java.util.List;

public class ManajerPesanan {
    private static ManajerPesanan instance;
    private List<Pesanan> pesanans;

    private ManajerPesanan() {
        pesanans = new ArrayList<>();
    }

    public static ManajerPesanan getInstance() {
        if (instance == null) {
            synchronized (ManajerPesanan.class) {
                if (instance == null) {
                    instance = new ManajerPesanan();
                }
            }
        }
        return instance;
    }

    public void tambahPesanan(Pesanan pesanan) {
        pesanans.add(pesanan);
        System.out.println("Pesanan ditambahkan: " + pesanan.getPesananId());
    }

    public void hapusPesanan(int pesananId) {
        pesanans.removeIf(pesanan -> pesanan.getPesananId() == pesananId);
        System.out.println("Pesanan dihapus: " + pesananId);
    }

    public void tampilanPesanans() {
        System.out.println("\nAll pesanans:");
        for (Pesanan pesanan : pesanans) {
            System.out.println("PesananID: " + pesanan.getPesananId() + ", Customer: " + pesanan.getnamaPelanggan() + ", Jumlah: " + pesanan.getjumlahTotal());
        }
    }
}
