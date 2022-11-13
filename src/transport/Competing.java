package transport;

public interface Competing {
    String[] pitStop();

    String[] bestLapTime();

    String[] maximumSpeed();

    void doCommand(String command);

    String[] getCompeting();

    void command(String command);

    String[] typeOfRights();
}
