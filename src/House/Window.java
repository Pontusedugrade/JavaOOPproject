package House;


import Detectors.WindowDetector;

public class Window {

    private String windowName;

    public WindowDetector windowDetector;


    public Window() {
    }

    public Window(String windowName, WindowDetector windowDetector) {
        this.windowName = windowName;
        this.windowDetector = windowDetector;
    }

    public String getWindowName() {
        return windowName;
    }

    public void setWindowName(String windowName) {
        this.windowName = windowName;
    }

    public WindowDetector getWindowDetector() {
        return windowDetector;
    }

    public void setWindowDetector(WindowDetector windowDetector) {
        this.windowDetector = windowDetector;
    }

    @Override
    public String toString() {
        return "Window{" +
                "windowName='" + windowName + '\'' +
                ", windowDetector=" + windowDetector +
                '}';
    }
}
