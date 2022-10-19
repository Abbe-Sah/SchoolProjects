package SOLID;

public interface DockTypes {
    String dockA = "A";
    String dockB = "B";
    String dockC = "C";
    String dockD = "D";
    String dockE = "E";

    void addVanToDock(Truck truck);
    void addHeavyTruckToDock(Truck truck);
    void addSmallTruckToDock(Truck truck);
    void showDockedTrucks();

}
