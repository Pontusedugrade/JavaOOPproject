package AbstracClasses;

public abstract class Detector {

    protected String location;
    protected boolean setActive;

    public Detector() {
    }

    public Detector(String location, boolean setActive) {
        this.location = location;
        this.setActive = setActive;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isSetActive() {
        return setActive;
    }

    public void setSetActive(boolean setActive) {
        this.setActive = setActive;
    }
}
