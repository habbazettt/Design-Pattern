package FactoryMethod;

public class WriterFactory {
    public static Writer createWriter(String type) {
        if (type.equalsIgnoreCase("Fiction")) {
            return new FictionWriter();
        } else if (type.equalsIgnoreCase("NonFiction")) {
            return new NonFictionWriter();
        } else {
            throw new IllegalArgumentException("Tipe penulis tidak valid");
        }
    }
}
