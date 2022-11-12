package transport;

public class Bus extends Train{

    public Bus(String stamp, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed, double thePriceOfTheTrip, double travelTime, String nameOfTheDepartureStation, String finalStop, int numberOfWagons) {
        super(stamp, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed, thePriceOfTheTrip, travelTime, nameOfTheDepartureStation, finalStop, numberOfWagons);
    }
    public String toString() {
        return "Bus{" +
                "Цена поездки " + thePriceOfTheTrip +
                ", Страна производства " + getCountryOfManufacture() +
                ", Название станции отбытия' " + nameOfTheDepartureStation + '\'' +
                ", Конечная остановка' " + finalStop + '\'' +
                ", Количество вагонов " + numberOfWagons +
                ", Марка' " + stamp + '\'' +
                ", Модель " + model + '\'' +
                ", Максимальная скорость передвижения "+ "\"" + maximumMovementSpeed +  "Год выпуска " + getYearOfRelease() +
                '}';
} public void refill(){
        System.out.println(" можно заправлять бензином или дизелем на заправке. ");
    }
}
