package transport;

public class Driver < R extends Transport & Competing> implements Competing {
    public String driverName;
    public String driverLicense;
    public int experience;

    @Override
    public String toString() {
        return "Driver{" +
                "driverName='" + driverName + '\'' +
                ", driverLicense='" + driverLicense + '\'' +
                ", experience=" + experience +
                '}';
    }

    public Driver(String driverName, String driverLicense, int experience) {
        if (driverName !=null || driverName.isEmpty()) {
            this.driverName = driverName;
        }
        if  (driverLicense !=null || driverLicense.isEmpty()) {
            this.driverLicense = driverLicense;
        }
        if (experience>=0) {
            this.experience = experience;
        }
    }
    public void typeOfRights1(R transport) {
        System.out.println("Катигория прав" + transport.stamp + "В");
        System.out.println("Катигория прав" + transport.stamp + "С");
        System.out.println("Катигория прав" + transport.stamp + "D");
    }


    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public void startMoving() {
        System.out.println("начать движение");
    }
    public void stop() {
        System.out.println("Надо остановиться");
            }

    public void refuelingTheCar() {
        System.out.println("Надо заправить авто");
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
