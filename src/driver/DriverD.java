package driver;

import transport.TheBuses;

public class DriverD extends Driver<TheBuses> {

    public DriverD(String fullName, int drivingExperience, TheBuses car) {
        super(fullName, "D", drivingExperience, car);
    }
}