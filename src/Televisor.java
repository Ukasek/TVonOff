public class Televisor {
    boolean isOn;

    Televisor(boolean on) {
        isOn = on;
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
