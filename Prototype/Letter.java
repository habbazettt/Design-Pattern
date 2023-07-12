package Prototype;

public class Letter extends Document {
    private String pengirim;
    private String penerima;

    public Letter(String pengirim, String penerima) {
        this.pengirim = pengirim;
        this.penerima = penerima;
    }

    @Override
    public void cetak() {
        System.out.println("Surat");
        System.out.println("Pengirim: " + pengirim);
        System.out.println("Penerima: " + penerima);
        System.out.println("Judul: " + getJudul());
        System.out.println("Konten: " + getKonten());
        System.out.println();
    }
    public String getPengirim() {
        return pengirim;
    }

    public void setPengirim(String pengirim) {
        this.pengirim = pengirim;
    }

    public String getPenerima() {
        return penerima;
    }

    public void setPenerima(String penerima) {
        this.penerima = penerima;
    }


}
