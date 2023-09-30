package task05;

public class Item {


    private double weight;
    private double size;

    public Item(final double weight,final double size){
        this.weight = weight;
        this.size = size;
    }

    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Item{" +
                ", weight=" + weight +
                ", size=" + size +
                '}';
    }
}
