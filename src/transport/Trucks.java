package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Trucks extends TransportForRacing implements Competing {

    public Trucks(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startDriving() {
        System.out.printf("Грузовик %s %s начни движение",
                this.getBrand(),
                this.getModel());
    }


    public void finishDriving() {
        System.out.printf("Грузовик %s %s закончи движение",
                this.getBrand(),
                this.getModel());
    }

    public void pitStop() {
        System.out.printf("Грузовик! %s %s Пит-Стоп! ",
                this.getBrand(),
                this.getModel());
    }


    public int bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 20);
    }


    public int maximumSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 250);
    }

    public void printTrucks() {
        System.out.println("Грузовик: " + getBrand() +
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л");
    }
}