package transport;

import java.util.concurrent.ThreadLocalRandom;

public class TheBuses extends TransportForRacing implements Competing {

    public TheBuses(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }


    public void startDriving() {
        System.out.printf("Автобус %s %s начни движение",
                this.getBrand(),
                this.getModel());
    }


    public void finishDriving() {
        System.out.printf("Автобус %s %s закончи движение",
                this.getBrand(),
                this.getModel());
    }


    public void pitStop() {
        System.out.printf("Автобус!  %s %s Пит-Стоп! ",
                this.getBrand(),
                this.getModel());
    }


    public int bestLapTime() {
        return ThreadLocalRandom.current().nextInt(1, 15);
    }


    public int maximumSpeed() {
        return ThreadLocalRandom.current().nextInt(1, 300);
    }

    public void printBuses() {
        System.out.println("Автобус: " + getBrand() +
                ", модель: " + getModel() +
                ", объем двигателя: " + getEngineVolume() + " л");
    }

}