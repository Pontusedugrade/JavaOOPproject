package Detectors;

import AbstracClasses.Detector;

public class MovementDetector extends Detector {

    private boolean movementDetected;

    public MovementDetector(boolean movementDetected) {
        this.movementDetected = movementDetected;
    }

    public MovementDetector(String location, boolean setActive, boolean movementDetected) {
        super(location, setActive);
        this.movementDetected = movementDetected;
    }

    public boolean isMovementDetected() {
        return movementDetected;
    }

    public void setMovementDetected(boolean movementDetected) {
        this.movementDetected = movementDetected;
    }

    @Override
    public String toString() {
        return "MovementDetector{" +
                "movementDetected=" + movementDetected +
                ", setActive=" + setActive +
                '}';
    }
}
