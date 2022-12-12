package transport;

public class Truck extends Transport implements Competitive {
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

    @Override
    public void PitStop() {
        System.out.println("Грузовику нужен пит-стоп");
    }

    @Override
    public double getBestLapTime() {
        return (Math.random() * 10);
    }

    @Override
    public int getMaxSpeed() {
        return (int) (Math.random() * 150);
    }
}
