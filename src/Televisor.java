public class Televisor {
    boolean isOn;

    Televisor(boolean isOn) {
        isOn = false;
    }
    void turnOn() {
        isOn = true;
    }
    void turnOff() {
        isOn = false;
    }
    void showStatus() {
        System.out.println("Telewizor jest włączony: " + isOn);
    }
}
