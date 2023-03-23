package House;

import Detectors.DoorDetector;

public class Door {

    private String name;

    public DoorDetector doorDetector;

    public Door() {
    }

    public Door(String name, DoorDetector doorDetector) {
        this.name = name;
        this.doorDetector = doorDetector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DoorDetector getDoorDetector() {
        return doorDetector;
    }

    public void setDoorDetector(DoorDetector doorDetector) {
        this.doorDetector = doorDetector;
    }

    @Override
    public String toString() {
        return "Door{" +
                "name='" + name + '\'' +
                ", doorDetector=" + doorDetector +
                '}';
    }
}
