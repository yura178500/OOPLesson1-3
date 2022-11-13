package transport;

public class RightsCategoryE extends Bus implements Competing{
    public RightsCategoryE(String stamp, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed, double thePriceOfTheTrip, double travelTime, String nameOfTheDepartureStation, String finalStop, int numberOfWagons, double engineCapacity) {
        super(stamp, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed, thePriceOfTheTrip, travelTime, nameOfTheDepartureStation, finalStop, numberOfWagons, engineCapacity);
    }
}
