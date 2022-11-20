package transport;

import driver.DriverB;

import java.util.concurrent.ThreadLocalRandom;



public class PassengerCars extends TransportForRacing implements Competing {

    private TypeCars typeCars;

    public TypeCars getTypeCars() {
        return typeCars;
    }

    public void setTypeCars(TypeCars typeCars) {
        this.typeCars = typeCars;
    }

    public PassengerCars(String brand, String model, double engineVolume, TypeCars typeCars) {
        super(brand, model, engineVolume);
        this.typeCars = typeCars;
    }

    @Override
    protected void add(Mtchanik<?> mtchanik) {

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


    public void printType() {
        if (typeCars == null) {
            System.out.println("Данные не верны");
        } else {
            System.out.println("Тип машины " + typeCars );
        }

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
    public void repair() {
        System.out.println("Машина"+ getBrand()+getModel()+"Починена");
    }

    public void addDriver(DriverB олег) {
    }
}