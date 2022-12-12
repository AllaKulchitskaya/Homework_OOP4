package transport;

public class Bus extends Transport implements Competitive {
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус заканчивает движение");
    }

    @Override
    public String toString() {
        return "Автобус " + super.toString();
    }

    @Override
    public void PitStop() {
        System.out.println("Автобусу нужен пит-стоп");
    }

    @Override
    public double getBestLapTime() {
        return (Math.random() * 13);
    }

    @Override
    public int getMaxSpeed() {
        return (int) (Math.random() * 100);
    }
}
