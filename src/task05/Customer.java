package task05;

public class Customer {
    private String name;
    private String adressOfCustomer;

    public Customer() {
    }

    public Customer(String name, String adressOfCustomer) {
        this.name = name;
        this.adressOfCustomer = adressOfCustomer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdressOfCustomer() {
        return adressOfCustomer;
    }

    public void setAdressOfCustomer(String adressOfCustomer) {
        this.adressOfCustomer = adressOfCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", adressOfCustomer='" + adressOfCustomer + '\'' +
                '}';
    }
}
