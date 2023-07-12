package Prototype;

public class Report extends Document {
    private String penulis;

    public Report(String penulis) {
        this.penulis = penulis;
    }

    @Override
    public void cetak() {
        System.out.println("Laporan");
        System.out.println("Penulis: " + penulis);
        System.out.println("Judul: " + getJudul());
        System.out.println("Konten: " + getKonten());
        System.out.println();
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

}

