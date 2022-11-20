package transport;

import driver.DriverD;

import java.util.concurrent.ThreadLocalRandom;

public class TheBuses extends TransportForRacing implements Competing {
    public TypeOfoutOfSight typeOfoutOfSight;

    public TypeOfoutOfSight getTypeOfoutOfSight() {
        return typeOfoutOfSight;
    }

    public void setTypeOfoutOfSight(TypeOfoutOfSight typeOfoutOfSight) {
        this.typeOfoutOfSight = typeOfoutOfSight;
    }

    public TheBuses(String brand, String model, double engineVolume, TypeOfoutOfSight typeOfoutOfSight) {
        super(brand, model, engineVolume);
        this.typeOfoutOfSight = typeOfoutOfSight;
    }


    @Override
    protected void add(Mtchanik<?> mtchanik) {

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

    @Override
    public void printType() {
        if (typeOfoutOfSight == null) {
            System.out.println("Данные не верны");
        } else {
            System.out.println("Тип машины " + "от " + typeOfoutOfSight.getFrom() + "до " + typeOfoutOfSight.getTo());
    }}


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
    public void repair() {
        System.out.println("Машина"+ getBrand()+getModel()+"Починена");
    }

    public void addDriver(DriverD кирилл) {
    }
}