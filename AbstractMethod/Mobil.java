package AbstractMethod;

public class Mobil extends Kendaraan {
    public Mobil(String brand) {
        super(brand);
    }

    @Override
    public void drive() {
        System.out.println("Mengemudikan mobil " + brand);
    }
}
