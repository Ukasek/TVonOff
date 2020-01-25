public class Televisor {
    boolean isOnOff;

    Televisor(boolean isOnOff) {
        isOnOff = true;
        isOnOff = false;
    }

    void turnOn() {
        isOnOff = true;
    }

    void turnOff() {
        isOnOff = false;
    }

    void showStatus() {
        System.out.println("Telewizor jest włączony: " + isOnOff);
    }
}
