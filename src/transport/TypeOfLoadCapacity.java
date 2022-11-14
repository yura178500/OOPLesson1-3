package transport;

public enum TypeOfLoadCapacity {
    N1(0f,3.5),
    N2(3.5,12.0),
    N3(12f,null);

    public double from;
    public double to;

    TypeOfLoadCapacity(double from, Double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
