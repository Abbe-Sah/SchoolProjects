package SOLID;

public class Truck implements TruckTypes {
    private final String type;
    private final int weight;

    public Truck(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

}
