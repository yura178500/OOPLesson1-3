package transport;

public class Trucks extends Transport implements Competing {
    public String stamp;
    public String model;
    public double engineCapacity;


    public String toString() {
        return "Trucks{" +
                "stamp='" + stamp + '\'' +
                ", model='" + model + '\'' +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    public Trucks(String stamp, String model, double engineCapacity) {
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

    public String getStamp() {
        return stamp;
    }

    public void setStamp(String stamp) {
        this.stamp = stamp;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void refill() {

    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public void startMovements() {
        System.out.println(" начать движение ");
    }

    public void finishMovements() {
        System.out.println(" закончить движение ");
    }

    @Override
    public String[] pitStop() {
        return new String[0];
    }

    @Override
    public String[] bestLapTime() {
        return new String[0];
    }

    @Override
    public String[] maximumSpeed() {
        return new String[0];
    }

    @Override
    public void doCommand(String command) {

    }

    @Override
    public String[] getCompeting() {
        return new String[0];
    }

    @Override
    public void command(String command) {

    }

    @Override
    public String[] typeOfRights() {
        return new String[0];
    }
}
