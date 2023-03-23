import Detectors.*;

public class CentralUnit {

    private boolean alarmOn;
    private boolean alarmRestored;

    private WindowDetector windowDetector;

    private DoorDetector doorDetector;

    private SmokeDetector smokeDetector;

    private MovementDetector movementDetector;

    public CentralUnit() {
    }

    public CentralUnit(boolean alarmOn, boolean alarmRestored, WindowDetector windowDetector, SmokeDetector smokeDetector) {
        this.alarmOn = alarmOn;
        this.alarmRestored = alarmRestored;
        this.windowDetector = windowDetector;
        this.smokeDetector = smokeDetector;
    }

    public void alarmOnWindowDetectors(){
        setAlarmOn(true);
        getWindowDetector().setSetActive(true);
        System.out.println(windowDetector.getLocation() + " is active: " + windowDetector.isSetActive());
    }

    public void alarmOnDoorDetectors(){
        setAlarmOn(true);
        getDoorDetector().setSetActive(true);
        System.out.println(doorDetector.getLocation() + " is active: " + doorDetector.isSetActive());
    }

    public void alarmOnMovementDetectors(){
        setAlarmOn(true);
        getMovementDetector().setSetActive(true);
        System.out.println(movementDetector.getLocation() + " is active: " + movementDetector.isSetActive());
    }

    public void alarmOffWindowDetectors(){
        setAlarmOn(false);
        getWindowDetector().setSetActive(false);
        System.out.println(windowDetector.getLocation() + " is active: " + windowDetector.isSetActive());
    }

    public void alarmOffDoorDetectors(){
        setAlarmOn(false);
        getDoorDetector().setSetActive(false);
        System.out.println(doorDetector.getLocation() + " is active: " + doorDetector.isSetActive());
    }

    public void alarmOffMovementDetectors(){
        setAlarmOn(false);
        getMovementDetector().setSetActive(false);
        System.out.println(movementDetector.getLocation() + " is active: " + movementDetector.isSetActive());
    }

    public void simulateWindowOpen(){
        getWindowDetector().setWindowOpen(true);
        System.out.println("Window open in: " + windowDetector.getLocation());
        System.out.println("Is window open: " + getWindowDetector().isWindowOpen());
        soundAlarmSirens();
    }
    public void simulateFire(){
        getSmokeDetector().smokeDetected();
        System.out.println("Smoke detected in: " + smokeDetector.getLocation());
        System.out.println("Is smoke detected : " + getSmokeDetector().isSmokeDetected());
        soundAlarmSirens();
    }
    public void simulateMovement(){
        getMovementDetector().setMovementDetected(true);
        System.out.println("Movement detected in: " + movementDetector.getLocation());
        soundAlarmSirens();
    }

    public void restoreWindowOpen(){
        getWindowDetector().setWindowOpen(false);
        System.out.println("Is window open: " + getWindowDetector().isWindowOpen());
    }
    public void restoreFire(){
        getSmokeDetector().setSmokeDetected(false);
        System.out.println("Is smoke detected: " + getSmokeDetector().isSmokeDetected());
    }
    public void restoreMovement(){
        getMovementDetector().setMovementDetected(false);
        System.out.println("Is movement detected: " + getMovementDetector().isMovementDetected());
    }

    public void soundAlarmSirens(){
        System.out.println("ALARM ALARM ALARM");
    }

    public void alarmOff(){
        getWindowDetector().setSetActive(false);
    }


    public boolean isAlarmOn() {
        return alarmOn;
    }

    public void setAlarmOn(boolean alarmOn) {
        this.alarmOn = alarmOn;
    }

    public boolean isAlarmRestored() {
        return alarmRestored;
    }

    public void setAlarmRestored(boolean alarmRestored) {
        this.alarmRestored = alarmRestored;
    }

    public WindowDetector getWindowDetector() {
        return windowDetector;
    }

    public void setWindowDetector(WindowDetector windowDetector) {
        this.windowDetector = windowDetector;
    }

    public DoorDetector getDoorDetector() {
        return doorDetector;
    }

    public void setDoorDetector(DoorDetector doorDetector) {
        this.doorDetector = doorDetector;
    }

    public SmokeDetector getSmokeDetector() {
        return smokeDetector;
    }

    public void setSmokeDetector(SmokeDetector smokeDetector) {
        this.smokeDetector = smokeDetector;
    }

    public MovementDetector getMovementDetector() {
        return movementDetector;
    }

    public void setMovementDetector(MovementDetector movementDetector) {
        this.movementDetector = movementDetector;
    }

    @Override
    public String toString() {
        return "CentralUnit{" +
                "alarmOn=" + alarmOn +
                ", alarmRestored=" + alarmRestored +
                ", windowDetector=" + windowDetector +
                '}';
    }
}
