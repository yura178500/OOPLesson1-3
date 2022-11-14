package transport;

public enum TypeOfoutOfSight {
    ESPECIALLE_SMALL(0,10),
    SMAL(10,25),
    MEDIUM(40,50),
    LARGE(60,80),
    ESPECIALLY(100,120);

    public final int from;

    public final int to;

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    TypeOfoutOfSight(int from, int to) {
        this.from = from;
        this.to = to;
    }
}
