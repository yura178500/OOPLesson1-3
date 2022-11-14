package driver;

import transport.PassengerCars;


public class DriverB extends Driver<PassengerCars> {
    public DriverB(String fullName, int drivingExperience, PassengerCars car) {
        super(fullName, "B", drivingExperience, car);
    }
}