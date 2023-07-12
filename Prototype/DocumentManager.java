package Prototype;

import java.util.HashMap;
import java.util.Map;

public class DocumentManager {
    private static Map<String, Document> daftarDokumen = new HashMap<>();

    public static void inisialisasi() {
        Letter surat = new Letter("Rizky", "Yusuf");
        surat.setJudul("Undangan");
        surat.setKonten("Silakan bergabung dengan kami dalam pesta!");
        daftarDokumen.put("surat", surat);

        Contract kontrak = new Contract("Twitter", "Threads");
        kontrak.setJudul("Perjanjian Layanan");
        kontrak.setKonten("Syarat dan ketentuan...");
        daftarDokumen.put("kontrak", kontrak);

        Report laporan = new Report("Rafael");
        laporan.setJudul("Laporan Penjualan");
        laporan.setKonten("Analisis data penjualan...");
        daftarDokumen.put("laporan", laporan);
    }

    public static Document getDokumen(String jenis) {
        Document dokumen = daftarDokumen.get(jenis);
        return (Document) dokumen.clone();
    }
}
