package driver;

import transport.TransportForRacing;

public abstract class Driver<T extends TransportForRacing> {
    private final String fullName;
    private final String category;
    private final int drivingExperience;
    private final T car;

    public Driver(String fullName, String category, int drivingExperience, T car) {
        this.fullName = fullName;
        this.category = category;
        this.drivingExperience = drivingExperience;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", category='" + category + '\'' +
                ", drivingExperience=" + drivingExperience +
                ", car=" + car +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public String getCategory() {
        return category;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void startDriving() {
        System.out.printf("Водитель %s начал двигаться", this.fullName);
        this.car.startDriving();
    }

    public void finishDriving() {
        System.out.printf("Водитель %s закончил движение", this.fullName);
        this.car.finishDriving();
    }

    public void refill() {
        System.out.printf("Водитель %s заправляет  %s %s",
                this.fullName, this.car.getBrand(), this.car.getModel());
    }

    public Driver<?> add(Driver<?> drivers) {
        drivers = add(drivers);
        return drivers;
    }
}