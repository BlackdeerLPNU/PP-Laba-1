package task05;

public class Main {
    public static void main(String[] args) {
        DeliveryService service = new DeliveryService();

        final ReceivePoint point1 = new ReceivePoint("Ternopil", "Arikovska", "17");
        final ReceivePoint point2 = new ReceivePoint("Drohobych", "Boryslavska", "102");
        final ReceivePoint point3 = new ReceivePoint("Ternopil", "Arikovska", "17");

        service.displayDeparturePoints();
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        service.CreateShipment(2, point2, ShipmentMethods.BICYCLE, new Item(4d, 7d));
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        service.CreateShipment(1, point1, ShipmentMethods.BUS, new Item(28d, 18d));
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        service.cancelShipment(service.getShipments()[0].getShipmentId());
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        service.displayShipments();
        System.out.println();
        System.out.println("------------------");
        System.out.println();

        service.CreateShipment(3, point3, ShipmentMethods.TRUCK, new Item(57d, 50d));
    }

}
