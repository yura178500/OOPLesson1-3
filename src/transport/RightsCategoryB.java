package transport;

public class RightsCategoryB extends PassengerCars implements Competing{

    public RightsCategoryB(String stamp, String model, double engineCapacity) {
        super(stamp, model, engineCapacity);
    }


    public String[] typeOfRights() {
        System.out.println("Катигория В");
        return new String[0];
    }

    @Override
    public void refill() {

    }
}
