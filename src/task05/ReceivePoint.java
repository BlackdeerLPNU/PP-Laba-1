package task05;

public class ReceivePoint extends Point{
    public ReceivePoint(final String city, final String street, final String number) {
        super(city, street, number);
    }

    @Override
    public String toString() {
        return "RP: " + super.toString();
    }
}
