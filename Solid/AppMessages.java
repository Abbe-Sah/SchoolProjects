package SOLID;

public abstract class AppMessages {

    final void WelcomeMessage() {
        System.out.println(" ###################################################### ");
        System.out.println("               DUMPA MERA CONTROLPANEL");
        System.out.println("               ¤¤¤¤ MENU OPTIONS ¤¤¤¤");
        System.out.println("1 = See parked trucks ## 2 = Register new truck ## 3 = Exit");
        System.out.println(" ###################################################### ");
    }

    final void ShowTrucksMessage() {
        System.out.println("Current Trucks on station");
    }

    final void PickTruckMessage() {
        System.out.println("Pick type of truck");
        System.out.println(" 1. Van \n 2. Small Truck \n 3. Heavy Truck");
    }

    final void WeightMessage() {
        System.out.println("What is the weight in KG");
    }

    final void InvalidInputMessage() {
        System.out.println("Invalid pick, try again");
    }

    final void StationFullMessage() {
        System.out.println("This station is full, Please drive to station Dumpa Mest");
    }

    final void RegisterTruckMessage(String dockName) {
        System.out.println("Truck is registered on dock " + dockName);
    }
}
