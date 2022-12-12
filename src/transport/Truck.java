package transport;

public class Truck extends Transport {
    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик заканчивает движение");
    }

    @Override
    public String toString() {
        return "Грузовик " + super.toString();
    }
}
