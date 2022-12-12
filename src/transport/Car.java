package transport;

public class Car extends Transport implements Competitive {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль заканчивает движение");


    }

    @Override
    public String toString() {
        return "Автомобиль " + super.toString();
    }


    @Override
    public void PitStop() {
        System.out.println("Автомобилю нужен пит-стоп");
    }

    @Override
    public double getBestLapTime() {
        return (Math.random() * 5);
    }

    @Override
    public int getMaxSpeed() {
        return (int) (Math.random() * 180);
    }
}
