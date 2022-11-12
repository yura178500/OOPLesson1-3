package transport;

public class Train extends Transport {


    public double thePriceOfTheTrip;
    public double travelTime;
    public String nameOfTheDepartureStation;
    public String finalStop;
    public int numberOfWagons;


    public String toString() {
        return "Train{" +
                "Цена поездки " + thePriceOfTheTrip +
                ", Страна производства "  + getCountryOfManufacture() +
                ", Название станции отбытия'" + nameOfTheDepartureStation + '\'' +
                ", Конечная остановка'" + finalStop + '\'' +
                ", Количество вагонов " + numberOfWagons +
                ", Марка'" + stamp + '\'' +
                ", Модель" + model + '\'' +
                ", Максимальная скорость передвижения    "+ "\"" + maximumMovementSpeed +  "Год выпуска " + getYearOfRelease() +
                '}';
    }

    public Train(String stamp, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed, double thePriceOfTheTrip, double travelTime, String nameOfTheDepartureStation, String finalStop, int numberOfWagons) {
        super(stamp, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed);
        if (nameOfTheDepartureStation == null || nameOfTheDepartureStation.isEmpty()) {
            this.nameOfTheDepartureStation = "default";
        } else {
            this.nameOfTheDepartureStation = nameOfTheDepartureStation;
        }
        if (finalStop == null || finalStop.isEmpty()) {
            this.finalStop = "default";
        } else {
            this.finalStop = finalStop;
        }if (numberOfWagons <= 0) {
            this.numberOfWagons = numberOfWagons;
        } else {
            this.numberOfWagons = numberOfWagons;
        }if (thePriceOfTheTrip <= 0) {
            this.thePriceOfTheTrip = thePriceOfTheTrip;
        } else {
            this.thePriceOfTheTrip = thePriceOfTheTrip;
        }if (travelTime <= 0) {
            this.travelTime = travelTime;
        } else {
            this.travelTime = travelTime;
        }

    }

    public double getThePriceOfTheTrip() {
        return thePriceOfTheTrip;
    }

    public void setThePriceOfTheTrip(double thePriceOfTheTrip) {
        this.thePriceOfTheTrip = thePriceOfTheTrip;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getNameOfTheDepartureStation() {
        return nameOfTheDepartureStation;
    }

    public void setNameOfTheDepartureStation(String nameOfTheDepartureStation) {
        this.nameOfTheDepartureStation = nameOfTheDepartureStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }
    public void refill(){
        System.out.println(" нужно заправлять дизелем ");
    }



}
