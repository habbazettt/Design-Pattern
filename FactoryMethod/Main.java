package FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Writer fictionWriter = WriterFactory.createWriter("Fiction");
        fictionWriter.write();
        
        Writer nonFictionWriter = WriterFactory.createWriter("NonFiction");
        nonFictionWriter.write();
    }
}
