package Detectors;

import AbstracClasses.Detector;

public class DoorDetector extends Detector {

    private boolean doorOpen;

    public DoorDetector(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public DoorDetector(String location, boolean setActive, boolean doorOpen) {
        super(location, setActive);
        this.doorOpen = doorOpen;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }
    public boolean isSetActive() {
        return setActive;
    }

    public void setSetActive(boolean setActive) {
        this.setActive = setActive;
    }

    @Override
    public String toString() {
        return "DoorDetector{" +
                "doorOpen=" + doorOpen +
                ", setActive=" + setActive +
                '}';
    }
}
