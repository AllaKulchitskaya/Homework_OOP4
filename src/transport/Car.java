package transport;

public class Car extends Transport {

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


}
