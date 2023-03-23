package Detectors;

import AbstracClasses.Detector;

public class Sprinkler {

    private boolean sprinklerActivated;


    public Sprinkler() {
    }

    public Sprinkler(boolean sprinklerActivated) {
        this.sprinklerActivated = sprinklerActivated;
    }



    public boolean isSprinklerActivated() {
        return sprinklerActivated;
    }

    public void setSprinklerActivated(boolean sprinklerActivated) {
        this.sprinklerActivated = sprinklerActivated;
    }

    @Override
    public String toString() {
        return "Sprinkler{" +
                "sprinklerActivated=" + sprinklerActivated +
                '}';
    }
}
