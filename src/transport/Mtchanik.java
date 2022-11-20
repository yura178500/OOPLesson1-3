package transport;

public class Mtchanik<T extends TransportForRacing> extends TransportForRacing {

    public final String name;
    public final String sorname;
    public final String compani;

    public String getName() {
        return name;
    }

    public String getSorname() {
        return sorname;
    }

    public String getCompani() {
        return compani;
    }

    public Mtchanik(String brand, String model, double engineVolume, String name, String sorname, String compani) {
        super(brand, model, engineVolume);
        this.name = name;
        this.sorname = sorname;
        this.compani = compani;
    }

    @Override
    protected void add(Mtchanik<?> mtchanik) {

    }

    public void startDriving() {

    }

    @Override
    public void finishDriving() {

    }

    @Override
    public void printType() {

    }

    public void service(T t) {
    }

    public void repair(T t) {
    }
}
