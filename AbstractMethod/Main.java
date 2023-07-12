package AbstractMethod;

public class Main {
    public static void main(String[] args) {
        Kendaraan car = new Mobil("Toyota");
        Kendaraan motorcycle = new Motor("Honda");

        car.drive();
        motorcycle.drive();
    }
}
