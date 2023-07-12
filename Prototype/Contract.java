package Prototype;
public class Contract extends Document {
    private String pihakA;
    private String pihakB;

    public Contract(String pihakA, String pihakB) {
        this.pihakA = pihakA;
        this.pihakB = pihakB;
    }

    @Override
    public void cetak() {
        System.out.println("Kontrak");
        System.out.println("Pihak A: " + pihakA);
        System.out.println("Pihak B: " + pihakB);
        System.out.println("Judul: " + getJudul());
        System.out.println("Konten: " + getKonten());
        System.out.println();
    }

    public String getPihakA() {
        return pihakA;
    }

    public void setPihakA(String pihakA) {
        this.pihakA = pihakA;
    }

    public String getPihakB() {
        return pihakB;
    }

    public void setPihakB(String pihakB) {
        this.pihakB = pihakB;
    }

}
