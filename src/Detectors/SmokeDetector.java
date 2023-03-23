package Detectors;

import AbstracClasses.Detector;

public class SmokeDetector extends Detector {

    private boolean smokeDetected;
    private Sprinkler sprinkler;


    public SmokeDetector(boolean smokeDetected) {
        this.smokeDetected = smokeDetected;
    }

    public SmokeDetector(String location, boolean setActive, boolean smokeDetected, Sprinkler sprinkler) {
        super(location, setActive);
        this.smokeDetected = smokeDetected;
        this.sprinkler = sprinkler;
    }

    public void smokeDetected(){
        setSmokeDetected(true);
        sprinkler.setSprinklerActivated(true);
    }

    public boolean isSmokeDetected() {
        return smokeDetected;
    }

    public void setSmokeDetected(boolean smokeDetected) {
        this.smokeDetected = smokeDetected;
    }

    @Override
    public String toString() {
        return "SmokeDetector{" +
                "smokeDetected=" + smokeDetected +
                ", setActive=" + setActive +
                '}';
    }
}
