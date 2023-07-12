package AbstractMethod;

public class Motor extends Kendaraan {
    public Motor(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println("Mengendarai sepeda motor " + brand);
    }
}
