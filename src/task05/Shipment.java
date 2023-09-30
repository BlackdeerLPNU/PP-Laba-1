package task05;

public class Shipment {

    private Long shipmentId;
    private final DeparturePoint fromPoint;
    private final Point toPoint;
    private final ShipmentMethods method;
    private final Item item;

    public Long getShipmentId() {
        return shipmentId;
    }

    public Shipment(final DeparturePoint fromPoint, final Point toPoint, final ShipmentMethods method,
                    final Item item) {
        switch (method) {
            case BICYCLE -> {
                final double byBicycleMaxWeight = 10d;
                final double byBicycleMaxSize = 10d;

                if (item.getWeight() > byBicycleMaxWeight || item.getSize() > byBicycleMaxSize) {
                    throw new IllegalArgumentException("The item is too heavy or too big.");
                }
            }
            case BUS -> {
                final double byBusMaxWeight = 30d;
                final double byBusMaxSize = 50d;

                if (item.getWeight() > byBusMaxWeight || item.getSize() > byBusMaxSize) {
                    throw new IllegalArgumentException("The item is too heavy or too big.");
                }
            }
            case TRAIN -> {
                final double byTrainMaxWeight = 75d;
                final double byTrainMaxSize = 110d;

                if (item.getWeight() > byTrainMaxWeight || item.getSize() > byTrainMaxSize) {
                    throw new IllegalArgumentException("The item is too heavy or too big.");
                }
            }
            case TRUCK -> {
                final double byTruckMaxWeight = 63d;
                final double byTruckMaxSize = 67d;

                if (item.getWeight() > byTruckMaxWeight || item.getSize() > byTruckMaxSize) {
                    throw new IllegalArgumentException("The item is too heavy or too big.");
                }
            }
        }
        this.shipmentId = IdGenerator.getOrderId();
        this.fromPoint = fromPoint;
        this.toPoint = toPoint;
        this.item = item;
        this.method = method;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "id=" + shipmentId +
                ", fromPoint=" + fromPoint +
                ", toPoint=" + toPoint +
                ", method=" + method +
                ", item=" + item +
                '}';
    }
}
