package SOLID;

import java.util.Scanner;

public class DMStation extends Dock implements TruckTypes {

    public static void main(String[] args) {
        DMStation dock = new DMStation();
        Scanner scanner = new Scanner(System.in);
        int tempUserTruckWeight;
        // SHOW MAIN MENU
        mainMenu:
        while (true) {
            dock.WelcomeMessage();
            // SHOW SUB MENU
            subMenu:
            while (true) {
                try {
                    int userPick = scanner.nextInt();
                    switch (userPick) {
                        case 1 -> {
                            dock.showDockedTrucks();
                            dock.ShowTrucksMessage();
                            break subMenu;
                        }
                        case 2 -> {
                            dock.PickTruckMessage();
                            int userTruckPick = scanner.nextInt();
                            if (userTruckPick == 1) {
                                dock.WeightMessage();
                                tempUserTruckWeight = scanner.nextInt();
                                Truck truck = new Truck(van, tempUserTruckWeight);
                                dock.addVanToDock(truck);
                                break subMenu;

                            } else if (userTruckPick == 2) {
                                dock.WeightMessage();
                                tempUserTruckWeight = scanner.nextInt();
                                Truck truck = new Truck(smallTruck, tempUserTruckWeight);
                                dock.setTruckWeight(tempUserTruckWeight);
                                dock.addSmallTruckToDock(truck);
                                break subMenu;

                            } else if (userTruckPick == 3) {
                                dock.WeightMessage();
                                tempUserTruckWeight = scanner.nextInt();
                                Truck truck = new Truck(heavyTruck, tempUserTruckWeight);
                                dock.setTruckWeight(tempUserTruckWeight);
                                dock.addHeavyTruckToDock(truck);
                                break subMenu;

                            } else {
                                dock.InvalidInputMessage();
                            }
                        }
                        case 3 -> {
                            break mainMenu;
                        }
                        default -> {
                            dock.InvalidInputMessage();
                        }
                    }

                } catch (Exception e) {
                    dock.InvalidInputMessage();
                    scanner.next();
                }
            }

        }

    }
}



