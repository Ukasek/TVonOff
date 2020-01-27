public class Televisor {
    boolean isOn;

    Televisor(boolean isOn) {

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
