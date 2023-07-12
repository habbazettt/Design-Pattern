package Prototype;

public abstract class Document implements Cloneable {
    private String judul;
    private String konten;

    public abstract void cetak();
    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }


    public String getJudul() {
        return judul;
    }


    public void setJudul(String judul) {
        this.judul = judul;
    }


    public String getKonten() {
        return konten;
    }


    public void setKonten(String konten) {
        this.konten = konten;
    }
}

