package Detectors;

import AbstracClasses.Detector;

public class WindowDetector extends Detector {


    private boolean windowOpen;
    private boolean windowBroken;


    public WindowDetector(boolean windowOpen, boolean windowBroken) {
        this.windowOpen = windowOpen;
        this.windowBroken = windowBroken;
    }

    public WindowDetector(String location, boolean setActive, boolean windowOpen, boolean windowBroken) {
        super(location, setActive);
        this.windowOpen = windowOpen;
        this.windowBroken = windowBroken;
    }



    public boolean isSetActive() {
        return setActive;
    }

    public void setSetActive(boolean setActive) {
        this.setActive = setActive;
    }

    public boolean isWindowOpen() {
        return windowOpen;
    }

    public void setWindowOpen(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }

    public boolean isWindowBroken() {
        return windowBroken;
    }

    public void setWindowBroken(boolean windowBroken) {
        this.windowBroken = windowBroken;
    }


    @Override
    public String toString() {
        return "Detectors.WindowDetector{" +
                "setActive=" + setActive +
                ", windowOpen=" + windowOpen +
                ", windowBroken=" + windowBroken +
                '}';
    }
}
