import Detectors.*;
import House.House;
import House.Window;
import House.Room;
import House.Door;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        WindowDetector windowDetector1 = new WindowDetector("Bedroom 1",false, false, false);
        WindowDetector windowDetector2 = new WindowDetector("Bedroom 2",false, false, false);
        WindowDetector windowDetector3 = new WindowDetector("Bedroom 3", false, false, false);
        WindowDetector windowDetector4 = new WindowDetector("Bedroom 4", false, false, false);
        WindowDetector windowDetector5 = new WindowDetector("Bedroom 5", false, false, false);
        WindowDetector windowDetector6 = new WindowDetector("Garage", false, false, false);
        WindowDetector windowDetector7 = new WindowDetector("Living Room", false, false, false);
        WindowDetector windowDetector8 = new WindowDetector("Kitchen", false, false, false);
        WindowDetector windowDetector9 = new WindowDetector("Main entrance", false, false, false);

        Sprinkler sprinkler1 = new Sprinkler(true);
        Sprinkler sprinkler2 = new Sprinkler(true);
        Sprinkler sprinkler3 = new Sprinkler(true);
        Sprinkler sprinkler4 = new Sprinkler(true);
        Sprinkler sprinkler5 = new Sprinkler(true);
        Sprinkler sprinkler6 = new Sprinkler(true);
        Sprinkler sprinkler7 = new Sprinkler(true);
        Sprinkler sprinkler8 = new Sprinkler(true);
        Sprinkler sprinkler9 = new Sprinkler(true);

        SmokeDetector smokeDetector1 = new SmokeDetector("Bedroom 1", true, false, sprinkler1);
        SmokeDetector smokeDetector2 = new SmokeDetector("Bedroom 2", true, false, sprinkler2);
        SmokeDetector smokeDetector3 = new SmokeDetector("Bedroom 3", true, false, sprinkler3);
        SmokeDetector smokeDetector4 = new SmokeDetector("Bedroom 4", true, false, sprinkler4);
        SmokeDetector smokeDetector5 = new SmokeDetector("Bedroom 5", true, false, sprinkler5);
        SmokeDetector smokeDetector6 = new SmokeDetector("Garage", true, false, sprinkler6);
        SmokeDetector smokeDetector7 = new SmokeDetector("Living Room", true, false, sprinkler7);
        SmokeDetector smokeDetector8 = new SmokeDetector("Kitchen", true, false, sprinkler8);
        SmokeDetector smokeDetector9 = new SmokeDetector("Main entrance", true, false, sprinkler9);



        DoorDetector doorDetector1 = new DoorDetector("Garage",false, false);
        DoorDetector doorDetector2 = new DoorDetector("Main entrance",false, false);
        DoorDetector doorDetector3 = new DoorDetector("Living room",false, false);

        MovementDetector movementDetector1 = new MovementDetector("Main entrance", false, false);
        MovementDetector movementDetector2 = new MovementDetector("Living room", false, false);
        MovementDetector movementDetector3 = new MovementDetector("Garden", false, false);

        CentralUnit centralUnit1 = new CentralUnit(false, false, windowDetector1, smokeDetector1);
        CentralUnit centralUnit2 = new CentralUnit(false, false, windowDetector2,smokeDetector2);
        CentralUnit centralUnit3 = new CentralUnit(false, false, windowDetector3, smokeDetector3);
        CentralUnit centralUnit4 = new CentralUnit(false, false, windowDetector4, smokeDetector4);
        CentralUnit centralUnit5 = new CentralUnit(false, false, windowDetector5, smokeDetector5);
        CentralUnit centralUnit6 = new CentralUnit(false, false, windowDetector6, smokeDetector6); //Garage
        CentralUnit centralUnit7 = new CentralUnit(false, false, windowDetector7, smokeDetector7); //Living room
        CentralUnit centralUnit8 = new CentralUnit(false, false, windowDetector8, smokeDetector8); //Kitchen
        CentralUnit centralUnit9 = new CentralUnit(false, false, windowDetector9, smokeDetector9); //Main entrance
        CentralUnit centralUnit10 = new CentralUnit();

        Window window1 = new Window("Window 1", windowDetector1); //Bedroom 1
        Window window2 = new Window("Window 1", windowDetector2); //Bedroom 2
        Window window3 = new Window("Window 1", windowDetector3); //Bedroom 3
        Window window4 = new Window("Window 1", windowDetector4); //Bedroom 4
        Window window5 = new Window("Window 1", windowDetector5); //Bedroom 5
        Window window6 = new Window("Window 1", windowDetector6); //Garage
        Window window7 = new Window("Window 1",windowDetector7); //Living room
        Window window8 = new Window("Window 1", windowDetector8); //Kitchen
        Window window9 = new Window("Window 1",windowDetector9); //Main entrance


        Door door1 = new Door("Garage", doorDetector1);
        Door door2 = new Door("Living room", doorDetector2);
        Door door3 = new Door("Main entrance", doorDetector3);


       //Windows in rooms
        Room bedroom1Window1 = new Room(2, window1);
        Room bedroom2Window1 = new Room (1, window2);
        Room bedroom3Window1 = new Room(1, window3);
        Room bedroom4Window1 = new Room(1, window4);
        Room bedroom5Window1 = new Room(1, window5);
        Room garageWindow1 = new Room(1, window6);
        Room livingRoomWindow1 = new Room(2, window7);
        Room kitchenWindow1 = new Room(1, window8);
        Room mainEntranceWindow = new Room(1, window9);



        //Set doors
        garageWindow1.setDoor(door1);
        livingRoomWindow1.setDoor(door2);
        mainEntranceWindow.setDoor(door3);

        //Set door detectors
        centralUnit6.setDoorDetector(doorDetector1); //Garage door detector
        centralUnit7.setDoorDetector(doorDetector2); //Living room door detector
        centralUnit9.setDoorDetector(doorDetector3); //Main entrance door detector





        //Rooms in house
        House bedroom1 = new House("Bedroom 1", bedroom1Window1, smokeDetector1);
        House bedroom2 = new House("Bedroom 2",bedroom2Window1, smokeDetector2);
        House bedroom3 = new House("Bedroom 3", bedroom3Window1, smokeDetector3);
        House bedroom4 = new House("Bedroom 4", bedroom4Window1, smokeDetector4);
        House bedroom5 = new House("Bedroom5", bedroom5Window1, smokeDetector5);
        House garage = new House("Garage", garageWindow1, smokeDetector6);
        House livingRoom = new House("Living room", livingRoomWindow1, smokeDetector7);
        House kitchen = new House("Kitchen", kitchenWindow1, smokeDetector8);
        House mainEntrance = new House("Main entrance", mainEntranceWindow, smokeDetector9);
        House garden = new House();


        //Set movement detectors
        mainEntrance.setMovementDetector(movementDetector1);
        livingRoom.setMovementDetector(movementDetector2);
        garden.setMovementDetector(movementDetector3);

        centralUnit9.setMovementDetector(movementDetector1);
        centralUnit7.setMovementDetector(movementDetector2);
        centralUnit10.setMovementDetector(movementDetector3);


        Scanner scanner = new Scanner(System.in);

        int input;

        while(true){

            System.out.println("------------------------");
            System.out.println("(0) Restores the alarm");
            System.out.println("(1) Activate alarm");
            System.out.println("(2) Deactivate alarm");
            System.out.println("(3) Simulate fire");
            System.out.println("(4) Simulate break in");
            System.out.println("(5) Simulate movement");
            input = scanner.nextInt();

            switch(input){

                case 0:
                    while(input != 4) {
                        System.out.println("(1) Restore smoke detector");
                        System.out.println("(2) Restore window detector");
                        System.out.println("(3) Restore movement detector");
                        System.out.println("(4) Exit");
                        input = scanner.nextInt();
                        switch (input) {
                            case 1 -> centralUnit3.restoreFire();
                            case 2 -> centralUnit7.restoreWindowOpen();
                            case 3 -> centralUnit10.restoreMovement();
                            case 4 -> System.out.println("------------------------");
                            default -> System.out.println("Unable to read input");
                        }

                    }
                    break;
                case 1:
                    System.out.println("------------------------");
                    System.out.println("Window detectors:");
                    centralUnit1.alarmOnWindowDetectors();centralUnit2.alarmOnWindowDetectors();
                    centralUnit3.alarmOnWindowDetectors();centralUnit4.alarmOnWindowDetectors();
                    centralUnit5.alarmOnWindowDetectors();centralUnit6.alarmOnWindowDetectors();
                    centralUnit7.alarmOnWindowDetectors();centralUnit8.alarmOnWindowDetectors();
                    centralUnit9.alarmOnWindowDetectors();
                    System.out.println("------------------------");
                    System.out.println("Door detectors:");
                    centralUnit6.alarmOnDoorDetectors();
                    centralUnit7.alarmOnDoorDetectors();centralUnit9.alarmOnDoorDetectors();
                    System.out.println("------------------------");
                    System.out.println("Movement detectors:");
                    centralUnit9.alarmOnMovementDetectors();centralUnit7.alarmOnMovementDetectors();
                    centralUnit10.alarmOnMovementDetectors();
                    System.out.println("------------------------");
                    break;
                case 2:
                    System.out.println("------------------------");
                    System.out.println("Window detectors:");
                    centralUnit1.alarmOffWindowDetectors();centralUnit2.alarmOffWindowDetectors();
                    centralUnit3.alarmOffWindowDetectors();centralUnit4.alarmOffWindowDetectors();
                    centralUnit5.alarmOffWindowDetectors();centralUnit6.alarmOffWindowDetectors();
                    centralUnit7.alarmOffWindowDetectors();centralUnit8.alarmOffWindowDetectors();
                    centralUnit9.alarmOffWindowDetectors();
                    System.out.println("------------------------");
                    System.out.println("Door detectors:");
                    centralUnit6.alarmOffDoorDetectors();
                    centralUnit7.alarmOffDoorDetectors();centralUnit9.alarmOffDoorDetectors();
                    System.out.println("------------------------");
                    System.out.println("Movement detectors:");
                    centralUnit9.alarmOffMovementDetectors();centralUnit7.alarmOffMovementDetectors();
                    centralUnit10.alarmOffMovementDetectors();
                    System.out.println("------------------------");
                    break;
                case 3:
                    centralUnit3.simulateFire();
                    break;
                case 4:
                    centralUnit7.simulateWindowOpen();
                    break;
                case 5:
                    centralUnit10.simulateMovement();
                    break;
                default:
                    System.out.println("Unable to read input");
                    break;


            }

        }















    }
}