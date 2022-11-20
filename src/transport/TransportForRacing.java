package transport;

import driver.Driver;
import driver.DriverC;

import java.util.ArrayList;
import java.util.List;

public abstract class TransportForRacing {
    private String brand;
    private String model;
    private double engineVolume;

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Driver<?>> drivers = new ArrayList<>();


    public TransportForRacing(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        if (model == null || model.isEmpty() || model.isBlank())
            System.out.println("Неверное значение");
        if (brand == null || brand.isEmpty() || brand.isBlank())
            System.out.println("Неверное значение");
        if (engineVolume <= 0)
            System.out.println("Неверное значение");
    }

    public void addDriver(DriverC олег) {
        drivers.add((Driver<?>) drivers);

    }
    public void addMtchanik(Mtchanik<?>mtchanik) {
        mtchanik.add((mtchanik));

    }

    protected abstract void add(Mtchanik<?> mtchanik);

    public void addSponsor(Sponsor sponsor) {
        sponsor.add(sponsor);

    }

    public double getEngineVolume() {
        return engineVolume;
    }


    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public abstract void startDriving();

    public abstract void finishDriving();

    public abstract void printType();

    public void repair() {
           }
    public void service() {
    }

    public Iterable<? extends Sponsor> getSponsor() {
        return null;
    }

    public Iterable<? extends Mtchanik<?>> getMtchanik() {
        return null;
    }
}
