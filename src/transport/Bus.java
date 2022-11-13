package transport;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bus extends Train implements Competing {

    public static final String CMD_PITSTOP = " Пит-стоп ";
    public static final String CMD_BEST_LSP_TAIM = " Лучшее время круга ";
    public static final String CMD_MAXIMUM_SPID = " Максимальная скорость ";

    public static final String[] COMPETING = {CMD_PITSTOP, CMD_BEST_LSP_TAIM, CMD_MAXIMUM_SPID};
    private String[] competing = new String[0];
    public String stamp;
    public String model;

   public double engineCapacity;
    private String[] commandCommands;

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

   public Bus(String stamp, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed, double thePriceOfTheTrip, double travelTime, String nameOfTheDepartureStation, String finalStop, int numberOfWagons, double engineCapacity) {
   super(stamp, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed, thePriceOfTheTrip, travelTime, nameOfTheDepartureStation, finalStop, numberOfWagons);
        if (stamp != null || stamp.isEmpty()) {
            this.stamp = stamp;
        }
        if (model != null || model.isEmpty()) {
            this.model = model;
        }
        if (engineCapacity >= 0) {
            this.engineCapacity = engineCapacity;
        }
    }

    // public Bus(String stamp, String model, int yearOfRelease, String countryOfManufacture, String bodyColor, int maximumMovementSpeed, double thePriceOfTheTrip, double travelTime, String nameOfTheDepartureStation, String finalStop, int numberOfWagons) {
    //  super(stamp, model, yearOfRelease, countryOfManufacture, bodyColor, maximumMovementSpeed, thePriceOfTheTrip, travelTime, nameOfTheDepartureStation, finalStop, numberOfWagons);
//}
    public String toString() {
        return "Bus{" +
                "Цена поездки " + thePriceOfTheTrip +
                ", Страна производства " + getCountryOfManufacture() +
                ", Название станции отбытия' " + nameOfTheDepartureStation + '\'' +
                ", Конечная остановка' " + finalStop + '\'' +
                ", Количество вагонов " + numberOfWagons +
                ", Марка' " + stamp + '\'' +
                ", Модель " + model + '\'' +
                ", Максимальная скорость передвижения "+ "\"" + maximumMovementSpeed +  "Год выпуска " + getYearOfRelease() + ", engineCapacity=" + engineCapacity +
                '}';
} public void refill(){
        System.out.println(" можно заправлять бензином или дизелем на заправке. ");
    }
    public void startMovements() {
        System.out.println(" начать движение ");
    }
    public void finishMovements() {
        System.out.println(" закончить движение ");
    }
    public String[] getCompeting() {

        return COMPETING;
    }

    @Override
    public void command(String command) {
        commandCommands = Arrays.copyOf(commandCommands, commandCommands.length + 1);
        commandCommands[commandCommands.length - 1] = command;
    }

    @Override
    public String[] typeOfRights() {
        return new String[0];
    }

    @Override
    public String[] pitStop() {

        return competing;
    }

    @Override
    public String[] bestLapTime() {
        return  competing;
    }

    @Override
    public String[] maximumSpeed() {
        return competing;
    }


    @Override
    public void doCommand(String command) {
        System.out.println(" Команда " + command);

        switch (command) {
            case CMD_PITSTOP:
                System.out.println(" Еду на пит стоп " );
                break;
            case CMD_BEST_LSP_TAIM:
                System.out.println(" Это лучший круг ");
                break;
            case CMD_MAXIMUM_SPID:
                System.out.println(" Это максимальна я скорость ");
                break;
        }

    }
}
