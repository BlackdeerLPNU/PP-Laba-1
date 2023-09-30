package task05;

import java.util.Objects;

public class Point {
    private final String city;
    private final String street;
    private final String number;

    public Point(final String city, final String street, final String number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format(this.city + " " + this.street + " " + this.number);
    }

    public boolean hasTheSameAddress(final Point point) {
        return  Objects.equals(this.city, point.city) && Objects.equals(this.street, point.street)
                && Objects.equals(this.number, point.number);    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point point)) {
            return false;
        }
        return Objects.equals(this.city, point.city) &&
                Objects.equals(this.street, point.street) && this.number == point.number;
    }

}
