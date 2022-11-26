package at.fhtw.lpa;

public class Max2000 extends Roboter implements SpeekingRoboter, MusikRoboter{
    public Max2000() {
    }

    public Max2000(String name, int weight, int stepLength) {
        super(name, weight, stepLength);
    }

    @Override
    public void playMusik() {
        System.out.println("lalala");
    }

    @Override
    public void speek(String str) {
        System.out.println(str);
    }

    @Override
    protected String getRoboterType() {
        return "Max2000";
    }
}
