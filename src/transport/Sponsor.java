package transport;

public class Sponsor {
    private String name;
    private final int amount;

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String toSponsorRace() {
        System.out.println("Спонсор проспонсировал заезд" + name + amount);
        return name;
    }

    public String add(Sponsor sponsor) {
        return toSponsorRace();
    }
}
