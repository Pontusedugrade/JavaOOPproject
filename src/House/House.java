package House;

import Detectors.MovementDetector;
import Detectors.SmokeDetector;

public class House {

    private String name;

    public Room room;

    private SmokeDetector smokeDetector;

    private MovementDetector movementDetector;


    public House() {
    }

    public House(String name, Room room, SmokeDetector smokeDetector) {
        this.name = name;
        this.room = room;
        this.smokeDetector = smokeDetector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public MovementDetector getMovementDetector() {
        return movementDetector;
    }

    public void setMovementDetector(MovementDetector movementDetector) {
        this.movementDetector = movementDetector;
    }

    public SmokeDetector getSmokeDetector() {
        return smokeDetector;


    }

    public void setSmokeDetector(SmokeDetector smokeDetector) {
        this.smokeDetector = smokeDetector;
    }
}

