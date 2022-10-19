package SOLID;

import java.util.HashMap;

public abstract class Dock extends AppMessages implements DockTypes {
    private final HashMap<String, Truck> trucks = new HashMap<>();
    private int truckWeight;
    final int maxWeightDockA = 5000;
    final int maxWeightDockD = 9000;

    @Override
    //ADDING VAN TO THE DOCK "A or B" IF THESE ARE FULL THEN IT WILL SHOW A FULL STATION MESSAGE.
    public void addVanToDock(Truck truck) {
        if (trucks.containsKey(dockA) & trucks.containsKey(dockB)) {
            StationFullMessage();
        } else if (trucks.containsKey(dockA)) {
            trucks.put(dockB, truck);
            RegisterTruckMessage(dockB);
        } else {
            trucks.put(dockA, truck);
            RegisterTruckMessage(dockA);
        }
    }

    //ADDING SMALL TRUCK TO THE DOCK "C or D" IF THESE ARE FULL THEN IT WILL CHECK IF WEIGHT IS CORRECT FOR DOCK A AND A IS FREE.
    @Override
    public void addSmallTruckToDock(Truck truck) {
        if (trucks.containsKey(dockC) & trucks.containsKey(dockD)) {
            if (truckWeight < maxWeightDockA & !trucks.containsKey(dockA)) {
                trucks.put(dockA, truck);
                RegisterTruckMessage(dockA);
            } else {
                StationFullMessage();
            }
        } else if (trucks.containsKey(dockC)) {
            trucks.put(dockD, truck);
            RegisterTruckMessage(dockD);

        } else {
            trucks.put(dockC, truck);
            RegisterTruckMessage(dockC);
        }
    }

    //ADDING HEAVY TRUCK TO THE DOCK "D" IF "D" IS FULL THEN IT WILL CHECK IF WEIGHT IS CORRECT FOR DOCK D AND D IS FREE.
    @Override
    public void addHeavyTruckToDock(Truck truck) {
        if (trucks.containsKey(dockE) & trucks.containsKey(dockD)) {
            StationFullMessage();
        } else if (trucks.containsKey(dockE) & !trucks.containsKey(dockD) & truckWeight < maxWeightDockD) {
            trucks.put(dockD, truck);
            RegisterTruckMessage(dockD);
        } else {
            trucks.put(dockE, truck);
            RegisterTruckMessage(dockE);
        }
    }

    // SHOW ALL TRUCKS ON THE STATIONS
    @Override
    public void showDockedTrucks() {
        for (String dockID : trucks.keySet()) {
            System.out.println(dockID + " - " + trucks.get(dockID).getType() + " [" + trucks.get(dockID).getWeight() + "KG]");
        }
    }

    public void setTruckWeight(int truckWeight) {
        this.truckWeight = truckWeight;
    }
}
