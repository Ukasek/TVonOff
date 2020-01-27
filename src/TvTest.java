public class TvTest {
    public static void main(String[] args) {

        Televisor tv1 = new Televisor(false);
        tv1.showStatus();
        tv1.turnOn();
        tv1.showStatus();
        tv1.turnOff();
        tv1.showStatus();

    }
}
