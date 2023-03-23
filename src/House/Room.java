package House;

import Detectors.SmokeDetector;

public class Room {

    private int numberOfWindows;
    public Window window;



    public Door door;

    public Room() {
    }

    public Room(int numberOfWindows, Window window) {
        this.numberOfWindows = numberOfWindows;
        this.window = window;

    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }


}

