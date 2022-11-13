package transport;

public class RightsCategoryC extends Trucks implements Competing{
    public RightsCategoryC(String stamp, String model, double engineCapacity) {
        super(stamp, model, engineCapacity);
    }

    @Override
    public String[] typeOfRights() {
        return new String[0];
    }

    @Override
    public void refill() {

    }
}
