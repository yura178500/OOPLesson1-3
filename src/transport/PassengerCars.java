package transport;

import java.util.concurrent.ThreadLocalRandom;

public class PassengerCars extends TransportForRacing implements Competing {

    public PassengerCars(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startDriving() {
        System.out.printf("Автомобиль %s %s начни движение",
                this.getBrand(),
                this.getModel());
    }

    public void finishDriving() {
        System.out.printf("Автомобиль %s %s закончи движение",
                this.getBrand(),
                this.getModel());
    }


    public void pitStop() {
        System.out.printf("Автомобиль %s %s Пит-Стоп! ",
                this.getBrand(),
                this.getModel());
    }


    public int bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 10);
    }


    public int maximumSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 400);
    }

    public void printCar() {
        System.out.println("Легковой автомобиль: " + getBrand() +
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л");
    }
}