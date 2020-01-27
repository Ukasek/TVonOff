public class Televisor {
    boolean isOn;

    Televisor(boolean On) {
        isOn = On;
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
