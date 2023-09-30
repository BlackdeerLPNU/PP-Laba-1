package task05;

public class DeparturePoint extends Point {
    private final int departureNumber;
    public DeparturePoint(final int departureNumber, final String city, final String street,
                          final String number) {
        super(city, street, number);
        this.departureNumber = departureNumber;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
