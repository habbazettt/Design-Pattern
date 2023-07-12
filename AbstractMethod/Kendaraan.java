package AbstractMethod;

public abstract class Kendaraan {
    protected String brand;

    public Kendaraan(String brand) {
        this.brand = brand;
    }

    public abstract void drive();
}
