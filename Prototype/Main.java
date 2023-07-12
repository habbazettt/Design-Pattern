package Prototype;

public class Main {
    public static void main(String[] args) {
        DocumentManager.inisialisasi();

        Document suratClone = DocumentManager.getDokumen("surat");
        suratClone.cetak();

        Document kontrakClone = DocumentManager.getDokumen("kontrak");
        kontrakClone.cetak();

        Document laporanClone = DocumentManager.getDokumen("laporan");
        laporanClone.cetak();
    }
}