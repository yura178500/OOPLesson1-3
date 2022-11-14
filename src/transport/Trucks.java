package transport;

import java.util.concurrent.ThreadLocalRandom;

public class Trucks extends TransportForRacing implements Competing {

    public TypeOfLoadCapacity typeOfLoadCapacity;

    public TypeOfLoadCapacity getTypeOfLoadCapacity() {
        return typeOfLoadCapacity;
    }

    public void setTypeOfLoadCapacity(TypeOfLoadCapacity typeOfLoadCapacity) {
        this.typeOfLoadCapacity = typeOfLoadCapacity;
    }

    public Trucks(String brand, String model, double engineVolume, TypeOfLoadCapacity typeOfLoadCapacity) {
        super(brand, model, engineVolume);
        this.typeOfLoadCapacity = typeOfLoadCapacity;
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


    public void  printType() {
        if (typeOfLoadCapacity == null) {
            System.out.println("Данные не верны");
        } else {
            String from = (typeOfLoadCapacity.getFrom() != null) ? ("от " + typeOfLoadCapacity.getFrom()) : "";
            String to = (typeOfLoadCapacity.getTo() != null) ? ("от " + typeOfLoadCapacity.getTo()) : "";
            System.out.println("Тип машины " + from + to);
    }

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